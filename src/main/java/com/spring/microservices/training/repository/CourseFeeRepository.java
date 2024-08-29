package com.spring.microservices.training.repository;

import com.spring.microservices.training.entity.CourseFee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseFeeRepository extends JpaRepository<CourseFee, Integer> {

        public CourseFee findByCourseId(Integer courseId);

}
