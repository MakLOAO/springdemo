package com.mkl.test.beanannotation;

import com.mkl.beanannotation.injection.InjectionService;
import com.mkl.beanannotation.multibean.BeanInvoker;
import com.mkl.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {

/**
 * @program: demo
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-05-17 08:30
 **/
    public TestInjection() {
        super("classpath:spring-beanannotation.xml");
    }

    @Test
    public void TestAutowired() {
        InjectionService service = super.getBean("injectionServiceImpl");
        service.save("This is autowired");
    }

    @Test
    public void testMultiBean() {
        BeanInvoker invoker = super.getBean("beanInvoker");
        invoker.say();
    }
}