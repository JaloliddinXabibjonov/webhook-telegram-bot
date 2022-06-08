package com.example.webhooktelegrambot.controller;

import com.example.webhooktelegrambot.service.TGService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.net.MalformedURLException;

@RestController
@RequestMapping("/api/telegram")
@RequiredArgsConstructor
public class WebhookController {
private final TGService tgService;
    @PostMapping
     public void ketmon(@RequestBody Update update) throws MalformedURLException {
        //TELEGRAMDAN KELGAN OBJECTNI O`ZIMIZNI METODGA BERIB YUBORDIK
        tgService.updateKutish(update);
    }


}
