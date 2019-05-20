package com.mkl.test.ioc.interfaces;

import com.mkl.ioc.injection.InjectionService;
import com.mkl.ioc.interfaces.OneInterface;
import com.mkl.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {

/**
 * @program: demo
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-05-13 10:19
 **/
    public TestOneInterface() {
        super("classpath*:spring-ioc.xml");
    }

    @Test
    public void testHello() {
        OneInterface oneInterface = super.getBean("oneInterface");
        System.out.println(oneInterface.hello("我的输入参数"));
    }

    @Test
    public void testInjection() {
        InjectionService service = super.getBean("injectionService");
        service.save("mkl");
    }

}
