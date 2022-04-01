package io.purple.jhipsternoclient.service.impl;

import io.purple.jhipsternoclient.service.NHNApiService;
import io.purple.jhipsternoclient.service.RegisterService;
import io.purple.jhipsternoclient.service.dto.RegisterDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public class RegisterServiceImpl extends NHNApiService implements RegisterService {

    @Override
    public void setUrlTail(String urlTail){
        this.urlTail = urlTail;
    }

    public boolean search(RegisterDTO registerDTO){

        headers.setContentType(new MediaType("application", "json"));
        headers.set("X-Secret-Key", XSecretKey);

        String uid = registerDTO.getName() + "_" + registerDTO.getBirth() + "_" + registerDTO.getPhoneNumberSuffix();
        url = url + urlTail + "/" + uid;
        HttpEntity<?> entity = new HttpEntity<>(headers);
        ResponseEntity<?> result =  this.restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        return result.
    }

    public ResponseEntity<?> doRegister(RegisterDTO registerDTO){

    }
}
