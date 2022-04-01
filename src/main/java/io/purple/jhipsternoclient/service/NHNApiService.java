package io.purple.jhipsternoclient.service;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public abstract class NHNApiService {
    final String APPKEY = "D1rdO8NXnSlsW3pE";
    final String API_DOMAIN = "https://api-mail.cloud.toast.com";
    protected String url = API_DOMAIN + "/email/v2.0/appKeys/" + APPKEY;
    protected String urlTail;
    protected RestTemplate restTemplate = new RestTemplate();
    protected HttpHeaders headers = new HttpHeaders();
    protected final String XSecretKey = "A7DjD7Q5";

    protected URI makeUri(String url){
        return UriComponentsBuilder.fromHttpUrl(url).build().toUri();
    }

}
