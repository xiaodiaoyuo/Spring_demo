package com.imooc.aop.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by jany.nie on 2018/10/11.
 */
public class MyJdkProxy implements InvocationHandler {
    UserDao userDao;


    public  MyJdkProxy(UserDao userDao){
    this.userDao=userDao;
    }
    public Object createProxy(){
        Object proxy= Proxy.newProxyInstance(userDao.getClass().getClassLoader(),userDao.getClass().getInterfaces(),this);
    return  proxy;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      if("save".equals(method.getName())){
          System.out.println("======权限效验===========");
      }
        return method.invoke(userDao,args);
    }
}
