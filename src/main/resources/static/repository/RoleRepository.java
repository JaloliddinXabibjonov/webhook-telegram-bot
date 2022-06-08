package com.example.webhooktelegrambot.repository;

import com.example.webhooktelegrambot.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
