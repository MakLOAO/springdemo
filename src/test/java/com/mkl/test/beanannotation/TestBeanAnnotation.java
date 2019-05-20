package com.mkl.test.beanannotation;

import com.mkl.beanannotation.BeanAnnotation;
import com.mkl.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAnnotation extends UnitTestBase {

    public TestBeanAnnotation() {
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void testSay() {
        BeanAnnotation bean = super.getBean("bean");
        bean.say("This is a test");
    }

    @Test
    public void testScope() {
        BeanAnnotation bean = super.getBean("bean");
        bean.myHashCode();

        BeanAnnotation bean2 = super.getBean("bean");
        bean2.myHashCode();
    }
}