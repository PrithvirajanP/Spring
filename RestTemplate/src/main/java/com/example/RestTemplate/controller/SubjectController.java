package com.example.RestTemplate.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.example.RestTemplate.Response;
import com.example.RestTemplate.bean.Subject;
import com.example.RestTemplate.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    private static String get_All_Subjects_URL = "http://localhost:9111/getAllSubjects";

    LocalDateTime currentDateTime = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
    String formattedDateTime = currentDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

    @RequestMapping("/getAllSubjects")
    public ResponseEntity<List<Subject>> getAllSubjects() {

        return new ResponseEntity<>(subjectService.getAllSubjects(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value="/addSubject")
    public ResponseEntity<Response> addSubject(@RequestBody Subject subject)
    {
        subjectService.addSubject(subject);
        return new ResponseEntity<>(new Response(formattedDateTime, HttpStatus.OK.value(), HttpStatus.OK.toString(), "Subject Added"), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/updateSubject/{id}")
    public ResponseEntity<Response> updateSubject(@PathVariable String id, @RequestBody Subject subject)
    {
        subjectService.updateSubject(id, subject);
        return new ResponseEntity<>(new Response(formattedDateTime, HttpStatus.OK.value(), HttpStatus.OK.toString(), "Subject Updated"), HttpStatus.OK);

    }
    @RequestMapping(method = RequestMethod.DELETE, value="/deleteSubject/{id}")
    public ResponseEntity<Response> DeleteSubject(@PathVariable String id)
    {
        subjectService.deleteSubject(id);
        return new ResponseEntity<>(new Response(formattedDateTime, HttpStatus.OK.value(), HttpStatus.OK.toString(), "Subject Deleted"), HttpStatus.OK);

    }








}