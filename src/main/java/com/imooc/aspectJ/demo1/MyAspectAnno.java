package com.imooc.aspectJ.demo1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/*
* 切面类
* */
@Aspect
public class MyAspectAnno {
    //前置通知
    @Before(value="execution(* com.imooc.aspectJ.demo1.ProductDao.*(..)))")
    public void before(JoinPoint joinPoint){
        System.out.println("=========前置通知=================="+joinPoint);
    }

    //后置通知，通过returning获取返回值
    @AfterReturning(value="execution(* com.imooc.aspectJ.demo1.ProductDao.*(..)))",returning = "result")
    public void afterReturning(Object result){
        System.out.println("=========后置通知=================="+result);
    }

    @Around(value="execution(* com.imooc.aspectJ.demo1.ProductDao.delete(..)))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        //如果不调用joinPoint.proceed()，那么目标被拦截
       Object obj=joinPoint.proceed();
        return  obj;
    }

    @AfterThrowing(value="execution(* com.imooc.aspectJ.demo1.ProductDao.*(..)))",throwing="e" )
    public void afterThrowing(Throwable e){
        System.out.println("抛出异常========"+e.getMessage());
    }

    //无论是否出现异常，最终执行
    @After(value="execution(* com.imooc.aspectJ.demo1.ProductDao.*(..)))")
public void after(){
        System.out.println("最终通知============");
    }
}
