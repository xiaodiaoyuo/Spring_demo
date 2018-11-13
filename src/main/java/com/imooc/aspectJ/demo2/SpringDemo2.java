package com.imooc.aspectJ.demo2;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext_2.xml")
public class SpringDemo2 {

    @Resource(name="customerDao")
    private CustomerDao  customerDao;

    @Test
    public void Demo1() {
        customerDao.delete();
        customerDao.save();
        customerDao.find();
        customerDao.update();
        customerDao.check();

    }
}
