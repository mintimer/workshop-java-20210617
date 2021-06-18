package com.example.hellospring;

public class BuzzCondition implements MyCondition {
    @Override
    public boolean check(String s) {
        return Integer.parseInt(s) % 5 == 0;
    }

    @Override
    public String print() {
        return "Buzz";
    }
}
