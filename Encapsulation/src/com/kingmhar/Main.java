package com.kingmhar;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Printer p1 = new Printer(2,12,true);
        System.out.println("toner:" + p1.getTonerLevel());
        p1.addToner(2);
        System.out.println("toner:" + p1.getTonerLevel());
        p1.printPage(3);
        System.out.println("current pages count:" + p1.getNumberOfPagesPrinted());


        //itm

        PrinterTim p2 = new PrinterTim(false,50);
        System.out.println("Initial page count: " + p2.getPagesPrinted());
        int pagesPrinted = p2.printPages(4);
        System.out.println("pages printed was: " + pagesPrinted + " new total print count = " + p2.getPagesPrinted());
        pagesPrinted = p2.printPages(2);
        System.out.println("pages printed was: " + pagesPrinted + " new total print count = " + p2.getPagesPrinted());

    }
}
