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


    private Object target;  //业务类实现对象，用来调用具体的业务方法


    /*
     * 绑定业务对象并返回一个代理类
     * @param target
     * @return
     */

    public Object bind(Object target) {
        this.target = target;  //接收业务实现类对象参数


        //通过反射机制，创建一个代理类对象实例并返回。用户进行方法调用时使用。
        //创建代理类对象时，需要传递改业务类的类加载器（用来获取业务实现类的元数据，在包装方法是调用真正的业务方法）
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }


    /**
     * 包装调用方法：进行预处理，调用后处理
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        //调用真正的业务方法
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
