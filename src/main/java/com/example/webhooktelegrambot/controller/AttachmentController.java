package com.example.webhooktelegrambot.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

@RestController
@RequestMapping("/api/attachment")
public class AttachmentController {

    String uploadDir="Yuklanganlar";

    @GetMapping
    public void getPhotoByName(@RequestParam String name, HttpServletResponse response) throws IOException {
        File file=new File(uploadDir+"/"+name);
        System.out.println(System.currentTimeMillis());
        response.setContentType("image/jpeg");
        response.setHeader("Cache-Control", "max-age=8640000");
        response.setHeader("Content-disposition", "attachment; filename=\""+file.getName()+"\"");
        InputStream inputStream=new FileInputStream(file);
        FileCopyUtils.copy(inputStream, response.getOutputStream());
    }

}

