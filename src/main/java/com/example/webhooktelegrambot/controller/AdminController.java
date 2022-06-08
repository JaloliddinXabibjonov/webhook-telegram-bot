package com.example.webhooktelegrambot.controller;

import com.example.webhooktelegrambot.RestConstants;
import com.example.webhooktelegrambot.SendPhotoOwn;
import com.example.webhooktelegrambot.feign.TelegramFeign;
import com.example.webhooktelegrambot.payload.ResultTelegram;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.telegram.telegrambots.meta.api.methods.polls.SendPoll;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.PhotoSize;

import java.util.*;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class AdminController {

//    @Autowired
//    TelegramFeign telegramFeign;

//    private final RestTemplate restTemplate;

//    private Set<String> userChatIdList = new HashSet<>(
//            Arrays.asList("573492532","5129267392")
//    );
//private Set<String> userChatIdList = new HashSet<>(
//            Arrays.asList()
//    );

//    @GetMapping("/xabarYuborish")
//    public String send(@RequestParam String text) {
//        for (String chatId : userChatIdList) {
//            SendMessage sendMessage = new SendMessage(chatId, text);
//            ResultTelegram resultTelegram = telegramFeign.sendMessageToUser("bot" + RestConstants.TELEGRAM_BOT_TOKEN, sendMessage);
//            System.out.println(resultTelegram);
//        }
//        return "Xabar yuborildi";
//    }
//
//    @GetMapping("/rasmYuborish")
//    public String rasmJonatish(@RequestParam String fileName, @RequestParam String text) {
//        String fileId=null;
//        for (String chatId : userChatIdList) {
//            try {
//                fileName = fileId==null?RestConstants.MY_URL + "/api/attachment?name=" + fileName:fileId;
//                SendPhotoOwn sendPhoto = new SendPhotoOwn(chatId, text, fileName);
//                ResultTelegram resultTelegram = telegramFeign.sendPhotoToUser("bot" + RestConstants.TELEGRAM_BOT_TOKEN, sendPhoto);
//                List<PhotoSize> photos = resultTelegram.getResult().getPhoto();
//                PhotoSize photoSize = photos.get(photos.size() - 1);
//                fileId=photoSize.getFileId();
//                System.out.println(resultTelegram);
//                return "Xabarlar yuborildi";
//            }catch(Exception e){
//                System.out.println(e.getMessage());
//                return "Ushbu id li userga xabar yuborilmadi: "+chatId;
//            }
//        }
//        return "Userlar topilmadi";
//    }
//    @GetMapping("/anketaYuborish")
//    public String send(@RequestParam String question, @RequestParam List<String> answers, @RequestParam Integer answerId) {
//        for (String chatId : userChatIdList) {
//            SendPoll sendPoll = new SendPoll(chatId, question,answers );
//            ResultTelegram resultTelegram = telegramFeign.sendMessageToUser("bot" + RestConstants.TELEGRAM_BOT_TOKEN, sendMessage);
//            System.out.println(resultTelegram);
//        }
//        return "Xabar yuborildi";
//    }

}

