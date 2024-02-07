package com.example.RestTemplate.repository;

import com.example.RestTemplate.bean.Subject;
import org.springframework.data.jpa.repository.JpaRepository;



public interface SubjectRepository extends JpaRepository<Subject,String> {


}