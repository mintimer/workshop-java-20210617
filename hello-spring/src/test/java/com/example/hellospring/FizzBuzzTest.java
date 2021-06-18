package com.example.hellospring;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    @DisplayName("1=>1")
    public void case01 (){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.get(1);
        assertEquals("1",result);
    }

}