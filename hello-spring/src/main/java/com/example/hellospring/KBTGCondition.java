package com.example.hellospring;

public class KBTGCondition implements MyCondition {
    @Override
    public boolean check(String s) {
        return Integer.parseInt(s) % 7 == 0;
    }

    @Override
    public String print() {
        return "KBTG";
    }
}
