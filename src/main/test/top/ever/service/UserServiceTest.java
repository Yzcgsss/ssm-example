package top.ever.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.ever.service.UserService;



/**
 * @Author : Hua_zx
 * @Date : 2022/4/1 11:36
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void getAll() {
        System.out.println(userService.findAll());
        System.out.println(userService.findAll());
    }
}