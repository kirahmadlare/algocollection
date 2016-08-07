package com.mabel;

/**
 * Created by mabelroa on 6/30/16.
 */
public class Love {

    public static void letter(){

        System.out.println("Hi Mabel, thank you for loving me and supporting me");
        System.out.println("I want to show you how blessed I am because of you");
        System.out.println("Here's the score :" + calculateLove(100));
        System.out.println("Lesson 30 Methods coding - but my love for you is infinity");
    }

    public static int calculateLove(int loveCount){

        if(loveCount >= 100) {
            return loveCount *3;
        } else if (loveCount >= 50 && loveCount < 100)
        {
            return loveCount * 2;
        }
        else
        {
            return loveCount;
        }

    }
}
