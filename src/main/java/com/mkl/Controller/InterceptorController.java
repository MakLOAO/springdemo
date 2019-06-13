package com.mkl.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class InterceptorController {
    @RequestMapping("/interceptor")
    public String hello() {
        System.out.println("hello controller");
        return "index";
    }
}
