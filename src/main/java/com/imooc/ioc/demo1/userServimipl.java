package com.imooc.ioc.demo1;

/**
 * Created by jany.nie on 2018/10/11.
 */
public class userServimipl implements userService {


    private String idno;
    private String name;

    public void sayHello() {
        System.out.println("sayhello=============");
    }




    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getIdno() {
        return idno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
