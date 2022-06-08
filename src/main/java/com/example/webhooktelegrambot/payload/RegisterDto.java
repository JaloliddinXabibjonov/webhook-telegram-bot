package com.example.webhooktelegrambot.payload;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.procedure.spi.ParameterRegistrationImplementor;

import java.util.List;

@Getter
@Setter
public class RegisterDto {

    private String fullName;
    private Integer code;

    //----FAQAT O'QITUVCHI QOSHISH UCHUN
    private List<Integer> subjectIdList;

}
