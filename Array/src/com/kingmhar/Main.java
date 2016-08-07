package com.kingmhar;

import java.util.Scanner;


public class Main {

    private static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);

        // System.out.println("The average is " + getAverage(myIntegers));

        //test challenge

        int score1 = calculateHighScorePosition(100);
        displayHighScore("tim",score1);
    }


    public static int calculateHighScorePosition(int score)
    {
        if(score>1000)
        {
            return 1;
        }else if (score >500 && score < 1000)
        {
            return 2;
        }else if(score > 100 && score < 500)
        {
            return 3;
        }
        else {
            return 4;
        }

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array)
    {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i +", typed value was " + array[i]);
            //        System.out.println(sortInteger(myIntegers[i]));
        }
    }


//sorting descending

    public static int[] sortIntegers(int[] array)
    {
        int[] sortedArray = new int[array.length];
        for(int i = 0 ; i < array.length; i++)
        {
            sortedArray[i] = array[i];

        }
        boolean flag = true;
        int temp;

        while(flag)
        {
            flag = false;
            for(int i = 0 ; i < sortedArray.length - 1; i++)
            {
                if(sortedArray[i] < sortedArray[i+1])
                {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return  sortedArray;
    }

    public static void displayHighScore(String name,int position)
    {
        System.out.println(name + " manged to get in the position " + position + " on the high score table");
    }



}