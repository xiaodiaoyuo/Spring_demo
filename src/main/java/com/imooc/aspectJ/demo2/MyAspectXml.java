package com.imooc.aspectJ.demo2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.TreeMap;

public class MyAspectXml {
    //前置通知
    public void beforeMethod(JoinPoint joinPoint){
        System.out.println("xml方式的前置通知======="+joinPoint);
    }
    //后置通知
    public Object afterReturning(Object result){

        System.out.println("xml方式的后置通知======="+result);
        return result;
    }
    //环绕通知
    public void around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("xml环绕通知前=======");
        Object obj=joinPoint.proceed();
        System.out.println("xml环绕通知后=======");

    }
    public void afterThrowing(Throwable e){
        System.out.println("异常抛出通知----throwing---"+e);
    }
public  void after(){
    System.out.println("配置最终通知------");
}
}
