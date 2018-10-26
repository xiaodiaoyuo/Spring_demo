package com.imooc.aop.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

/**
 * Created by jany.nie on 2018/10/22.
 */
public class Test_demo3 {
    ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
    StudentDao studentService = (StudentDao) context.getBean("studentDaoProxy");

}
