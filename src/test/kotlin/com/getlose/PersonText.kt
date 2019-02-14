package com.getlose.kotlin

import com.getlose.Human
import com.getlose.Person
import com.getlose.student.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
//全部測試的話，方法不會按順序執行
//kotlin可以測試java
class PersonTest{

    @Test
    fun bimTest(){
        val h = Human(40f,150f)
        Assertions.assertEquals(40f/(150f*150f),h.Bmi())
    }

    @Test
    fun personTest(){
        val p = Person(80f,182f)
        Assertions.assertEquals(80f/182f*182f,p.Bmi())
    }

    @Test
    fun highestTest(){
        val stu = Student("eerer",english = 40,math = 50)
        Assertions.assertEquals((40+50)/2,stu.getAverage())
    }

}

