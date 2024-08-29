package com.spring.microservices.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentFeeMicroservices {
    public static void main(String[] args) {
        SpringApplication.run(StudentFeeMicroservices.class, args);
        System.out.println("Student Fee Microservice");
    }
}