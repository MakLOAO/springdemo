package com.mkl.beanannotation.javabased;

public class StringStore implements Store<String> {

    public void init() {
        System.out.println("init Store");
    }

    public void destroy() {
        System.out.println("destroy Store");
    }
}
