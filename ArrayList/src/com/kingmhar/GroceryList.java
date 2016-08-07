package com.kingmhar;

import java.util.ArrayList;

/**
 * Created by Kingmhar on 7/15/16.
 */
public class GroceryList {

    private ArrayList<String> grocerList = new ArrayList<String>();


    public void addGroceryItem(String item)
    {
        grocerList.add(item);
    }

    public ArrayList<String> getGrocerList() {
        return grocerList;
    }

    public void printGroceryList(){

        System.out.println("You have " + grocerList.size() + " items in your grocery");
        for (int i = 0; i< grocerList.size(); i++ )
        {
            System.out.println(i+1 + ". " + grocerList.get(i));

        }
    }
    public void modifyGroceryItem(String currentitem, String newItem) {
        int position = findItem(currentitem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }
    private void modifyGroceryItem(int position, String newItem)
    {
        grocerList.set(position,newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }

    public void removeGroceryItem(String newItem)
    {
        int position = findItem(newItem);
        if(position >= 0) {
            removeGroceryItem(newItem);
        }
    }
    private void removeGroceryItem(int poistion)
    {

        grocerList.remove(poistion);
    }

    public int findItem(String searchItem)
    {
       // boolean exists = grocerList.contains(searchItem);

            return grocerList.indexOf(searchItem);

    }

    public boolean onFile(String searchItem) {
    int position = findItem(searchItem);
         if(position >= 0)
         {
            return true;
         }

        return  false;
    }


}
