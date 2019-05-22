package com.mkl.test.aop.aspectj;

import com.mkl.aop.aspectj.biz.MoocBiz;
import com.mkl.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAspectJ extends UnitTestBase {

    public TestAspectJ() {
        super("classpath:spring-aop-aspectj.xml");
    }

    @Test
    public void test() {
        MoocBiz biz = super.getBean("moocBiz");
        biz.save("This is test");
    }
}
