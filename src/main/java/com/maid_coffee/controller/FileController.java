package com.maid_coffee.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpServletRequest;


@RestController
public class FileController {

    @PostMapping("/upload")
    public String upload(String nickname, MultipartFile photo, HttpServletRequest request) throws IOException{
        String path = request.getServletContext().getRealPath("/files");
        saveFile(photo, path);
        return "上传成功"; 
    }
    
    public void saveFile(MultipartFile photo, String path) throws IOException{
        File upDir = new File(path);
        if(!upDir.exists()){
            upDir.mkdir();
        }
        File file = new File(path + photo.getOriginalFilename());
        photo.transferTo(file);
    }
}
