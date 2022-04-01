package io.purple.jhipsternoclient.service;

import io.purple.jhipsternoclient.service.dto.EmailDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface EmailService {
    public final String APPKEY = "D1rdO8NXnSlsW3pE";
    public final String XSecretKey = "A7DjD7Q5";
    public final String API_DOMAIN = "https://api-mail.cloud.toast.com";

    public void setUrlTail(String urlTail);
    public ResponseEntity<?> sendEmail(EmailDTO email);
}
