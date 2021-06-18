package com.example.hellospring;

public class FizzBuzz {
    public String get(String i) {
        if ("3".equals(i))
            return "Fizz";
        if ("5".equals(i))
            return "Buzz";
        return i;
    }
}
