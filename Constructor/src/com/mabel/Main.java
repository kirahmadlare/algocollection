package com.mabel;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAccount c1 = new BankAccount();
        c1.setAccountNumber(1);
        c1.setBalanceNumber(1000);
        c1.setCustomerName("King");
        c1.setEmail("king@one.com");
        c1.setPhoneNumber("0507071302");

        System.out.println("Account number: " + c1.getAccountNumber());

        System.out.println("Balance: " + c1.getBalanceNumber());

        System.out.println("Name: " + c1.getCustomerName());

        System.out.println("Email: " + c1.getEmail());

        System.out.println("Phone Number: " + c1.getPhoneNumber());

        c1.depositFunds(500);
        System.out.println("Total balance " + c1.getBalanceNumber());
        c1.withdrawFunds(200);
        System.out.println("Total balance " + c1.getBalanceNumber());
        c1.withdrawFunds(1400);
        System.out.println("Total balance " + c1.getBalanceNumber());

        //test the challenge

        VipCustomter king = new VipCustomter();
        System.out.println("name: " + king.getName() + " balance: " + king.getCreditLimit() + " email: " + king.getEmailAddress() );


    }
}
