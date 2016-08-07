package com.kingmhar;

public class Main {

    public static void main(String[] args) {
	// write your code here

ITelephone timsPhone;
        timsPhone = new DeskPhone(123213);
        timsPhone.powerOne();
        timsPhone.callPhone(123213);
        timsPhone.answer();

        timsPhone = new MobilePhone(24565);
        timsPhone.powerOne();
        timsPhone.callPhone(24565);
        timsPhone.answer();
    }
}
