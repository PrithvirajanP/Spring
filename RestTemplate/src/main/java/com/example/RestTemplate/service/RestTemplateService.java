package com.example.RestTemplate.service;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class RestTemplateService {
    static RestTemplate restTemplate = new RestTemplate();

    private static String get_All_Subjects_URL = "http://localhost:9111/getAllSubjects";


    public static ResponseEntity<String> allSubjects(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        ResponseEntity<String> response = restTemplate.exchange(get_All_Subjects_URL, HttpMethod.GET, entity, String.class);
        return response;
    }
}
