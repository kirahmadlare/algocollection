package com.mabel;

public class Main {

    public static void main(String[] args) {

        int levelCompleted = 5;
        int bonus = 100;

           int highScore = calculateScore(true,800,levelCompleted, bonus);
        displayHighScorePoistion("King Mhar", 499);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted  * bonus);
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePoistion(String playersName, int playerScore ) {

        System.out.println(playersName +" managed to get into position " + calculateHighScorePosition(playerScore));


    }
    public static int calculateHighScorePosition(int playerScore){

        if(playerScore >= 1000) {
            return 1;
        } else if ( playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500)
        {
            return  3;
        }
        else {
            return 4;
        }

    }

}
