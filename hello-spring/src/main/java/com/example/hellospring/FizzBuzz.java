package com.example.hellospring;

public class FizzBuzz {
    private String result = "";

    public String get(String i) {
        ModThree(i);
        ModFive(i);
        if("".equals(result))
            return i;
        return result;
    }

    private void ModThree(String i) {
        if (Integer.parseInt(i) % 3 == 0)
            result += "Fizz";
    }

    private void ModFive(String i) {
        if (Integer.parseInt(i) % 5 == 0)
            result += "Buzz";
    }
}

