package com.example.webhooktelegrambot.payload;

import lombok.*;
import org.checkerframework.checker.units.qual.A;
import org.telegram.telegrambots.meta.api.objects.Message;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultTelegram {
    private boolean ok;
    private Message result;
}
