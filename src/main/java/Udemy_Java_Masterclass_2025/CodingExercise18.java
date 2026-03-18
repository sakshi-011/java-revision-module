package main.java.Udemy_Java_Masterclass_2025;

public class CodingExercise18 {

    public static int getEvenDigitSum(int n){
        if(n < 0)
            return -1;
        int sum = 0, digit;
        while(n > 0){
            digit = n % 10;
            n /= 10;
            if(digit % 2 == 0)
                sum += digit;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(-44));
        System.out.println(getEvenDigitSum(252));
    }
}
