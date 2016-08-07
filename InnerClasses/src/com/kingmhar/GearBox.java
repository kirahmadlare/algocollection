package com.kingmhar;

import java.util.ArrayList;

/**
 * Created by Kingmhar on 7/24/16.
 */
public class GearBox {

    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);
    }

    public class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){

            return revs*(this.ratio);
        }
    }
}
