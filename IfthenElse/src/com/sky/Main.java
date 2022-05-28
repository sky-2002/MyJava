package com.sky;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver = true;
        int score = 4000;
        int bonus = 100;
        int level = 5;
        if (gameOver){
            int finalScore = calculateScoreInt(score,bonus,level);
            System.out.println("Final score is :"+finalScore);
        }

        score = 50;
        bonus = 100;
        level = 2;
        if (gameOver){
            int finalScore = calculateScoreInt(score,bonus,level);
            System.out.println("Final score is :"+finalScore);
        }
    }

    public static void calculateScore(int score,int bonus,int level){
        System.out.println("Final score is "+(score+bonus*level));
    }
    public static int calculateScoreInt(int score,int bonus,int level){
        return (score+level*bonus);
    }
}
