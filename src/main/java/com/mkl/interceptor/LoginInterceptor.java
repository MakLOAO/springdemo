package com.mkl.interceptor;

import com.mkl.Controller.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class LoginInterceptor implements HandlerInterceptor {

    public void setAllowedPass(List<String> allowedPass) {
        this.allowedPass = allowedPass;
    }

    private List<String> allowedPass;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String url = httpServletRequest.getRequestURL().toString();
        User user = (User) httpServletRequest.getSession().getAttribute("user");
        // 当session中的user属性不为空，表示有用户对象，此时不拦截
        if (user != null) {
            return true;
        }
        // 有些内容不登录是看不到的，就需要拦截器拦截，只有用户登录了，才能进入这些页面，否则就重定向回登录页面
        for (String temp : allowedPass) {
            if (url.endsWith(temp)) {
                return true;
            }
        }
        httpServletResponse.sendRedirect("/index.do");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
