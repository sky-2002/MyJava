package com.sky;

public class Person {
    private String firstName,lastName; //both are private and String
    private int age;
    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public int getAge(){return this.age;}
    public void setFirstName(String fName){this.firstName=fName;}
    public void setLastName(String lName){this.lastName=lName;}
    public void setAge(int age){
        if (age<0 || age>100)
            this.age=0;
        else
            this.age=age;
    }
    public boolean isTeen(){
        return this.age > 12 && this.age < 20;
    }
    public String getFullName(){
        if (this.firstName.isEmpty() && this.lastName.isEmpty())
            return "";
        if (this.firstName.isEmpty())
            return this.lastName;
        if (this.lastName.isEmpty())
            return this.firstName;
        return this.firstName + " " +this.lastName;
    }

}

