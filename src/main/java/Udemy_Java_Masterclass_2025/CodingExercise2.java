package main.java.Udemy_Java_Masterclass_2025;

public class CodingExercise2 {

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0)
            return -1;
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if(milesPerHour == -1)
            System.out.print("Invalid Value");
        else
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}
