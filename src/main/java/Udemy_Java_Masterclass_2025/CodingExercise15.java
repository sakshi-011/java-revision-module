package main.java.Udemy_Java_Masterclass_2025;

public class CodingExercise15 {

    public static boolean isOdd(int n){
        if(n > 0 && n % 2 == 1)
            return true;
        else return false;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if(start > end || start < 0 || end < 0)
            return -1;
        for(int i = start; i <= end; i++){
            if(isOdd(i))
                sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
    }
}
