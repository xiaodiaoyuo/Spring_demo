package com.imooc.aop.demo1;

import org.junit.Test;

import javax.rmi.PortableRemoteObject;

/**
 * Created by jany.nie on 2018/10/11.
 */
public class SpringDemo2 {

    @Test
    public  void demo1(){
        UserDao us=new UserDaoImp();
        us.save();
        us.delete();
        us.find();
        us.update();

    }
    @Test
    public  void demo2(){
        UserDao userDao=new UserDaoImp();
      UserDao proxy=(UserDao) new MyJdkProxy(userDao).createProxy();
        proxy.update();
        proxy.save();
        proxy.delete();
        proxy.find();

    }


}
