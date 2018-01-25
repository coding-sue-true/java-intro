package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

//    STEP 2 OF THE EXERCISE
        calcFeetInchesToCentimeters(7, 1);

//    FOURTH STEP OF EXERCISE
        calcFeetInchesToCentimeters(10);

//    EXERCISE
//    Create a method called calcFeetAndInchesToCentimeters
//    It needs to have two parameters
//    feet is the first parameter, inches is the 2nd parameter
//
//    You should validate that the first parameter feet is >= 0
//    You should validate that the 2nd parameter inches is >=0 and <=12
//    return -1 from the method if either of the above is not true
//
//    If the parameters are valid, then calculate how many centimeters
//    comprise the feet and inches passed to this method and return
//    that value
//
//    Create a 2nd method of the same name but with only one parameter
//    inches is the parameter
//    validate that it is >=0
//    return -1 if it is not true
//    but if it is valid, then calculate how many feet are in the inches
//    and then here is the tricky part
//    call the other overloaded method passing the correct feet and inches
//    calculated so that it can calculate correctly
//    Hints: use double for your number datatypes is probably a good idea
//    1inch = 2.54cm and one foot = 12inches
//    Calling another overloaded method just requires you to use the
//    right number of parameters

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player, no name");
        return 0;
    }



//    SOLVED EXERCISE

//    FIRST STEP ON EXERCISE

    public static double calcFeetInchesToCentimeters(double feet, double inches) {
        if((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + "inches = " + centimeters + " cm");
        return centimeters;

    }

//    THIRD STEP OF EXERCISE

    public static double calcFeetInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet  = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetInchesToCentimeters(feet, inches);
    }
}
