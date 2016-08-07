package com.mabel;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // int has a width of 32
//        int myMinValue = -2_147_483_648;
//        int myMaxValue = 2_147_483_647;
//        int myTotal =(myMinValue/2);
//        System.out.println(myTotal);
//        // byte has a width of 3
//        byte myByteValue = -128; //max 127
//        byte myNewByteValue = (byte) (myByteValue/2);
//        System.out.println(myNewByteValue);
//        // short has a width of 16
//        short myShortValue = 32767; // min - 32766
//        short myShorNewValue =(short) (myShortValue/2);
//        //long has a width of 64 2- to the power 63
//        long myLongValue = 100L;
//
        //training

        byte myByte = 28;
        short myShort = 16;
        int myInt = 288;
        long myLong = 50000 + (10 * (myByte + myInt + myShort));
        System.out.println("Total= " + myLong);

    }
}
