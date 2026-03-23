package main.java.Udemy_Java_Masterclass_2025;

import java.util.Scanner;

public class CodingExercise28 {

    public static void inputThenPrintSumAndAverage(){
        int sum = 0, count = 0, n;
        long avg = 0;
        Scanner in = new Scanner(System.in);
        while(true){
            if(!in.hasNextInt())
                break;
            n = in.nextInt();
            sum += n;
            count++;
        }
        avg = Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
