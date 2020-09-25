package com.company;

public class Main {

    public static void main(String[] args) {

        int HighScore = calculateScore(true,8000,5, 100);
        System.out.println("Your final score was " + HighScore);

        int HighScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Keaton",HighScorePosition);

        HighScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Hannah",HighScorePosition);
    }

    public static void displayHighScorePosition(String PlayerName, int HighScorePosition) {
        System.out.println(PlayerName + " managed to get into position " + HighScorePosition);
    }

    public static int calculateHighScorePosition (int PlayerScore) {

        if (PlayerScore >= 1000) {
            return 1;
        } else if (PlayerScore >= 500 && PlayerScore < 1000) {
            return 2;
        } else if(PlayerScore > 100 && PlayerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }
}
