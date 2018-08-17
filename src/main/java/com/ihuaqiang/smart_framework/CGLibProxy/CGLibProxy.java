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

    private Object target;


    public Object getInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(this);
        enhancer.setSuperclass(this.target.getClass());
        return enhancer.create();
    }



    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o, objects);
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
