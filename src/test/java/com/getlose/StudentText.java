package com.getlose;

import com.getlose.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentText {

    @Test
    public void averageScoreTest(){
        Student stu = new Student("aa",60,90);
        Assertions.assertEquals(75,stu.getAverage());
    }

    @Test
    public void highestScoreTest(){
        Student stu = new Student("aa",60,90);
        Assertions.assertEquals(90,stu.higher());
    }

}
