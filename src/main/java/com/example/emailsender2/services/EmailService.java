package com.example.emailsender2.services;

import com.example.emailsender2.entity.EmailDetails;

public interface EmailService {

    String sendSimpleMail (EmailDetails details);

    String sendMailWithAttachment (EmailDetails details);
}
