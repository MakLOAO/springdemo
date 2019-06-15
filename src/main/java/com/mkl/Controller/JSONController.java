package com.mkl.Controller;

import com.mkl.Controller.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JSONController {

    // ResponseBody表明返回的是JSON对象，通过转换器转换
    @RequestMapping("/jsontest")
    @ResponseBody
    public User jsontest(@RequestBody User user) {
        return user;
    }

    @RequestMapping("/json")
    public String json() {
        return "jsontest";
    }
}
