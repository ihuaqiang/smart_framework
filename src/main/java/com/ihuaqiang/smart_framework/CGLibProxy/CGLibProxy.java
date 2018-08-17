package com.ihuaqiang.smart_framework.CGLibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2018/8/16
 */
public class CGLibProxy implements MethodInterceptor {

    private Object target;  ////业务类对象，供代理方法中进行真正的业务方法调用


    //相当于JDK动态代理中的绑定
    public Object getInstance(Object target) {
        this.target = target; //给业务对象赋值
        Enhancer enhancer = new Enhancer(); //创建加强器，用来创建动态代理类
        enhancer.setCallback(this);  //设置回调：对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法进行拦
        enhancer.setSuperclass(this.target.getClass());   //为加强器指定要代理的业务类（即：为下面生成的代理类指定父类）
        return enhancer.create();   // 创建动态代理类对象并返回
    }


    // 实现回调方法

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o, objects);  //调用业务类（父类中）的方法
        after();
        return result;
    }


    private void before() {
        System.out.println("Before");
    }


    private void after() {
        System.out.println("After");

    }
}
