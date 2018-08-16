package com.ihuaqiang.smart_framework.proxy;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2018/8/16
 */
public class ProxyTest {
    
    public static void main(String args[]){
        Hello helloProxy=new HelloProxy();

        helloProxy.say("ihuaqiang");
    }
}
