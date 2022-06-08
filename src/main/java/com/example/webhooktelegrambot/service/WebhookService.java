package com.example.webhooktelegrambot.service;

import com.example.webhooktelegrambot.RestConstants;
//import com.example.webhooktelegrambot.entity.Attachment;
import com.example.webhooktelegrambot.payload.ResultTelegram;
//import com.example.webhooktelegrambot.repository.AttachmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.*;

@Service
//@RequiredArgsConstructor
public class WebhookService {
    private  RestTemplate restTemplate;

    public WebhookService() {

    }

    public WebhookService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    //    private final AttachmentRepository attachmentRepository;

    public void whenStart(Update update) {
        SendMessage sendMessage = new SendMessage(update.getMessage().getChatId().toString(), "Assalomu alaykum. Botimizga xush kelibsiz");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);
        List<KeyboardRow> keyboard = new ArrayList<>();
        replyKeyboardMarkup.setKeyboard(keyboard);
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        row1.add("Buyurtma berish");
        row2.add("ℹ️Ma'lumot");
        row2.add("\uD83D\uDCF2Biz bilan aloqa");
        keyboard.add(row1);
        keyboard.add(row2);
        replyKeyboardMarkup.setKeyboard(keyboard);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        ResultTelegram resultTelegram = restTemplate.postForObject(RestConstants.TELEGRAM_BOT_URL + RestConstants.TELEGRAM_BOT_TOKEN + "/sendMessage", sendMessage, ResultTelegram.class);
        System.out.println(resultTelegram);
    }

