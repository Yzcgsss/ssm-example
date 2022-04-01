package top.ever.mapper;

import org.springframework.stereotype.Repository;
import top.ever.entity.User;

import java.util.List;

/**
 * UserMapper接口专门用来声明各种数据库操作方法
 * @Author : Hua_zx
 * @Date : 2022/4/1 11:25
 */
//@Repository注解将其定义为Spring所管理的Bean
@Repository
public interface UserMapper {
    /**
     * 查询所有User对象
     * @return User对象集合
     */
    List<User> findAll();
}
