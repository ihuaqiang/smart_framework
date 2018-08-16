package com.ihuaqiang.smart_framework.CGLibProxy;

import com.ihuaqiang.smart_framework.proxy.HelloImpl;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2018/8/16
 */
public class CGLibProxyTest {

    public static void main(String args[]){
        CGLibProxy cgLibProxy=new CGLibProxy();
        HelloImpl proxy = cgLibProxy.getProxy(HelloImpl.class);
        proxy.say("ihuaqiang");

    }



}
