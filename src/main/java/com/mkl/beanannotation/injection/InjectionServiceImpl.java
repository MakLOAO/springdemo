package com.mkl.beanannotation.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InjectionServiceImpl implements InjectionService {

    @Autowired
    private InjectionDAO injectionDAO;

    //@Autowired
    public InjectionServiceImpl(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    public InjectionDAO getInjectionDAO() {
        return injectionDAO;
    }

    //@Autowired
    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    public void save(String args) {
        System.out.println("Service接收参数：" + args);
        args = args + ":" + this.hashCode();
        injectionDAO.save(args);
    }
}
