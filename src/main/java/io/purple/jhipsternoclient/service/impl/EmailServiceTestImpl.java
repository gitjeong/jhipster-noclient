package io.purple.jhipsternoclient.service.impl;

import io.purple.jhipsternoclient.service.EmailService;
import io.purple.jhipsternoclient.service.NHNApiService;
import io.purple.jhipsternoclient.service.dto.EmailDTO;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class EmailServiceTestImpl extends NHNApiService implements EmailService {

    @Override
    public void setUrlTail(String urlTail){
        this.urlTail = urlTail;
    }

    public ResponseEntity<?> doSendEmail(EmailDTO emailDto)  {

        URI uri = makeUri(url + urlTail);

        headers.setContentType(new MediaType("application", "json"));
        headers.set("X-Secret-Key", XSecretKey);

        HttpEntity<?> entity = new HttpEntity<>(emailDto, headers);
        return this.restTemplate.postForEntity(uri, entity, String.class);
//        stringResponseEntity.getBody()


    }
}
