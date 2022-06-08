package com.example.webhooktelegrambot.service;

//import com.example.webhooktelegrambot.entity.User;
//import com.example.webhooktelegrambot.entity.enums.RoleName;
//import com.example.webhooktelegrambot.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
@RequiredArgsConstructor
public class TGService {
    private final WebhookService webhookService;
//    @Autowired
//    UserRepository userRepository;
//    private int messageId = -1;
//    boolean isUrl =false;

    public void updateKutish(Update update)  {
        if (update.hasMessage()) {
            if (update.getMessage().hasText()) {
                String text = update.getMessage().getText();
                switch (text) {
                    case "/start":
//                        messageId = update.getMessage().getMessageId();
                        webhookService.whenStart(update);
                        break;
//                    case "/about":
//                        break;
                }
//                if (text.length() == 8 && update.getMessage().getMessageId() == messageId + 2) {
//                    int code = Integer.parseInt(text);
//                    Optional<User> optionalUser = userRepository.findByCode(code);
//                    if (optionalUser.isPresent()) {
//                        User user = optionalUser.get();
//                        if (user.getRole().getRoleName().equals(RoleName.PUPIL.name())) {
//                            user.setChatId(update.getMessage().getChatId().toString());
//                            userRepository.save(user);
//                            webhookService.rightPupilId(update, user.getFullName());
//                        } else if (user.getRole().getRoleName().equals(RoleName.TEACHER.name())) {
//                            webhookService.rightTeacherId(update, user.getFullName());
//                        }
//                    } else {
//                        messageId = update.getMessage().getMessageId();
//                        webhookService.errorPupilId(update);
//                    }
//                } else if (text.equals("Test natijalarini olish")) {
//                    webhookService.vaqtincha(update);
//                } else if (text.equals("Test tuzish")) {
//                    messageId = update.getMessage().getMessageId();
//                    webhookService.getTestAnswers(update);
//                } else if (text.equals("Test ishlash")) {
//                    webhookService.vaqtincha(update);
//                } else if (text.startsWith("test")) {
//                    messageId = update.getMessage().getMessageId();
//                    webhookService.testFayliSorash(update);
//                }

//                else if (text.startsWith("testDay")) {
//                    messageId = update.getMessage().getMessageId();
//                    webhookService.getTime(update);
//                } else if (text.length()==5) {
//                    messageId = update.getMessage().getMessageId();
//                    webhookService.getTime(update);
//                }

//                if (update.getMessage().getEntities()!=null ){
//                    for (MessageEntity messageEntity : update.getMessage().getEntities()) {
//                        if (messageEntity.getType().equals("url")|| messageEntity.getType().equals("text_link")){
//                            isUrl =true;
//                        }
//                    }
//                    if (isUrl)
//                        webhookService.deleteMessages(update);
//                }
//            }

//            if (update.getMessage().getCaptionEntities()!=null) {
//                for (MessageEntity messageEntity : update.getMessage().getCaptionEntities()) {
//                    if (messageEntity.getType().equals("url")|| messageEntity.getType().equals("text_link")){
//                        isUrl =true;
//                    }
//                }
//                if (isUrl)
//                    webhookService.deleteMessages(update);
//
//            }
//            else if (update.getMessage().hasLocation()) {
//                webhookService.location(update);
//            } else if (update.getMessage().hasDocument() && update.getMessage().getMessageId() == messageId + 2) {
//                messageId = update.getMessage().getMessageId();
//                webhookService.getFile(update);
//            }
//
//        }
//        else if (update.hasCallbackQuery()) {
//            String data = update.getCallbackQuery().getData();
//            if (data.startsWith("testDay") && update.getCallbackQuery().getMessage().getMessageId() == messageId + 1) {
//                messageId = update.getCallbackQuery().getMessage().getMessageId();
//                webhookService.getTime(update);
//            }
//        }


    }
}}}

