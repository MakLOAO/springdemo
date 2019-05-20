package com.mkl.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.annotation.Order;

public class BeanLifeCycle implements InitializingBean, DisposableBean  {

/**
 * @program: demo
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-05-14 09:57
 **/
    public void start() {
        System.out.println("bean start");
    }

    public void stop() {
        System.out.println("bean stop");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("bean afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("bean destroy");
    }
}
