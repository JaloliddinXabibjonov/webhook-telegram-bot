//package com.example.webhooktelegrambot.service;
//
//import com.example.webhooktelegrambot.entity.Subjects;
//import com.example.webhooktelegrambot.entity.User;
//import com.example.webhooktelegrambot.payload.RegisterDto;
//import com.example.webhooktelegrambot.payload.template.ApiResponse;
//import com.example.webhooktelegrambot.repository.RoleRepository;
//import com.example.webhooktelegrambot.repository.SubjectsRepository;
//import com.example.webhooktelegrambot.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class UserService {
//    @Autowired
//    UserRepository userRepository;
//    @Autowired
//    RoleRepository roleRepository;
//    @Autowired
//    SubjectsRepository subjectsRepository;
//
//    public ApiResponse registerPupil(RegisterDto registerDto) {
//        try {
//            User user = new User();
//            user.setFullName(registerDto.getFullName());
//            user.setCode(registerDto.getCode());
//            user.setRole(roleRepository.getReferenceById(3));
//            userRepository.save(user);
//            return new ApiResponse("Saqlandi", true);
//        } catch (Exception e) {
//            return new ApiResponse("Xatolik yuz berdi, qaytadan urinib ko'ring", false);
//        }
//    }
//
//    public ApiResponse registerTeacher(RegisterDto registerDto) {
//        try {
//            User user = new User();
//            user.setFullName(registerDto.getFullName());
//            user.setCode(registerDto.getCode());
//            user.setRole(roleRepository.getReferenceById(2));
//            List<Subjects> subjectsList = new ArrayList<>();
//            for (Integer integer : registerDto.getSubjectIdList()) {
//                Subjects subjects = subjectsRepository.getReferenceById(integer);
//                subjectsList.add(subjects);
//            }
//            user.setSubjects(subjectsList);
//            userRepository.save(user);
//            return new ApiResponse("Saqlandi", true);
//        } catch (Exception e) {
//            return new ApiResponse("Xatolik yuz berdi, qaytadan urinib ko'ring", false);
//        }
//
//    }
//
//    public boolean checkCode(Integer code) {
//        return userRepository.existsByCode(code);
//    }
//
//    public ApiResponse registerAdmin(RegisterDto registerDto) {
//        try {
//            User user = new User();
//            user.setFullName(registerDto.getFullName());
//            user.setCode(registerDto.getCode());
//            user.setRole(roleRepository.getReferenceById(1));
//            List<Subjects> subjectsList = new ArrayList<>();
////            for (Integer integer : registerDto.getSubjectIdList()) {
////                Subjects subjects = subjectsRepository.getById(integer);
////                subjectsList.add(subjects);
////            }
////            user.setSubjects(subjectsList);
//            userRepository.save(user);
//            return new ApiResponse("Saqlandi", true);
//        } catch (Exception e) {
//            return new ApiResponse("Xatolik yuz berdi, qaytadan urinib ko'ring", false);
//        }
//    }
//}
