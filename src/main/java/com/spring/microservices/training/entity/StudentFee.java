package com.spring.microservices.training.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity(name = "STUDENT_FEE")
@Data
public class StudentFee {

    @Id
    @GeneratedValue
    public Integer studentFeeId;

    @JsonProperty("courseId")
    public Integer courseId;

    public Integer studentId;

    @JsonProperty("amountDue")
    public Double amountDue;

    @Override
    public String toString() {
        return "StudentFee{" +
                "studentFeeId=" + studentFeeId +
                ", courseId=" + courseId +
                ", amountDue=" + amountDue +
                ", amountPaid=" + amountPaid +
                ", paidDate=" + paidDate +
                '}';
    }

    @JsonProperty("amountPaid")
    public Double amountPaid;

    @JsonProperty("paidDate")
    @JsonFormat(pattern = "MM/dd/yyyy")
    public LocalDate paidDate;

    protected StudentFee(){

    }

    public StudentFee(Integer studentFeeId, Integer courseId,Double amountDue, Double amountPaid,LocalDate paidDate){
        this.studentFeeId=studentFeeId;
        this.courseId = courseId;
        this.amountDue=amountDue;
        this.amountPaid=amountPaid;
        this.paidDate = paidDate;
    }

}
