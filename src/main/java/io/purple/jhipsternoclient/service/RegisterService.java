package io.purple.jhipsternoclient.service;

import io.purple.jhipsternoclient.service.dto.RegisterDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface RegisterService {
    public void setUrlTail(String urlTail);
    public boolean search(RegisterDTO registerDTO);
    public ResponseEntity<?> doRegister(RegisterDTO registerDTO);
}
