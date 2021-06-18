package com.example.hellospring;

public class FizzBuzz {
    public String get(String i) {
        if (Integer.parseInt(i) % 3 == 0)
            return "Fizz";
        if (Integer.parseInt(i) % 5 == 0)
            return "Buzz";
        return i;
    }
}
