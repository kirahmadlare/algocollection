package com.kingmhar;

import java.util.ArrayList;

/**
 * Created by Kingmhar on 7/16/16.
 */
public class LBheadquarters {

    private String name;
    private ArrayList<LBCustomer> lbCustomer;

    public LBheadquarters(String name) {
        this.name = name;
        this.lbCustomer = new ArrayList<LBCustomer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<LBCustomer> getLbCustomersmer() {
        return lbCustomer;
    }

    public boolean newLBCustomer(String customerName,double amount)
    {
        if(findCustomer(customerName) == null)
        {
            this.lbCustomer.add(new LBCustomer(customerName,amount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName,double amount)
    {
        LBCustomer existingLBcustomer = findCustomer(customerName);
        if(existingLBcustomer != null)
        {
            existingLBcustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    public LBCustomer findCustomer(String customerName)
    {
        for(int i = 0 ; i <this.lbCustomer.size();i++)
        {
            LBCustomer checkedLBCustomer = this.lbCustomer.get(i);
            if(this.lbCustomer.get(i).getName().equals(customerName))
            {
                return checkedLBCustomer;
            }

        }
        return null;
    }
}
