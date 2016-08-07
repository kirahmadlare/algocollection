package com.kingmhar;

public class Main {

    public static void main(String[] args) {
	// write your code here

        GearBox mclaren = new GearBox(6);
        GearBox.Gear first = mclaren.new Gear ( 1, 12.3);
       // GearBox.Gear second = new GearBox.Gear(3, 21.2);
        System.out.println(first.driveSpeed(1000));


    }
}
