package com.imooc.ioc.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jany.nie on 2018/10/11.
 */
public class SpringDemo1 {

    @Test
    /*
    * 传统开发方式
    *
    * */
    public void demo1(){
        userService sre=new userServimipl();
        sre.sayHello();
    }

    @Test
    public void demo2(){
        //使用spring工厂
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //使用工厂获得类
        userService us=(userService) applicationContext.getBean("userService");
        us.sayHello();
    }
    @Test
    public void demo3(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        food fd=(food) applicationContext.getBean("food");
        String result = fd.runStart();

        System.out.println(result);
    }
}
