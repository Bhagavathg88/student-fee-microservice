package com.spring.microservices.training.controller;

import com.spring.microservices.training.dao.StudentFeeService;
import com.spring.microservices.training.entity.StudentFee;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentFeeController {

   private final StudentFeeService studentFeeService;

   @GetMapping("/student/{studentId}")
   public ResponseEntity<List<StudentFee>> getStudentFees(@PathVariable Integer studentId){
      return ResponseEntity.ok(studentFeeService.fetchStudentFees(studentId));
   }

   @PostMapping("/student/fees")
   public StudentFee feePayment(@RequestBody StudentFee studentFee){
      return studentFeeService.feePayment(studentFee);
   }

}
