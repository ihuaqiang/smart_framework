package com.ihuaqiang.smart_framework.proxy;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2018/8/16
 */
public class HelloProxy implements Hello {


    private Hello hello;

    public HelloProxy() {
        hello = new HelloImpl();
    }

    @Override
    public void say(String name) {
        before();
        System.out.println("hello!" + name);
        after();
    }


    private void before() {
        System.out.println("Before");
    }


    private void after() {
        System.out.println("After");

    }

}
