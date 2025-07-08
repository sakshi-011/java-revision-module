package main.java.Udemy_Java_Masterclass_2025;

import java.util.Scanner;

public class CodingExercise13 {

    public static void printNumberInWord(int number){
        System.out.println( switch (number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        });
    }

    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(2);
        printNumberInWord(-376);
        printNumberInWord(9);
        printNumberInWord(32);
        printNumberInWord(4);
    }
}
