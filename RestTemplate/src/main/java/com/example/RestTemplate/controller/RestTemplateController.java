package com.example.RestTemplate.controller;

import com.example.RestTemplate.service.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restTemplate")
public class RestTemplateController {
    @Configuration
    public class MyConfiguration {
        @Bean
        public RestTemplateService restTemplateService() {
            return new RestTemplateService();
        }
    }


    @GetMapping("/getAllSubjects")
    public ResponseEntity<String> getAllSubjects(){
        return RestTemplateService.allSubjects();
    }
}
