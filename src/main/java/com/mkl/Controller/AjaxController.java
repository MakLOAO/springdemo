package com.mkl.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class AjaxController {

    @RequestMapping("/ajax")
    public void ajax(String name, HttpServletResponse response) throws IOException {
        if ("siggy".equals(name)) {
            response.getWriter().print("true");
        } else {
            response.getWriter().print("false");
        }
    }
}
