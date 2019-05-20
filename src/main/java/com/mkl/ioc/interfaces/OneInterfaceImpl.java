package com.mkl.ioc.interfaces;

public class OneInterfaceImpl implements OneInterface {

/**
 * @program: demo
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-05-13 16:22
 **/
    @Override
    public String hello(String word) {
        return "Word from interface \"OneInterface\":" + word;
    }
}
