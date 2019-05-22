package com.mkl.beanannotation.multibean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class BeanInvoker {
    @Autowired
    private List<BeanInterface> list;

    @Autowired
    private Map<String, BeanInterface> map;

    @Autowired
    @Qualifier("beanImplOne")
    private BeanInterface beanInterface;

    public void say() {
        if (null != list && 0 != list.size()) {
            System.out.println("list...");
            for (BeanInterface bean : list) {
                System.out.println(bean.getClass().getName());
            }
        } else {
            System.out.println("list null");
        }

        if (null != map && 0 != map.size()) {
            System.out.println("map...");
            for (Map.Entry<String, BeanInterface> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue().getClass().getName());
            }
        } else {
            System.out.println("map null");
        }

        System.out.println();
        if (null != beanInterface)
            System.out.println(beanInterface.getClass().getName());
        else System.out.println("beanInterface null");
    }
}