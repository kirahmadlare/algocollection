package com.mabel;

/**
 * Created by mabelroa on 7/5/16.
 */
public class Outalander extends Car {

    private int roadServiceMonths;

    public Outalander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;


    }

    public void accelarate(int rate)
    {
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity ==0)
        {
            stop();
            setCurrentGear(1);
        }
        else if (newVelocity > 0 && newVelocity <= 10)
        {
            setCurrentGear(1);
        }else if (newVelocity > 10 && newVelocity <= 20)
        {
            setCurrentGear(2);
        }
        else if (newVelocity > 20 && newVelocity <= 30)
        {
            setCurrentGear(3);
        }
        else
        {
            setCurrentGear(4);
        }

        if(newVelocity>0)
        {
            changeVelocity(newVelocity,getCurrentDirection());
        }

    }
}
