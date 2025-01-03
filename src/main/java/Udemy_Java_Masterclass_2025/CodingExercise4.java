package main.java.Udemy_Java_Masterclass_2025;

public class CodingExercise4 {

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        if(!isBarking)
            return false;
        if(hourOfDay < 0 || hourOfDay > 23)
            return false;
        return hourOfDay < 8 || hourOfDay > 22;
    }
}
