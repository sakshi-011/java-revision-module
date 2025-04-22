package main.java.Udemy_Java_Masterclass_2025;

public class CodingExercise5 {

    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if(year % 4 != 0)
                return false;
            if(year % 100 != 0)
                return true;
            if(year % 400 == 0)
                return true;
        }
        return false;
    }
}
