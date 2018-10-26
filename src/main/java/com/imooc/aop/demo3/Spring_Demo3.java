package com.imooc.aop.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by jany.nie on 2018/10/19.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Spring_Demo3 {
    //@Resource(name="studentDao")
    @Resource(name="studentDaoProxy")
    private StudentDao studentDao;
    @Test
    public void demo1(){
        studentDao.delete();
        studentDao.find();
        studentDao.update();
        studentDao.save();

    }




}
