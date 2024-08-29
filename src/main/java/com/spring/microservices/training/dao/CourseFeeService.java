package com.spring.microservices.training.dao;

import com.spring.microservices.training.entity.CourseFee;
import com.spring.microservices.training.repository.CourseFeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseFeeService {

    private final CourseFeeRepository courseFeeRepository;

    public CourseFee save(CourseFee courseFee){
        return courseFeeRepository.save(courseFee);
    }

    public List<CourseFee> courseFees(List<CourseFee> courseFees){
        return courseFeeRepository.saveAll(courseFees);
    }

    public List<CourseFee> courseFees(){
        return courseFeeRepository.findAll();
    }

    public CourseFee courseFees(Integer courseId){
        return courseFeeRepository.findByCourseId(courseId);
    }

}
