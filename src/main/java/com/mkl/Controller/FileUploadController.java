package com.mkl.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

@Controller
public class FileUploadController {

/**
 * @program: demo
 *
 * @description:
 *
 * @author: makaloo
 *
 * @create: 2019-06-12 14:39
 **/
    @RequestMapping("/file")
    public String file() {
        return "fileupload";
    }

    @RequestMapping("/upload")
    public String fileupload(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest req) throws IOException {
        String path = req.getRealPath("/WEB-INF");
        OutputStream os = new FileOutputStream(new File(path, file.getOriginalFilename()));
        InputStream is = file.getInputStream();
        int len = 0;
        byte[] buffer = new byte[400];
        while((len = is.read(buffer)) != -1)
            os.write(buffer, 0, len);
        os.close();
        is.close();
        return "index";
    }
}
