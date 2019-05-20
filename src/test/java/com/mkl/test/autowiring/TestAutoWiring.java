package com.mkl.test.autowiring;

import com.mkl.autowiring.AutoWiringService;
import com.mkl.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutoWiring extends UnitTestBase {

/**
 * @program: demo
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-05-14 20:04
 **/
    public TestAutoWiring() {
        super("classpath:spring-autowiring.xml");
    }

    @Test
    public void testSay() {
        AutoWiringService service = super.getBean("autoWiringService");
        service.say("this is a test");
    }
}
