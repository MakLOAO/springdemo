package com.mkl.test.resource;

import com.mkl.resource.MoocResource;
import com.mkl.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.io.IOException;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestResource extends UnitTestBase {

/**
 * @program: demo
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-05-14 21:24
 **/
    public TestResource() {
        super("classpath:spring-resource.xml");
    }

    @Test
    public void testResource() {
        MoocResource resource = super.getBean("moocResource");
        try {
            resource.resource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
