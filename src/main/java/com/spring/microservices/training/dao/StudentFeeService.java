package com.spring.microservices.training.dao;


import com.spring.microservices.training.entity.StudentFee;
import com.spring.microservices.training.repository.StudentFeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentFeeService {

    private final StudentFeeRepository studentFeeRepository;


    public List<StudentFee> fetchStudentFees(Integer studentId) {
        return studentFeeRepository.findByStudentId(studentId);
    }

    public StudentFee feePayment(StudentFee studentFee){
        return studentFeeRepository.save(studentFee);
    }
}
