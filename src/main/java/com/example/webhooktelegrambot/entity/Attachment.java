//package com.example.webhooktelegrambot.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.hibernate.annotations.GenericGenerator;
//import org.hibernate.annotations.Type;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import java.util.UUID;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Entity
//public class Attachment {
//    @Id
//    @Type(type = "org.hibernate.type.PostgresUUIDType")
//    @GeneratedValue(generator = "uuid2")
//    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
//    private UUID id;
//    private String originalName;
//
//    private long size;
//
//    private String contentType;
//
//    private String fileName;
//
//    private String path;
//
//    public Attachment(String originalName,  String fileName, String path) {
//        this.originalName = originalName;
//        this.fileName = fileName;
//        this.path=path;
//    }
//
//}
