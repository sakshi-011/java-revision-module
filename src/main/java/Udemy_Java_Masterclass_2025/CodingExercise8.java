package main.java.Udemy_Java_Masterclass_2025;

public class CodingExercise8 {

    public static boolean hasTeen(int num1, int num2, int num3){
        if(num1 >= 13 && num1 <= 19)
            return true;
        if(num2 >= 13 && num2 <= 19)
            return true;
        if(num3 >= 13 && num3 <= 19)
            return true;
        return false;
    }

    public static boolean isTeen(int num){
        if(num >= 13 && num <= 19)
            return true;
        return false;
    }
}
