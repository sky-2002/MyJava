package com.sky;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myScore = calculateScore(true,1050,1);
        displayHighScorePosition("Aakash",myScore);

    }

    public static int calculateScore(boolean gameOver,int bonus,int level){
        if (gameOver)
            return bonus*level + 100;
        return -1;
    }

    public static void displayHighScorePosition(String name,int score){
        System.out.println("Player "+name+" managed to get"+
                " position "+calculateHighScorePosition(score)+
                " on the High score table"
        );
    }

    public static int calculateHighScorePosition(int score){
        if (score>=1000)
            return 1;
        else if (score>=500)
            return 2;
        else if (score>=100)
            return 3;
        else
            return 4;
    }
}
