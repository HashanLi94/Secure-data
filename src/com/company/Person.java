package com.company;

public class Person implements CommonDetails{
    public String fName = "John";
    public String lName = "Peter";
    public int age = 23;
    public String dep = "SE";
    public String pwd = "Newpass1234";

    @Override
    public String getFName() {
        return fName;
    }

    @Override
    public String getLName() {
        return lName;
    }

    @Override
    public String getDep() {
        return dep;
    }
}


