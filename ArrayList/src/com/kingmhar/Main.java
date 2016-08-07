package com.kingmhar;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList gl = new GroceryList();
    public static void main(String[] args) {
	// write your code here

        GroceryList g1 = new GroceryList();
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while(!quit)
        {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice)
            {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    gl.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }

    }


    public static void printInstruction()
    {
        System.out.println("\nPress ");
        System.out.println("\t 0 - to print the choice options ");
        System.out.println("\t 1-  to print the list of grocery items");
        System.out.println("\t 2 - to add an item to the list ");
        System.out.println("\t 3 - to modify an item to the list ");
        System.out.println("\t 4 - to remove an item from the list ");
        System.out.println("\t 5 - to seacrc for an item in the list");
        System.out.println("\t 6 - to quit the application");

    }

    public static void addItem()
    {
        System.out.print("Please enter the grocery item: ");
        gl.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem()
    {
        System.out.println("Current Item name: ");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter new  item: ");
        String  newItem = scanner.nextLine();
        gl.modifyGroceryItem(itemNo,newItem);
    }

    public static void removeItem()
    {

        System.out.println("Enter Item number: ");
        String itemNo = scanner.nextLine();
       scanner.nextLine();
        gl.removeGroceryItem(itemNo);
    }

    public static void searchItem()
    {
        System.out.println("Item tp search for: ");
        String searchItem = scanner.nextLine();
       if(gl.onFile(searchItem))
       {
           System.out.println("Found " + searchItem + " in our grocery");


       }else
       {
           System.out.println(searchItem + " is not in the shopping list");
       }


    }

    public static void processArrayList()
    {
        ArrayList<String> newArray= new ArrayList<String>();
        newArray.addAll(gl.getGrocerList());

        //other way is
        ArrayList<String> nextArray = new ArrayList<String>(gl.getGrocerList());
        String[] myArray = new String[gl.getGrocerList().size()];
        myArray = gl.getGrocerList().toArray(myArray);
    }



}
