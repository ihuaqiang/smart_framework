package com.ihuaqiang.smart_framework.dynamicproxy;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2018/8/16
 */
public class DynamicTest {

    public static void main(String args[]) {

        BookFacadeImpl bookFacadeImpl = new BookFacadeImpl();

        DynamicProxy proxy = new DynamicProxy();

        BookFacade bookFacade = (BookFacade) proxy.bind(bookFacadeImpl);

        bookFacade.add("ihuaqiang");
    }
}
