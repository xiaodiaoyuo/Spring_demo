package com.imooc.aspectJ.demo2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class CustomerDaoImp implements CustomerDao {
    public String save() {
        System.out.println("save================");
        return "string============retuen save ";
    }


    public String update() {
        System.out.println("update================");
        return  "spring demo";
    }

    public void find() {
        int i=1/0;
        System.out.println("find================");
    }

    public void delete() {
        System.out.println("delete================");
    }
    public void check(){
        System.out.println("check===========");
    }

}
