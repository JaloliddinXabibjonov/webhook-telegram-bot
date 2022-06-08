package com.example.webhooktelegrambot.repository;

import com.example.webhooktelegrambot.entity.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectsRepository extends JpaRepository<Subjects, Integer> {
}
