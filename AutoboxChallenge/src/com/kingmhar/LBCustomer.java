package com.kingmhar;

import java.util.ArrayList;

/**
 * Created by Kingmhar on 7/16/16.
 */
public class LBCustomer {

    private String name;
    private ArrayList<Double> amount;

    public LBCustomer(String name, double initialAmount) {
        this.name = name;
        this.amount = new ArrayList<Double>();

    }

    public void addTransaction(double amount)
    {
         this.amount.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getAmount() {
        return amount;
    }
}
