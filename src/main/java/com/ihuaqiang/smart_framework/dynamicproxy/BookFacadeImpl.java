package com.ihuaqiang.smart_framework.dynamicproxy;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2018/8/17
 */
public class BookFacadeImpl implements BookFacade {


    @Override
    public void add(String bookName) {
        System.out.println("addBook....." + bookName);
    }
}
