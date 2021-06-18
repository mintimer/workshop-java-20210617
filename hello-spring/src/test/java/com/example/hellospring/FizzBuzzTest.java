package com.example.hellospring;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    @DisplayName("1=>1")
    public void case01 (){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.get("1");
        assertEquals("1",result);
    }

    @Test
    @DisplayName("2=>2")
    public void case02 (){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.get("2");
        assertEquals("2",result);
    }

    @Test
    @DisplayName("3=>Fizz")
    public void case03 () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.get("3");
        assertEquals("Fizz", result);
    }

    @Test
    @DisplayName("4=>4")
    public void case04 () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.get("4");
        assertEquals("4", result);
    }

    @Test
    @DisplayName("5=>Buzz")
    public void case05 () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.get("5");
        assertEquals("Buzz", result);
    }

    @Test
    @DisplayName("6=>6")
    public void case06 () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.get("6");
        assertEquals("Fizz", result);
    }
}