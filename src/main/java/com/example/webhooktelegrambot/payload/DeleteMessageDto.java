package com.example.webhooktelegrambot.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteMessageDto {
    private boolean ok;
    private boolean result;
}
