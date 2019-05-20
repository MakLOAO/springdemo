package com.mkl.ioc.injection;

public class InjectionServiceImpl implements InjectionService {

    private InjectionDAO injectionDAO;

    public InjectionServiceImpl(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    public InjectionDAO getInjectionDAO() {
        return injectionDAO;
    }

    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    public void save(String args) {
        System.out.println("Service接收参数：" + args);
        args = args + ":" + this.hashCode();
        injectionDAO.save(args);
    }
}
