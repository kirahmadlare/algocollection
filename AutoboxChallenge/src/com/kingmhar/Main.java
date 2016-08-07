package com.kingmhar;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bank bank = new Bank("Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide","tim",50.50);
        bank.addCustomer("Adelaide","Mark",60.50);
        bank.addCustomer("Adelaide","Bob",10.50);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney","Yow",12.50);
        bank.addCustomerTransaction("Adelaide","tim", 10.00);
        bank.addCustomerTransaction("Adelaide","tim", 12.00);
        bank.addCustomerTransaction("Adelaide","Mark", 165.00);

        bank.listCustomer("Adelaide",true);

        if(!bank.addCustomer("Melbourne","brian", 222))
        {
            System.out.println("error");
        }


        ///redo code;

        LBProcessor p = new LBProcessor("Pinas");
        p.addHQ("HQ1");
        p.addHQ("HQ2");
        p.addLBCustomer("HQ1","king",100);
        p.addLBCustomer("HQ2","Mabel", 200);
    }
}
