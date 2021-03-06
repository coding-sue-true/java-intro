package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 800;
	    int levelCompleted = 5;
	    int bonus = 100;

	    int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);
//	    calculateScore(true, 800, 5, 100);

//	    calculateScore(true, 10000, 8, 200);

//    EXERCISE
//    create a method called displayHighScorePosition
//    it should have players name as a parameter, and a 2nd parameter as a psoition in the high score table
//            You should display the players name along with a message like 'managed to get into position'
//    and the position they got and a further message 'on the high score table'
//
//    create a 2nd method called calculateHighScorePosition
//    it should be sent one argument only, the player score
//    it should return an int
//    the return data should be
//    1 if the score is >1000
//    2 if the score is >500 and <1000
//    3 if the score is >100 and <500
//    4 in all other cases
//    call both methods and display the results of the following
//    a score of 1500, 900, 400 and 50

//    EXERCISE SOLUTION
//    THIRD STEP OF EXERCISE
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);
    }

//    FIRST STEP OF EXERCISE
    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + "on the high score table");
    }

//    SECOND STEP OF THE EXERCISE
    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

//    END OF EXERCISE


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1;
    }






}
