package com.imooc.aop.demo3;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by jany.nie on 2018/10/19.
 */
public class MyAdvice implements MethodBeforeAdvice,AfterReturningAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("------这是前置通知类型---------");
    }

    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("------这是后置类型---------");
    }
}
