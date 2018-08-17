package com.ihuaqiang.smart_framework.CGLibProxy;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2018/8/16
 */
public class CGLibProxyTest {

    public static void main(String args[]){
        BookFacadeImpl bookFacade=new BookFacadeImpl();
        CGLibProxy cgLibProxy=new CGLibProxy();
        BookFacadeImpl bookFacadeCglib = (BookFacadeImpl) cgLibProxy.getInstance(bookFacade);
        bookFacadeCglib.addBook("ihuaqiang");

    }



}
