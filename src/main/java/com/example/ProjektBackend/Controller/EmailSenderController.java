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
    public void send(@RequestParam Long id, @RequestParam String imie, @RequestParam String mail) throws MessagingException {
        System.out.println(id+" "+imie+" "+ mail);
        Context context = new Context();
        context.setVariable("header", "CarhHub");
        context.setVariable("title", "Witaj "+imie+"!"+" Twoje ogłoszenie zostało dodane!");

        context.setVariable("linkShow", "http://localhost:3000/"+id);
        context.setVariable("linkDelete", "http://localhost:3000/delete/"+id);

        String body = templateEngine.process("email", context);
        emailSender.sendEmail(mail, "CarHub - Twoje ogłoszenie zostało dodane", body);


    }

}
