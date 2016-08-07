package com.mabel;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220b", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inc Beast", "Acer", 2, new Resolution(2530,1400));

        Motherboard theMotherboard = new Motherboard("BJ-2300","Asus",4,6,"v.2.44");

        PC thePC = new PC(theCase,theMonitor,theMotherboard);

        Windows theWin = new Windows(200,200,"circle");
        Furniture theFur = new Furniture("Sofa","old","green");

        House theHouseA = new House(theWin,theFur);

        theHouseA.displayItem();
        theHouseA.getTheFur();
    }
}
