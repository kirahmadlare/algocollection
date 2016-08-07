package com.mabel;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("King", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);


        calcFeetAndInchestoCentimeters(13, 0);
        calcFeetandInchestoCentimeters(157);

    }

    public static int calculateScore(String playerName, int playerScore){

        System.out.println("Player: " + playerName + " scored: " + playerScore + " points");
    return playerScore * 1000;
    }

    public static int calculateScore(int playerScore){

        System.out.println("Unamed Player: " + " scored: " + playerScore + " points");
        return playerScore * 1000;
    }

    public static int calculateScore(){

        System.out.println("No Player name, No player score");
        return 0;
    }

    public static double calcFeetAndInchestoCentimeters(double feet, double inches)
    {

        if(feet >= 0 ){
                if(inches >= 0 && inches <= 12  ) {
                    double centimeters =  (feet * 12) * 2.54;
                    centimeters += inches * 2.54;
                    System.out.println(feet +" feet, " + inches + " inches, centemiters = " + centimeters);
                }

            }
            return -1;
    }

    public static double calcFeetandInchestoCentimeters(double inches){

            if(inches>= 0){
                double feet = (int) inches/12;
                double remainingInches = (int) inches % 12;
                System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
                return  calcFeetAndInchestoCentimeters(feet, remainingInches);
            }
        return -1;

    }




}
