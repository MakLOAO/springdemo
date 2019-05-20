package com.mkl.test.lifecycle;

import com.mkl.lifecycle.BeanLifeCycle;
import com.mkl.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanLifeCycle extends UnitTestBase {

/**
 * @program: demo
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-05-14 09:57
 **/
    public TestBeanLifeCycle() {
        super("classpath:spring-lifecycle.xml");
    }

    @Test
    public void test1() {
        BeanLifeCycle beanLifeCycle = super.getBean("beanCycle");

    }
}
