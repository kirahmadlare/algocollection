package com.kingmhar;

/**
 * Created by Kingmhar on 7/19/16.
 */
public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOne() {
        isOn = true;
        System.out.println("No action taken. desk phone does not have powerbutton");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn)
        {
            System.out.println("now ringing " + phoneNumber);
        }else
        {
            System.out.println("Phone is switched off");
        }

    }

    @Override
    public void answer() {
        if(isRinging)
        {
            System.out.println("Answering the mobiephone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {

        if (phoneNumber == myNumber && isOn)
        {
            isRinging = true;
            System.out.println("melody  ring");
        } else{
            isRinging = false;
            System.out.println("mobile phone not on");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
