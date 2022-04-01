package io.purple.jhipsternoclient.service.impl;

import io.purple.jhipsternoclient.service.dto.EmailDTO;
import io.purple.jhipsternoclient.service.EmailService;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class EmailServiceTestImpl implements EmailService {

    public String urlTail;

    @Override
    public void setUrlTail(String urlTail){
        this.urlTail = urlTail;
    }

    @Override
    public ResponseEntity<?> sendEmail(EmailDTO emailDto)  {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("application", "json"));
        headers.set("X-Secret-Key", XSecretKey);

        String url = API_DOMAIN + "/email/v2.0/appKeys/" + APPKEY + urlTail;
        UriComponents uri = UriComponentsBuilder.fromHttpUrl(url).build();

        HttpEntity<?> entity = new HttpEntity<>(emailDto, headers);
        return restTemplate.postForEntity(uri.toUri(), entity, String.class);
//        stringResponseEntity.getBody()


    }
}
