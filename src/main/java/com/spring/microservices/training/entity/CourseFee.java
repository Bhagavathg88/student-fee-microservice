package com.spring.microservices.training.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "COURSE_FEE")
@Data
public class CourseFee {

    @Id
    @GeneratedValue
    public Integer courseFeeId;

    public Integer courseId;

    public String course;
    public Double courseFee;

    public CourseFee() {
    }

    public CourseFee(Integer courseFeeId, Integer courseId, String course, Double courseFee) {
        this.courseFeeId = courseFeeId;
        this.courseId = courseId;
        this.courseFee = courseFee;
        this.course = course;
    }
}
