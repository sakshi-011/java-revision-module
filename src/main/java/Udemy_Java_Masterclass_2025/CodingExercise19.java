package main.java.Udemy_Java_Masterclass_2025;

public class CodingExercise19 {

    /*  FOR VARIABLE NUMBER OF DIGITS
    public static int[] digitCount(int n){
        int d = 0;
        int[] count = new int[10];
        while(n > 0){
            d = n % 10;
            n /= 10;
            count[d]++;
        }
        return count;
    }

    public static boolean hasSharedDigit(int start, int end){
        int[] digitCountStart = digitCount(start);
        int[] digitCountEnd = digitCount(end);
        for(int i = 0; i < 10; i++){
            if(digitCountStart[i] > 0 && digitCountEnd[i] > 0)
                return true;
        }
        return false;
    }
    */

    public static boolean hasSharedDigit(int start, int end){
        if(start < 10 || start > 99 || end < 10 || end > 99)
            return false;

        int start1 = start % 10, start2 = (start / 10) % 10;
        int end1 = end % 10, end2 = (end / 10) % 10;
        if(start1 == end1 || start1 == end2 || start2 == end1 || start2 == end2)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(21,41));
        System.out.println(hasSharedDigit(23444444,111111145));
        System.out.println(hasSharedDigit(99,19));
        System.out.println(hasSharedDigit(-1,10));
        System.out.println(hasSharedDigit(56,10));
    }
}
