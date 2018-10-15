package com.imooc.aop.demo2;

import org.junit.Test;

/**
 * Created by Administrator on 2018/10/15 0015.
 */
public class Spring_Demo {

    @Test
    public void Demo1Test(){
        ProductionDao dao=new ProductionDao();
        ProductionDao proxy=(ProductionDao) new MyCgLibProxy(dao).createProxy();
        proxy.save();
        proxy.update();
        proxy.delete();
        proxy.find();
    }



}
