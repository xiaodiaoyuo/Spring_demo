package com.imooc.aop.demo2;

/**
 * Created by Administrator on 2018/10/15 0015.
 */
public class ProductionDao {
    public void save() {
        System.out.println("保存produciton操作==========");
    }

    public void update() {
        System.out.println("更新produciton操作==========");
    }

    public void delete() {
        System.out.println("删除produciton操作==========");
    }

    public void find() {
        System.out.println("查找produciton操作==========");
    }
}
