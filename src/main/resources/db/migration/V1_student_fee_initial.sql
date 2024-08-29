CREATE TABLE STUDENT_FEE (
    studentFeeId BIGINT AUTO_INCREMENT PRIMARY KEY,
    studentId BIGINT,
    courseId BIGINT,
    amountDue DOUBLE ,
    amountPaid DOUBLE,
    paidDate DATE
);

CREATE TABLE COURSE_FEE (
    courseFeeId BIGINT AUTO_INCREMENT PRIMARY KEY,
    courseId BIGINT ,
    course VARCHAR(50),
    courseFee DOUBLE
);