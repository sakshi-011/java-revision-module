package main.java.Udemy_Java_Masterclass_2025;

public class CodingExercise26 {

    public static int getLargestPrime(int n){
        if(n < 2)
            return -1;
        for(int i = 2; i <= n; i++){
            while(n % i == 0)
                n /= i;
            if(n == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(-99));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(45));
    }
}
