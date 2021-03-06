package com.example.webhooktelegrambot.repository;

import com.example.webhooktelegrambot.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AttachmentRepository extends JpaRepository<Attachment, UUID> {
}
