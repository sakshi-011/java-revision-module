package main.java.Udemy_Java_Masterclass_2025;

public class CodingExercise17 {

    public static int sumFirstAndLastDigit(int n){
        if(n < 0)
            return -1;
        int last = n % 10;
        String s = Integer.toString(n);
        int first = s.charAt(0) - '0';
        return first + last;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
        System.out.println(sumFirstAndLastDigit(10002));
    }
}
