package com.company;

public class DepOfThePerson {
    //get the details of the person from reference calling
    public void depDetails(CommonDetails p){
        p.getDep();
        p.getFName();
        p.getLName();
        //System.out.println(p.getFName());
    }



    //problem is all the data comes to the method using reference variable
    //solution is using an interface including wantings  and inherits it to the DepOfthePerson
}
