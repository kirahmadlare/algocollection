package com.kingmhar;

import java.util.ArrayList;

/**
 * Created by Kingmhar on 7/16/16.
 */
public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName)
    {
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount)
    {
        Branch branch = findBranch(branchName);
        if(branch != null)
        {
            return branch.newCustomer(customerName,initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName,String customerName,double amount)
    {
        Branch branch = findBranch(branchName);
        if(branch != null)
        {
            return branch.addCustomerTransaction(customerName,amount);
        }
        return false;
    }


    private Branch findBranch(String branchName)
    {

        for(int i = 0; i<this.branches.size() ; i++)
        {   Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(branchName))
                return checkedBranch;
        }

        return null;
    }



    public boolean listCustomer(String brancName,boolean showTransaction)
    {
        Branch branch = findBranch(brancName);
        if(branch != null)
        {
            System.out.println("Customers details for branch " + branch.getName() );
            ArrayList<Customer> branchCustomers = branch.getCustomers();

            for(int i = 0 ; i <branchCustomers.size() ; i++)
            {   Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + i + "]");
                if(showTransaction)
                {
                    System.out.println("Transactions:");
                    ArrayList<Double> transactions = branchCustomer.getTransaction();
                    for(int j = 0; j<transactions.size() ;j++)
                    {
                        System.out.println("[" + i + "]" + " amount: " + transactions.get(j));
                    }
                }
            }
        }
        return false;
    }


}
