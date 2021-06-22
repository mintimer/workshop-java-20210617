package com.example.hellorest.employee;

public class Company{
    private String name;
    private String catchPhrase;
    private String bs;

    public Company() {
    }

    public Company(String name, String catchPhrase, String bs) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }

    public void setBs(String bs){
        this.bs = bs;
    }

    public String getBs(){
        return bs;
    }

    public void setCatchPhrase(String catchPhrase){
        this.catchPhrase = catchPhrase;
    }

    public String getCatchPhrase(){
        return catchPhrase;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
