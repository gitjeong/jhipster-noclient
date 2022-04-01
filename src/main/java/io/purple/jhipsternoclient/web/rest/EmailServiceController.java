package io.purple.jhipsternoclient.web.rest;

import io.purple.jhipsternoclient.service.dto.EmailDTO;
import io.purple.jhipsternoclient.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class EmailServiceController {


    private final EmailService emailService;

    // 의존성 주입
    // Constructor dependency injection
    // EmailService must be registered as a bean
    // A primary bean implementing EmailService will be injected
    // AutowiredAnnotationBeanPostProcessor injects a bean when it identifies autowired annotations
    // IoC container applies the dependency injection
    @Autowired
    public EmailServiceController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/email/tagWithTemplate")
    public ResponseEntity<?> sendEmail(@Valid @RequestBody EmailDTO emailDto){
        emailService.setUrlTail("/sender/tagMail");
        return emailService.sendEmail(emailDto);
    }
}
