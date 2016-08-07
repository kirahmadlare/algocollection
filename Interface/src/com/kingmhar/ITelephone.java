package com.kingmhar;

/**
 * Created by Kingmhar on 7/19/16.
 */
public interface ITelephone {

    void powerOne();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
