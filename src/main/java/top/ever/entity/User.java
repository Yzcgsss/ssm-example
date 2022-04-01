package top.ever.entity;

import lombok.Data;



import java.io.Serializable;

/**
 * @Author : Hua_zx
 * @Date : 2022/4/1 10:48
 */
// @NoArgsConstructor注解，自动生成一个无参数的构造方法
// @AllArgsConstructor注解，自动生成一个包含所有参数的构造方法
// @Data注解，自动生成Getter、Setter、toString方法
@Data
public class User implements Serializable {
    private Long id;
    private String name;
    private String password;
}
