package com.imooc.ioc.demo1;

/**
 * Created by jany.nie on 2018/10/11.
 */
public class Foodimpl implements food{

    private String name;
    private String taste;
    private String kind;




    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public String toString(){
        return this.getName()+"属于"+this.getKind()+",口味"+this.getTaste();
    }
    public String runStart(){
        return  this.toString();
    }



}
