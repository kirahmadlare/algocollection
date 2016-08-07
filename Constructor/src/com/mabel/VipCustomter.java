package com.mabel;

/**
 * Created by mabelroa on 7/4/16.
 */
public class VipCustomter {
    private String name;
    private int creditLimit;
    private String emailAddress;
//3
    public VipCustomter(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    //2
    public VipCustomter(String name,String emailAddress)
    {
        this(name,0,emailAddress);
    }

    public VipCustomter()
    {
        this.name = "King";
        this.creditLimit = 0;
        this.emailAddress="kmmb@one.com";
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
