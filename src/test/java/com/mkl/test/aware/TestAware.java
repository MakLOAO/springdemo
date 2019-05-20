package com.mkl.test.aware;

import com.mkl.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAware extends UnitTestBase {

/**
 * @program: demo
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-05-14 19:29
 **/
    public TestAware() {
        super("classpath:spring-aware.xml");
    }

    @Test
    public void testMoocApplicationContext() { }

    @Test
    public void testMoocBeanName() {
        System.out.println("testMoocBeanName" + super.getBean("moocBeanName").hashCode());
    }
}
