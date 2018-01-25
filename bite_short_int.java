package com.company;

public class Main {

    public static void main(String[] args) {

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien");

        int topScore = 100;
        if (topScore != 100)
            System.out.println("You got the high score!");

        boolean gameOver = false;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver == true) {
         int finalScore = score + (levelCompleted * bonus);
         System.out.println("Your final score was " + finalScore);
        } else {
            System.out.println("Got here");
        }


    }
}
