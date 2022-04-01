package top.ever.service;

import top.ever.entity.User;

import java.util.List;

/**
 * UserService接口用来声明关于User的业务方法
 * @Author : Hua_zx
 * @Date : 2022/4/1 11:25
 */
public interface UserService {

    /**
     * 查询出所有的User对象
     * @return User对象集合
     */
    List<User> findAll();
}
