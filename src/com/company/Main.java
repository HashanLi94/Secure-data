package com.company;

public class Main {

    public static void main(String[] args) {
	CommonDetails p = new Person();
	p.getLName();
	p.getFName();
	p.getDep();
        System.out.println(p.getFName() + p.getLName() + p.getDep());
//        DepOfThePerson dep = new DepOfThePerson();
//        dep.depDetails(p);

    }
}
