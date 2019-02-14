package com.getlose;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void bmiTest(){
        Person person = new Person(66f,185f);
        Assertions.assertEquals(66f/185f*185f,person.Bmi());
    }
}
