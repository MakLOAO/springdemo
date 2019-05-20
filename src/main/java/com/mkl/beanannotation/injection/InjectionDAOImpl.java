package com.mkl.beanannotation.injection;

import org.springframework.stereotype.Repository;

@Repository
public class InjectionDAOImpl implements InjectionDAO {

    public void save(String args) {
        System.out.println("保存数据：" + args);
    }
}
