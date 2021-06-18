package com.example.hellospring;

public class FizzBuzz {
    public String get(String s) {
        MyCondition[] myConditions = new MyCondition[]{
            new FizzBuzzCondition(),
            new FizzCondition(),
            new BuzzCondition(),
            new KBTGCondition()
        };

        for (MyCondition myCondition : myConditions) {
            if(myCondition.check(s)){
                return myCondition.print();
            }
        }
        return s;
    }
}

