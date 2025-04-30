package main.java.Udemy_Java_Masterclass_2025;

public class CodingExercise12 {

    public static boolean isCatPlaying(boolean summer, int temperature){
        if(temperature >= 25 && temperature <= 35)
            return true;
        if(summer && temperature >= 25 && temperature <= 45)
            return true;
        return false;
    }
}
