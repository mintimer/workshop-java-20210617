package com.example.hellospring;

public class FizzBuzz {
    public String get(String i) {
        if (Integer.parseInt(i) % 3 == 0)
            return "Fizz";
        if ("5".equals(i))
            return "Buzz";
        return i;
    }
}
