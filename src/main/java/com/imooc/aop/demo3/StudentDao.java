package com.imooc.aop.demo3;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by jany.nie on 2018/10/19.
 */
public class StudentDao {
    public void find(){
        System.out.println("查找========");
    }
    public void save(){
        System.out.println("保存=========");
    }
    public void delete(){
        System.out.println("删除=========");
    }
    public void update(){
        System.out.println("更新=============");
    }
}
