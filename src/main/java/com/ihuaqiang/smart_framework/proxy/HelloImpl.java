package com.ihuaqiang.smart_framework.proxy;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2018/8/16
 */
public class HelloImpl implements Hello {
    @Override
    public void say(String name) {
        System.out.println("hello!" + name);
    }
}
