package com.imooc.aop.demo3;

/**
 * Created by jany.nie on 2018/10/19.
 */
public class StudentDaoImp implements StudentDao {
    public void find() {
        System.out.println("find===============");
    }

    public void update() {
        System.out.println("update==============");
    }

    public void delete() {
        System.out.println("delete==============");
    }

    public void save() {
        System.out.println("save===============");
    }
}
