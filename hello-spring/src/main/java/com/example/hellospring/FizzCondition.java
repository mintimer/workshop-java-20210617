package com.example.hellospring;

public class FizzCondition implements MyCondition {
    public boolean check(String s) {
        return Integer.parseInt(s) % 3 == 0;
    }

    public String print() {
        return "Fizz";
    }
}
