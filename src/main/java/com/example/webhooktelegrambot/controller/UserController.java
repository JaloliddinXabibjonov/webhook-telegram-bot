//package com.example.webhooktelegrambot.controller;
//
//import com.example.webhooktelegrambot.payload.RegisterDto;
//import com.example.webhooktelegrambot.payload.template.ApiResponse;
//import com.example.webhooktelegrambot.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/user")
//public class UserController {
//    @Autowired
//    UserService userService;
//
//    @PostMapping("/registerPupil")
//    public HttpEntity<?> registerPupil(@RequestBody RegisterDto registerDto){
//        ApiResponse apiResponse=userService.registerPupil(registerDto);
//        return ResponseEntity.status(apiResponse.isSuccess()?201:409).body(apiResponse);
//    }
//
//    @PostMapping("/registerTeacher")
//    public HttpEntity<?> registerTeacher(@RequestBody RegisterDto registerDto){
//        ApiResponse apiResponse=userService.registerTeacher(registerDto);
//        return ResponseEntity.status(apiResponse.isSuccess()?201:409).body(apiResponse);
//    }
//
//    @PostMapping("/registerAdmin")
//    public HttpEntity<?> registerAdmin(@RequestBody RegisterDto registerDto){
//        ApiResponse apiResponse=userService.registerAdmin(registerDto);
//        return ResponseEntity.status(apiResponse.isSuccess()?201:409).body(apiResponse);
//    }
//
//
//
//    @PostMapping("/checkCode/{code}")
//    public boolean checkCode(@PathVariable Integer code){
//        return userService.checkCode(code);
//    }
//
//
//
//
//
//
//
//}
