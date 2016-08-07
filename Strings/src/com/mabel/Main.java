package com.mabel;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //primitive type
        //byte
        //short
        //int
        //long
        //double
        //float
        //boolean
        //char

        String myString = "This is a String";
        System.out.println("myString = " + myString);
        myString = myString + ", and this more";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "18";
        int myInt = 18;
        lastString = lastString + myInt;
        System.out.println(lastString);
        double doubleNumber = 129.47;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);

    }
}
