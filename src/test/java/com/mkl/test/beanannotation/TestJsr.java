package com.mkl.test.beanannotation;

import com.mkl.beanannotation.jsr.JsrService;
import com.mkl.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestJsr extends UnitTestBase {

    public TestJsr() {
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void testSave() {
        JsrService service = super.getBean("jsrService");
        service.save();
    }
}
