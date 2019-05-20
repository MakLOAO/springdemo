package com.mkl.test.beanannotation;

import com.mkl.beanannotation.javabased.*;
import com.mkl.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestJavabased extends UnitTestBase {

/**
 * @program: demo
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-05-20 10:04
 **/
    public TestJavabased() {
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void test() {
        Store store = super.getBean("stringStore");
        System.out.println(store.getClass().getName());
    }

    @Test
    public void testMyDriverManager() {
        MyDriverManager myDriverManager = super.getBean("myDriverManager");
        System.out.println(myDriverManager.getClass().getName());
    }

    @Test
    public void testG() {
        TestStore store = super.getBean("GenericTestStore");
    }
}
