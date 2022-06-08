package com.example.webhooktelegrambot.repository;


import com.example.webhooktelegrambot.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    boolean existsByCode(Integer code);

    Optional<User> findByCode(Integer code);

    @Query(value = "select role_id from users where chat_id=?1", nativeQuery = true)
    Integer getRoleByChatId(String chatId);

    User getByChatId(String chatId);
}
