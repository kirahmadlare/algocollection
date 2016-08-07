package com.mabel;

/**
 * Created by mabelroa on 7/4/16.
 */
public class BankAccount {

    private int accountNumber;
    private int balanceNumber;
    private String customerName;
    private String email;
    private String phoneNumber;
//setter
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public void setBalanceNumber(int balanceNumber)
    {
        this.balanceNumber = balanceNumber;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    //getter

    public int getAccountNumber()
    {
        return  this.accountNumber;
    }
    public int getBalanceNumber()
    {
        return  this.balanceNumber;
    }
    public String getCustomerName()
    {
        return  this.customerName;
    }
    public String getEmail()
    {
        return  this.email;
    }
    public String getPhoneNumber()
    {
        return  this.phoneNumber;
    }

    public int depositFunds(int amount)
    {
        this.balanceNumber += amount;
        return  this.balanceNumber;
    }
    public int withdrawFunds(int amount) {
        if (amount <= this.balanceNumber) {
            this.balanceNumber -= amount;
        } else {
            System.out.println("Insuficient amount");

        }
        return -1;
    }
}
