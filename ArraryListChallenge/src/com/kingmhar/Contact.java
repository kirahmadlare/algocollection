package com.kingmhar;

/**
 * Created by Kingmhar on 7/16/16.
 */
public class Contact {

   private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phonenUmber)
    {
        return new Contact(name,phonenUmber);
    }
}
