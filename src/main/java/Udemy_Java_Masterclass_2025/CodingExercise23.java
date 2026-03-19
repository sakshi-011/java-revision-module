package main.java.Udemy_Java_Masterclass_2025;

public class CodingExercise23 {

    public static boolean isPerfectNumber(int n){
        if( n < 1)
            return false;
        int sum = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0)
                sum += i + n/i;
        }
        sum -= n;
        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-19));
    }
}
