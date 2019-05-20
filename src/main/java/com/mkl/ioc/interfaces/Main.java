package com.mkl.ioc.interfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

/**
 * @program: demo
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-05-13 16:23
 **/
    public static void main(String[] args) {
        OneInterface oif = new OneInterfaceImpl();

        System.out.println(oif.hello("asd"));
    }
}
