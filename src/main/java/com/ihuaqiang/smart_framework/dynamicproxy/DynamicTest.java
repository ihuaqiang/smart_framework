package com.ihuaqiang.smart_framework.dynamicproxy;

import com.ihuaqiang.smart_framework.proxy.Hello;
import com.ihuaqiang.smart_framework.proxy.HelloImpl;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2018/8/16
 */
public class DynamicTest {
    
    public static void main(String args[]){
        Hello hello=new HelloImpl();

        DynamicProxy proxy=new DynamicProxy(hello);

        Hello helloProxy = proxy.getProxy();

        helloProxy.say("ihuaqiang");
    }
}
