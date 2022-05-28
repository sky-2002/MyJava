package com.sky;

public class BankAccount {
    private int accountNumber,balance,phoneNumber;
    private String customerName,email;
    public void setAccountNumber(int an){this.accountNumber=an;}
    public void setBalance(int bal){this.balance=bal;}
    public void setPhoneNumber(int pn){this.phoneNumber=pn;}
    public void setCustomerName(String name){this.customerName=name;}
    public void setEmail(String em){this.email=em;}
    public int getAccountNumber(){return this.accountNumber;}
    public int getBalance(){return this.balance;}
    public int getPhoneNumber(){return this.phoneNumber;}
    public String getCustomerName(){return this.customerName;}
    public String getEmail(){return this.email;}

    public BankAccount(){
        System.out.println("New account created.");
        this.balance=0;
    }

    public void deposit(int amount){
        if (amount<0)
            System.out.println("Invalid request.");
        else{this.balance+=amount;
        System.out.println("Amount "+amount+" deposited successfully. New balance is "+this.balance);
    }
    }
    public void withdraw(int amount){
        if (amount<0)
            System.out.println("Invalid request.");
        else if (this.balance<amount)
            System.out.println("You do not have enough balance.");
        else {
            this.balance-=amount;
            System.out.println("Amount "+amount+" withdrawn successfully. New balance is "+this.balance);
        }
    }
}
