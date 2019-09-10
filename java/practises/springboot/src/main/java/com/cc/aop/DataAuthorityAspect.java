package com.cc.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;

/**
 * @ClassName DataAuthorityAspect
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/1/14 17:10
 **/
@Aspect
@Configuration
public class DataAuthorityAspect {

    @Pointcut("@annotation(com.cc.aop.AuthorityAnnotation)")
    public void DataAuthority(){

    }

    @Before("DataAuthority()")
    public void before(JoinPoint joinPoint){
        MethodSignature args = (MethodSignature) joinPoint.getSignature();
        Method method = args.getMethod();
        AuthorityAnnotation authority = method.getAnnotation(AuthorityAnnotation.class);
        System.out.println(method.getName());
        System.out.println(authority.source());
        System.out.println(authority.interfaceName());
    }
}
