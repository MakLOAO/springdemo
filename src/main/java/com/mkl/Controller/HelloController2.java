package com.mkl.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HelloController2 {
    @RequestMapping("/hello")
    public ModelAndView hello(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        ModelAndView mv = new ModelAndView();
        // 封装要显示到视图的数据
        mv.addObject("msg", "hello springmvc annotation");
        // 封装视图名称
        mv.setViewName("hello");
        return mv;
    }

    // 使用这种方式输出结果不需要视图解析器
    @RequestMapping("/hello2")
    public void hello2(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.getWriter().write("Hello Spring MVC with servlet api");
    }

    // 通过Spring MVC转发和重定向，这种方法不用视图解析器
    @RequestMapping("/hello3")
    public String hello3() {
        //转发
        //return "index.jsp";
        //等价于return "forward:index.jsp";
        //重定向
        return "redirect:index.jsp";
    }

    // 通过Spring MVC加上视图解析器实现转发
    @RequestMapping("/hello4")
    public String hello4() {
        //转发
        return "index";
        //重定向，重定向是用不到视图解析器的
        //return "redirect:hello.do";
    }
}