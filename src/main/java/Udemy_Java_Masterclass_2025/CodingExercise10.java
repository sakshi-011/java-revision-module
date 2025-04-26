package main.java.Udemy_Java_Masterclass_2025;

public class CodingExercise10 {

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        } else {
            int y = 0, d = 0;
            y = (int) (minutes / 60 / 24 / 365);
            d = (int) ((minutes / 60 / 24) % 365);
            System.out.println(minutes + " min = " + y + " y and " + d + " d");
        }
    }
}
