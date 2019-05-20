package com.mkl.test.bean;

import com.mkl.bean.BeanScope;
import com.mkl.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope extends UnitTestBase {

/**
 * @program: demo
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-05-14 09:34
 **/
    public TestBeanScope() {
        super("classpath*:spring-beanscope.xml");
    }

    @Test
    public void testSay() {
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();
        BeanScope beanScope2 = super.getBean("beanScope");
        beanScope2.say();
    }

    @Test
    public void testSay1() {
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();
    }
}
