package com.kingmhar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by Kingmhar on 7/16/16.
 */
public class Demo
{
    public static void main(String[] args) {
        LinkedList<String> placesTovisit = new LinkedList<String>();
        addInOrder(placesTovisit,"Sydney");
        addInOrder(placesTovisit,"Melbourne");
        addInOrder(placesTovisit,"Brisbane");
        addInOrder(placesTovisit,"Perth");
        addInOrder(placesTovisit,"Canberry");
        addInOrder(placesTovisit,"Adelaide");
        addInOrder(placesTovisit,"Darwin");


        printList(placesTovisit);
        visit(placesTovisit);

    }

    private static void printList(LinkedList<String> linkedList)
    {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext())
        {
            System.out.println("Now visiting "+  i.next());

        }
        System.out.println("----------------------");
    }

    public static boolean addInOrder(LinkedList<String> linkedList, String newCity )
    {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext())
        {
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison ==0)
            {
                System.out.println(newCity + " is already added destination");
                return false;
            }else if(comparison >0)
            {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if(comparison < 0)
            {

            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    public static void visit(LinkedList cities)
    {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.getFirst() == "")
        {
            System.out.println("No cities in the iterenary");
            return;
        }else
        {
            System.out.println("now visting " + listIterator.next());
            printMenu();
        }

        while(!quit)
        {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action)
            {
                case 0:
                    System.out.println("Holdaiy vacation over");
                    quit=true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext())
                    {
                        System.out.println("now visiting " + listIterator.next());
                    }else
                    {
                        System.out.println("Reached the end of the list");
                    }
                    break;

                case 2:
                    if(goingForward)
                    {
                        if(listIterator.hasPrevious())
                        {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious())
                    {
                        System.out.println("now visiting " + listIterator.previous());
                    }
                    else
                    {
                        System.out.println("we are the start of the list");
                        goingForward = true;
                    }
                break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }



    private  static void printMenu()
    {
        System.out.println("Available actions: \n press ");
        System.out.println("0 - to quit\n" +
        "1 - go to next city\n" +
        "2 - go to prev city \n" +
        "3 - print menu");


    }
}