//    public void vaqtincha(Update update) {
//        SendMessage sendMessage = new SendMessage(update.getMessage().getChatId().toString(), "Hozirda tuzatish ishlari olib borilayotganligi sababli ushbu bo`lim vaqtincha ish faoliyatida emas");
//        ResultTelegram resultTelegram = restTemplate.postForObject(RestConstants.TELEGRAM_BOT_URL + RestConstants.TELEGRAM_BOT_TOKEN + "/sendMessage", sendMessage, ResultTelegram.class);
//        System.out.println(resultTelegram);
//    }
//    public void rightPupilId(Update update, String fullName) {
//        SendMessage sendMessage = new SendMessage(update.getMessage().getChatId().toString(), "Hurmatli " + fullName + ". Botimiz imkoniyatlarni siz uchun endi ochiq");
//        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
//        replyKeyboardMarkup.setSelective(true);
//        replyKeyboardMarkup.setResizeKeyboard(true);
//        replyKeyboardMarkup.setOneTimeKeyboard(false);
//        List<KeyboardRow> keybord = new ArrayList<>();
//        KeyboardRow row1 = new KeyboardRow();
//        replyKeyboardMarkup.setKeyboard(keybord);
//        row1.add("Test ishlash");
//        keybord.add(row1);
//        sendMessage.setReplyMarkup(replyKeyboardMarkup);
//        ResultTelegram resultTelegram = restTemplate.postForObject(RestConstants.TELEGRAM_BOT_URL + RestConstants.TELEGRAM_BOT_TOKEN + "/sendMessage", sendMessage, ResultTelegram.class);
//        System.out.println(resultTelegram);
//    }
//    public void rightTeacherId(Update update, String fullName) {
//        SendMessage sendMessage = new SendMessage(update.getMessage().getChatId().toString(), "Mahsulot turini anlang");
//        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
//        replyKeyboardMarkup.setSelective(true);
//        replyKeyboardMarkup.setResizeKeyboard(true);
//        replyKeyboardMarkup.setOneTimeKeyboard(false);
//        List<KeyboardRow> keyboard = new ArrayList<>();
//        replyKeyboardMarkup.setKeyboard(keyboard);
//        KeyboardRow row1 = new KeyboardRow();
//        KeyboardRow row2 = new KeyboardRow();
//        row1.add("Test tuzish");
//        row1.add("Test natijalarini olish");
//        row2.add("Sinov");
//        keyboard.add(row1);
//        keyboard.add(row2);
//        replyKeyboardMarkup.setKeyboard(keyboard);
//        sendMessage.setReplyMarkup(replyKeyboardMarkup);
//        ResultTelegram resultTelegram = restTemplate.postForObject(RestConstants.TELEGRAM_BOT_URL + RestConstants.TELEGRAM_BOT_TOKEN + "/sendMessage", sendMessage, ResultTelegram.class);
//        System.out.println(resultTelegram);
//    }
//    public void errorPupilId(Update update) {
//        SendMessage sendMessage = new SendMessage(update.getMessage().getChatId().toString(), "Kod xato kiritildi. Qayta urinib ko`ring:");
//        ResultTelegram resultTelegram = restTemplate.postForObject(RestConstants.TELEGRAM_BOT_URL + RestConstants.TELEGRAM_BOT_TOKEN + "/sendMessage", sendMessage, ResultTelegram.class);
//        System.out.println(resultTelegram);
//    }
//    public void deleteMessages(Update update) {
//        SendMessage sendMessage = new SendMessage(update.getMessage().getChatId().toString(), "‼️Hurmatli " + update.getMessage().getChat().getFirstName() + " iltimos guruhda reklama tarqatmang! ❌");
//        DeleteMessageDto deleteMessageDto = restTemplate.postForObject(RestConstants.TELEGRAM_BOT_URL + RestConstants.TELEGRAM_BOT_TOKEN + "/deleteMessage?chat_id=" + update.getMessage().getChatId() + "&message_id=" + update.getMessage().getMessageId(), sendMessage, DeleteMessageDto.class);
//        ResultTelegram resultTelegram = restTemplate.postForObject(RestConstants.TELEGRAM_BOT_URL + RestConstants.TELEGRAM_BOT_TOKEN + "/sendMessage", sendMessage, ResultTelegram.class);
//        System.out.println(deleteMessageDto);
//        System.out.println(resultTelegram);
//    }
//    public void location(Update update) {
//        SendMessage sendMessage = new SendMessage(update.getMessage().getChatId().toString(), "Joylashuvingiz qabul qilindi");
//
////        System.out.println(latitude+"++++"+longitude);
//        ResultTelegram resultTelegram = restTemplate.postForObject(RestConstants.TELEGRAM_BOT_URL + RestConstants.TELEGRAM_BOT_TOKEN + "/sendMessage", sendMessage, ResultTelegram.class);
//        System.out.println(resultTelegram);
//    }
//    public void getTestAnswers(Update update) {
//        SendMessage sendMessage = new SendMessage(update.getMessage().getChatId().toString(), "Test javoblarini yuboring (test abcdab... formatda)");
//        ResultTelegram resultTelegram = restTemplate.postForObject(RestConstants.TELEGRAM_BOT_URL + RestConstants.TELEGRAM_BOT_TOKEN + "/sendMessage", sendMessage, ResultTelegram.class);
//        System.out.println(resultTelegram);
//    }
//    public void testFayliSorash(Update update) {
//        SendMessage sendMessage = new SendMessage(update.getMessage().getChatId().toString(), "Test faylini word yoki pdf formatda yuboring");
//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println(calendar.get(Calendar.MONTH));
//        ResultTelegram resultTelegram = restTemplate.postForObject(RestConstants.TELEGRAM_BOT_URL + RestConstants.TELEGRAM_BOT_TOKEN + "/sendMessage", sendMessage, ResultTelegram.class);
//        System.out.println(resultTelegram);
//    }
//    public void getTime(Update update) {
//        SendMessage sendMessage = new SendMessage(update.getCallbackQuery().getMessage().getChatId().toString(), "Test o`tkaziladigan vaqtni belgilang:");
//        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
//        InlineKeyboardButton inlineKeyboardButton1;
//        List<InlineKeyboardButton> inlineKeyboardButtonsRow = new ArrayList<>();
//        List<InlineKeyboardButton> inlineKeyboardButtonsRow1 = new ArrayList<>();
//        List<InlineKeyboardButton> inlineKeyboardButtonsRow2 = new ArrayList<>();
//        List<InlineKeyboardButton> inlineKeyboardButtonsRow3 = new ArrayList<>();
//        for (int i = 0; i < 24; i++) {
//            String soat = i < 10 ? "0" + i + ":00" : "" + i + ":00";
//            String callBack = "testTime" + (i == 0 ? 0 : 3600000 * i);
//            if (i < 6) {
//                inlineKeyboardButton1 = new InlineKeyboardButton();
//                inlineKeyboardButton1.setText(soat);
//                inlineKeyboardButton1.setCallbackData("testTime" + (i == 0 ? 0 : 3600000 * i));
//                inlineKeyboardButtonsRow.add(inlineKeyboardButton1);
//            } else if (i >= 6 && i < 12) {
//                inlineKeyboardButton1 = new InlineKeyboardButton();
//                inlineKeyboardButton1.setText(soat);
//                inlineKeyboardButton1.setCallbackData(callBack);
//                inlineKeyboardButtonsRow1.add(inlineKeyboardButton1);
//            } else if (i >= 12 && i < 18) {
//                inlineKeyboardButton1 = new InlineKeyboardButton();
//                inlineKeyboardButton1.setText(soat);
//                inlineKeyboardButton1.setCallbackData(callBack);
//                inlineKeyboardButtonsRow2.add(inlineKeyboardButton1);
//            } else {
//                inlineKeyboardButton1 = new InlineKeyboardButton();
//                inlineKeyboardButton1.setText(soat);
//                inlineKeyboardButton1.setCallbackData(callBack);
//                inlineKeyboardButtonsRow3.add(inlineKeyboardButton1);
//            }
//        }
//        List<List<InlineKeyboardButton>> inlineKeyboardButtonRowList = new ArrayList<>();
//        inlineKeyboardButtonRowList.add(inlineKeyboardButtonsRow);
//        inlineKeyboardButtonRowList.add(inlineKeyboardButtonsRow1);
//        inlineKeyboardButtonRowList.add(inlineKeyboardButtonsRow2);
//        inlineKeyboardButtonRowList.add(inlineKeyboardButtonsRow3);
//        inlineKeyboardMarkup.setKeyboard(inlineKeyboardButtonRowList);
//        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
//        ResultTelegram resultTelegram = restTemplate.postForObject(RestConstants.TELEGRAM_BOT_URL + RestConstants.TELEGRAM_BOT_TOKEN + "/sendMessage", sendMessage, ResultTelegram.class);
//        System.out.println(resultTelegram);
//    }
//
//    public void getFile(Update update) {
//        SendMessage sendMessage;
//        try {
//            sendMessage = new SendMessage(update.getMessage().getChatId().toString(), "Fayl qabul qilindi. Test o`tkaziladigan kunni belgilang:");
//            Calendar calendar = Calendar.getInstance();
//            InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
//            InlineKeyboardButton inlineKeyboardButton1;
//            List<InlineKeyboardButton> inlineKeyboardButtonsRow = new ArrayList<>();
//            List<InlineKeyboardButton> inlineKeyboardButtonsRow1 = new ArrayList<>();
////            List<InlineKeyboardButton> inlineKeyboardButtonsRow2 = new ArrayList<>();
////            List<InlineKeyboardButton> inlineKeyboardButtonsRow3 = new ArrayList<>();
//            for (int i = 0; i < 6; i++) {
//                calendar.setTimeInMillis(System.currentTimeMillis() + 86400000 * i);
//                int day = calendar.get(Calendar.DAY_OF_MONTH);
//                int month = calendar.get(Calendar.MONTH) + 1;
//                String buttonText = day + "." + (month < 10 ? "0" + month : month);
//                String callBackData = "testDay" + calendar.getTimeInMillis();
//                if (i < 3) {
//                    inlineKeyboardButton1 = new InlineKeyboardButton();
//                    inlineKeyboardButton1.setText(buttonText);
//                    inlineKeyboardButton1.setCallbackData(callBackData);
//                    inlineKeyboardButtonsRow.add(inlineKeyboardButton1);
//                } else {
//                    inlineKeyboardButton1 = new InlineKeyboardButton();
//                    inlineKeyboardButton1.setText(buttonText);
//                    inlineKeyboardButton1.setCallbackData(callBackData);
//                    inlineKeyboardButtonsRow1.add(inlineKeyboardButton1);
//                }
////                else if (i >= 10 && i < 15) {
////                    inlineKeyboardButton1 = new InlineKeyboardButton();
////                    inlineKeyboardButton1.setText(day + "." + (month<10?"0"+month:month));
////                    inlineKeyboardButton1.setCallbackData(day + "-" + month);
////                    inlineKeyboardButtonsRow2.add(inlineKeyboardButton1);
////                } else {
////                    inlineKeyboardButton1 = new InlineKeyboardButton();
////                    inlineKeyboardButton1.setText(day + "." + (month<10?"0"+month:month));
////                    inlineKeyboardButton1.setCallbackData(day + "-" + month);
////                    inlineKeyboardButtonsRow3.add(inlineKeyboardButton1);
////                }
//            }
//            List<List<InlineKeyboardButton>> inlineKeyboardButtonRowList = new ArrayList<>();
//            inlineKeyboardButtonRowList.add(inlineKeyboardButtonsRow);
//            inlineKeyboardButtonRowList.add(inlineKeyboardButtonsRow1);
////            inlineKeyboardButtonRowList.add(inlineKeyboardButtonsRow2);
////            inlineKeyboardButtonRowList.add(inlineKeyboardButtonsRow3);
//            inlineKeyboardMarkup.setKeyboard(inlineKeyboardButtonRowList);
//            sendMessage.setReplyMarkup(inlineKeyboardMarkup);
//            final Document document = update.getMessage().getDocument();
//            final String fileId = document.getFileId();
//            final String fileName = document.getFileName();
//
//            uploadFile(fileName, fileId);
//            Attachment attachment = new Attachment();
//            attachment.setFileName(UUID.randomUUID().toString());
//            attachment.setOriginalName(fileName);
//            attachment.setPath("Yuklanganlar/" + fileName);
//            attachmentRepository.save(attachment);
//        } catch (Exception e) {
//            sendMessage = new SendMessage(update.getMessage().getChatId().toString(), "Xatolik yuz berdi. Qaytadan urinib ko'ring!");
//        }
//        restTemplate.postForObject(RestConstants.TELEGRAM_BOT_URL + RestConstants.TELEGRAM_BOT_TOKEN + "/sendMessage", sendMessage, ResultTelegram.class);
//    }
//
//
//    @SneakyThrows
//    public void uploadFile(String fileName, String fileId) {
//        URL url = new URL(RestConstants.TELEGRAM_BOT_URL + RestConstants.TELEGRAM_BOT_TOKEN + "/getFile?file_id=" + fileId);
//        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
//        String getFileResponse = br.readLine();
//        JSONObject jresult = new JSONObject(getFileResponse);
//        JSONObject path = jresult.getJSONObject("result");
//
//        String file_path = path.getString("file_path");
//        File localFile = new File("Yuklanganlar/" + fileName);
//        InputStream is = new URL("https://api.telegram.org/file/bot" + RestConstants.TELEGRAM_BOT_TOKEN + "/" + file_path).openStream();
//        FileUtils.copyInputStreamToFile(is, localFile);
//        br.close();
//        is.close();
//    }


}

