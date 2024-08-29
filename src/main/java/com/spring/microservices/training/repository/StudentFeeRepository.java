package com.spring.microservices.training.repository;

import com.spring.microservices.training.entity.StudentFee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentFeeRepository extends JpaRepository<StudentFee, Integer> {

    public List<StudentFee> findByStudentId(Integer studentId);
}
