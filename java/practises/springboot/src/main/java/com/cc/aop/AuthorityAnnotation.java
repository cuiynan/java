package com.cc.aop;

import java.lang.annotation.*;

/**
 * @ClassName
 * @Description 暂时没有深入，使用场景：
 *  对某一用户，某一权限进行过滤，用于判断 此用户是否有本路径的访问权限。
 *  写AOP对这个接口进行与数据库的过滤。
 * @AUTHOR cuiyingnan
 * @DATE 2019/1/14 15:53
 **/
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthorityAnnotation {
    String source() default  "";
   String interfaceName() default  "";
}
