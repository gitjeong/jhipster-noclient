package io.purple.jhipsternoclient.service;

import io.purple.jhipsternoclient.service.dto.EmailDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface EmailService {
    public void setUrlTail(String urlTail);
    public ResponseEntity<?> doSendEmail(EmailDTO email);
}
