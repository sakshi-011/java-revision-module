package main.java.Udemy_Java_Masterclass_2025;

public class CodingExercise20 {

    public static boolean isValid(int n){
        if(n < 10 || n > 1000)
            return false;
        return true;
    }

    public static boolean hasSameLastDigit(int a, int b, int c){
        if(!isValid(a) || !isValid(b) || !isValid(c))
            return false;
        int l1 = a % 10, l2 = b % 10, l3 = c % 10;
        if(l1 == l2 || l2 == l3 || l1 == l3)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit (9, 2200, 71));
    }
}
