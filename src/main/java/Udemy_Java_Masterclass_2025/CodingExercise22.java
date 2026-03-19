package main.java.Udemy_Java_Masterclass_2025;

public class CodingExercise22 {

    public static int getGreatestCommonDivisor(int a, int b){
        if(a < 10 || b < 10)
            return -1;
        int min = Math.min(a,b), max= Math.max(a,b), div;
        while(max % min != 0){
            div = max % min;
            max = Math.max(div,min);
            min = Math.min(div,min);
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(9,135));
        System.out.println(getGreatestCommonDivisor(109,109));
        System.out.println(getGreatestCommonDivisor(-1,422));
    }
}
