package com.example.hellospring;

public class FizzBuzzCondition implements MyCondition {
    public boolean check(String s) {
        return Integer.parseInt(s) % 15 == 0;
    }

    public String print() {
        return "FizzBuzz";
    }
}
