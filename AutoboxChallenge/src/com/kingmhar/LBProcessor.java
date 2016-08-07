package com.kingmhar;

import java.util.ArrayList;

/**
 * Created by Kingmhar on 7/16/16.
 */
public class LBProcessor {

    private String name;
   private ArrayList<LBheadquarters> hq;

    public LBProcessor(String name) {
        this.name = name;
        this.hq = new ArrayList<LBheadquarters>();
    }

    public boolean addHQ(String hqName)
    {
        if(findHQ(hqName) == null)
        {
            this.hq.add(new LBheadquarters(hqName));
            return true;

        }

        return false;
    }

    public boolean addLBCustomer(String hqName,String customerName,double amount)
    {
        LBheadquarters hq = findHQ(hqName);
        if(hq != null)
        {
            return hq.newLBCustomer(customerName,amount);
        }

        return false;
    }

    public boolean addLBCustomerTransaction(String hqName, String customerName, double amount)
    {
        LBheadquarters hq = findHQ(hqName);
        if(hq != null)
        {
            return hq.addCustomerTransaction(customerName,amount);
        }
        return false;
    }



    public LBheadquarters findHQ(String customerName)
    {
        for(int i = 0 ; i <this.hq.size();i++)
        {
            LBheadquarters checkedHQ= this.hq.get(i);
            if(this.hq.get(i).getName().equals(customerName))
            {
                return checkedHQ;
            }

        }
        return null;
    }

    public boolean listCustomer(String hqName, boolean showTransaction) {
        LBheadquarters hq = findHQ(hqName);
        if (hq != null) {
            System.out.println("Customer details for HQ " + hq.getName());
            ArrayList<LBCustomer> hqCustomers = hq.getLbCustomersmer();


            for (int i = 0; i < hqCustomers.size(); i++) {
                    LBCustomer hqCustomer = hqCustomers.get(i);
                    System.out.println("Customer: " + hqCustomer.getName() + "[" + i + "]");

                if(showTransaction)
                {
                    System.out.println("transactions: ");
                    ArrayList<Double> amount = hqCustomer.getAmount();

                    for(int j=0;j<amount.size();j++){
                    System.out.println("[" + i + "] amount: " + amount.get(j));
                    }

            }
        }

    }
        return false;
}
}