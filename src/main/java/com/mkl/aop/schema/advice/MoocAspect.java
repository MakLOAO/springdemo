package com.mkl.aop.schema.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class MoocAspect {
    public void before() {
        System.out.println("MoocAspect before");
    }

    public void afterReturning() {
        System.out.println("MoocAspect afterReturning");
    }

    public void afterThrowing() {
        System.out.println("MoocAspect afterThrowing");
    }

    public void after() {
        System.out.println("MoocAspect after");
    }

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("MoocAspect around 1");
        Object retVal = pjp.proceed();
        System.out.println("MoocAspect around 2");
        return retVal;
    }

    public Object aroundInit(ProceedingJoinPoint pjp, String bizName, int times) throws Throwable {
        System.out.println(bizName + " " + times + " before");
        Object retVal = pjp.proceed();
        System.out.println(bizName + " " + times + " after");
        return retVal;
    }
}
