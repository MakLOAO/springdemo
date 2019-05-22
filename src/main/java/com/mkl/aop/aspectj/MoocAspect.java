package com.mkl.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MoocAspect {

    @Pointcut("execution(* com.mkl.aop.aspectj.biz.*Biz.*(..))")
    public void pointcut() {}

    @Before("pointcut() && @annotation(moocMethod)")
    public void beforeWithAnnotation(MoocMethod moocMethod) {
        System.out.println("BeforeWithParam: " + moocMethod.value());
    }

//    @Before("pointcut() && args(arg)")
//    public void beforeWithParam(String arg) {
//        System.out.println("BeforeWithParam: " + arg);
//    }
//    @Pointcut("within(com.mkl.aop.aspectj.biz.*)")
//    public void bizPointcut() {}
//
//    @Before("execution(* com.mkl.aop.aspectj.biz.*Biz.*(..))")
//    // @Before("com.mkl.aop.aspectj.MoocAspect.pointcut()")
//    public void before() {
//        System.out.println("Before");
//    }
//    @AfterReturning(pointcut = "com.mkl.aop.aspectj.MoocAspect.pointcut()", returning = "returnValue")
//    public void afterReturning(Object returnValue) {
//        System.out.println("AfterReturning : " + returnValue);
//    }
//
//    @AfterThrowing(pointcut = "com.mkl.aop.aspectj.MoocAspect.pointcut()", throwing = "e")
//    public void afterThrowing(RuntimeException e) {
//        System.out.println("AfterThrowing： " + e.getMessage());
//    }
//
//    @After("pointcut()")
//    public void after() {
//        System.out.println("After");
//    }
//
//    @Around("pointcut()")
//    public Object around(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("Around 1");
//        Object obj = pjp.proceed();
//        System.out.println("Around 2");
//        System.out.println("Around：" + obj);
//        return obj;
//    }
}
