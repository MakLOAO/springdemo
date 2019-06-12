package com.mkl.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.mkl.Controller.entity.User;

@Controller
public class DataController {

    // @RequestParam为提交的域名称
    @RequestMapping("/data")
    public String data(@RequestParam("uname") String name) {
        System.out.println(name);
        return "data";
    }

    @RequestMapping("/user")
    public String user(User user, ModelMap modelMap) {
        modelMap.addAttribute("user", user);
        System.out.println(user);
        return "user";
    }

    @RequestMapping("/{name}/{id}/restful")
    public String restful(@PathVariable String name, @PathVariable int id, ModelMap modelMap) {
        System.out.println(id + name);
        modelMap.addAttribute("name", name);
        modelMap.addAttribute("id", id);
        return "/data";
    }
}
