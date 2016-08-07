package com.kingmhar;

import  java.util.Scanner;
public class Main {


    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("093 023 022");
    public static void main(String[] args) {
        // write your code here

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter your action: (6 to show available option) ");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;1
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }


        }
    }


    private static void addNewContact()
    {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name,phone);

        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added name: " + name + ", phone: " + phone);
        }else
        {
            System.out.println("Cannot add new contact already existing");
        }
    }


    private static void updateContact()
    {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord= mobilePhone.queryContact(name);
        if(existingContactRecord == null)
        {
            System.out.println("Contact not found");
        }
        System.out.println("Enter new contact name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number:");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newNumber);
        if (mobilePhone.updateContact(existingContactRecord,newContact))
        {
            System.out.println("succesfully updated record");
        }
        else
        {
            System.out.println("Error updating record");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
        }

        if(mobilePhone.removeContact(existingContactRecord))
        {
            System.out.println("successfully remmoved");
        }else
        {
            System.out.println("error delting");
        }
    }


    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
        }

        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());


    }

        private static void startPhone()
        {
            System.out.println("Starting phone ....");
        }

        public static void printActions()
        {
            System.out.println("\nAvailable actions: \npress");
            System.out.println( "0 - to shutdown \n" +
                                "1 - to print contacts\n" +
                                "2 - to add new contacts\n" +
                                "3 - to update existing contacts\n" +
                                "4 - to remove existing contacts exists \n" +
                                "5 - query if an existing contact\n" +
                                "6 - to print a list of available contact\n"
            );
            System.out.println("Choose your account: ");


        }
    }

