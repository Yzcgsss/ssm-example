package top.ever.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.ever.entity.User;
import top.ever.mapper.UserMapper;
import top.ever.service.UserService;


import java.util.List;

/**
 * @Author : Hua_zx
 * @Date : 2022/4/1 11:26
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
