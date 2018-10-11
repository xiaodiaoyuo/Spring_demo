package com.imooc.aop.demo1;

/**
 * Created by jany.nie on 2018/10/11.
 */
public class UserDaoImp implements UserDao{
    public void save() {
        System.out.println("保存操作==========");
    }

    public void update() {
        System.out.println("更新操作==========");
    }

    public void delete() {
        System.out.println("删除操作==========");
    }

    public void find() {
        System.out.println("查找操作==========");
    }
}
