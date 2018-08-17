package com.ihuaqiang.smart_framework.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2018/8/16
 */
public class DynamicProxy implements InvocationHandler {


    private Object target;  //被代理的目标对象

    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
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
