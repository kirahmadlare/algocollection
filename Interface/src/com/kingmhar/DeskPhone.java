package com.kingmhar;

/**
 * Created by Kingmhar on 7/19/16.
 */
public class DeskPhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;


    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOne() {
        System.out.println("No action taken. desk phone does not have powerbutton");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("now ringing " + phoneNumber);
    }

    @Override
    public void answer() {
    if(isRinging)
    {
        System.out.println("Answering the deskphone");
        isRinging = false;
    }
    }

    @Override
    public boolean callPhone(int phoneNumber) {

        if (phoneNumber == myNumber)
        {
            isRinging = true;
            System.out.println("Rint ring");
        } else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
