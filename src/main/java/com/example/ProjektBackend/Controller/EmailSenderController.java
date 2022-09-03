package com.example.ProjektBackend.Controller;



import com.example.ProjektBackend.Service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;



@Controller
public class EmailSenderController {

    private final EmailSenderService emailSender;
    private final TemplateEngine templateEngine;

    @Autowired
    public EmailSenderController(EmailSenderService emailSender, TemplateEngine templateEngine) {
        this.emailSender = emailSender;
        this.templateEngine = templateEngine;
    }
    @PostMapping(path = "/mail")
    public void send() throws MessagingException {

        Context context = new Context();
        context.setVariable("header", "CarhHub");
        context.setVariable("title", "Twoje ogłoszenie zostało dodane!");
        context.setVariable("linkDelete", "Tutaj jakis opis...");
        context.setVariable("linkShow", "Tutaj jakis opis...");
        String body = templateEngine.process("email", context);
        emailSender.sendEmail("dkacprzak22@gmail.com", "CarHub - Twoje ogłoszenie zostało dodane", body);


    }

}
