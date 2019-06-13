package com.mkl.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {

    // 在请求处理的方法之前执行
    // 如果返回true，执行下一个拦截器，返回false，不执行下一个拦截器
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("--------处理前-------");
        return true;
//        httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/index.jsp");
//        return false;
    }

    // 在请求处理的方法之后执行
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("--------处理后-------");
    }

    // 在DispatcherServlet处理后执行---清理工作
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
