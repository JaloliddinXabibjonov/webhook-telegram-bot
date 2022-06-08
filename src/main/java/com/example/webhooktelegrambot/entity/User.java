//package com.example.webhooktelegrambot.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.hibernate.annotations.GenericGenerator;
//import org.hibernate.annotations.Type;
//
//import javax.persistence.*;
//import java.util.List;
//import java.util.UUID;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Entity(name = "users")
//public class User {
//    @Id
//    @Type(type = "org.hibernate.type.PostgresUUIDType")
//    @GeneratedValue(generator = "uuid2")
//    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
//    private UUID id;
//
//    @Column(unique = true)
//    private Integer code;
//
//
//    @OneToOne
//    private Role role;
//
//    @ManyToMany
//    private List<Subjects> subjects;
//
//    private String fullName;
//
//    private String chatId;
//
//
//
//}
