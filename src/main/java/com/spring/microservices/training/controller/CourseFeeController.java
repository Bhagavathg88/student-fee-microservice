package com.spring.microservices.training.controller;

import com.spring.microservices.training.dao.CourseFeeService;
import com.spring.microservices.training.entity.CourseFee;
import com.spring.microservices.training.repository.CourseFeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CourseFeeController {

    private final CourseFeeService courseFeeService;

    @PostMapping("/courses/fee")
    public ResponseEntity<CourseFee> courseFee(@RequestBody CourseFee courseFee){
        return ResponseEntity.ok(courseFeeService.save(courseFee));
    }

    @PostMapping("/courses/fees")
    public ResponseEntity<List<CourseFee>> courseFee(@RequestBody List<CourseFee> courseFees){
        return ResponseEntity.ok(courseFeeService.courseFees(courseFees));
    }

    @GetMapping("/courses/fee")
    public ResponseEntity<List<CourseFee>> courseFee(){
        return ResponseEntity.ok(courseFeeService.courseFees());
    }

    @GetMapping("/course/{courseId}/fee")
    public ResponseEntity<CourseFee> courseFees(@PathVariable  Integer courseId){
        return ResponseEntity.ok(courseFeeService.courseFees(courseId));
    }
}
