package com.aysimasavas.quizapplication.utils;

public class GeneratorUtils {
    public static int generateRandomNumber(int max, int min) {
        return (int) (Math.random() * (max - min) + min);
    }
}
