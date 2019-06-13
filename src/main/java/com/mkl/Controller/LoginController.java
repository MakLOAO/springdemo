package com.mkl.Controller;

import com.mkl.Controller.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping("/index")
    public String index() {
        // 跳转到login.jsp,login.jsp表单交由login.do处理
        return "login";
    }

    @RequestMapping("/login")
    public String login(User user, HttpSession session) {
        if ("admin".equals(user.getName()) && "admin".equals(user.getPwd())) {
            session.setAttribute("user", user);
            return "redirect:/success.do";
        }
        return "redirect:/index.do";
    }

    @RequestMapping("/success")
    public String success() {
        return "loginsuccess";
    }

    // 用于测试拦截器，如果拦截器生效，输入http://localhost:8080/add.do并不会转发到index.jsp，而是重定向回index.do，且控制台不会输出add
    @RequestMapping("/add")
    public String add() {
        return "index";
    }
}
