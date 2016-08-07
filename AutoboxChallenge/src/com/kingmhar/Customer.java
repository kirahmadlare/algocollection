package com.kingmhar;

import java.util.ArrayList;

/**
 * Created by Kingmhar on 7/16/16.
 */
public class Customer {
    private String name;
    private ArrayList<Double> transaction;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transaction = new ArrayList<Double>();
        addTransaction(initialAmount);

      //  this.transaction = transaction;
    }


    public void addTransaction(double amount)
    {
        this.transaction.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }
}

