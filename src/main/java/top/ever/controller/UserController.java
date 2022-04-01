package top.ever.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.ever.entity.User;
import top.ever.service.UserService;

import java.util.List;

/**
 * @Author : Hua_zx
 * @Date : 2022/4/1 12:59
 */
@Controller
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public String findAll(Model model){
        model.addAttribute("userList",userService.findAll());
        return "index";
    }

    @GetMapping("/getJson")
    @ResponseBody
    public List<User> getList(){
        return userService.findAll();
    }
}
