package com.imooc.aop.demo2;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/10/15 0015.
 */
public class MyCgLibProxy implements MethodInterceptor {
    private ProductionDao productionDao;
    public MyCgLibProxy(ProductionDao productionDao){
        this.productionDao=productionDao;
    }
    public Object createProxy(){
        //1.创建核心类
        Enhancer enhancer=new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(productionDao.getClass());
        //3.设置回调
        enhancer.setCallback(this);
        //4.生产代理
        Object proxy=enhancer.create();
        return  proxy;
    }


    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
       if("save".equals(method.getName())){
           System.out.println("权限效验-----------");
       }

        return methodProxy.invokeSuper(proxy,args);
    }
}
