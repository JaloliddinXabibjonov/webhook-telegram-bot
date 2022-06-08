package com.example.webhooktelegrambot.feign;

import com.example.webhooktelegrambot.RestConstants;
import com.example.webhooktelegrambot.SendPhotoOwn;
import com.example.webhooktelegrambot.payload.ResultTelegram;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

@FeignClient(url = RestConstants.TELEGRAM_BOT_URL_WITHOUT_BOT, name = "KetmonFeign")
public interface TelegramFeign {
    @PostMapping("{path}/sendMessage")
    ResultTelegram sendMessageToUser(@PathVariable String path,
                                     @RequestBody SendMessage sendMessage);

    @PostMapping("{path}/sendPhoto")
    ResultTelegram sendPhotoToUser(@PathVariable String path,
                                     @RequestBody SendPhotoOwn sendPhotoOwn);

}
