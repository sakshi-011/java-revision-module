package main.java.Udemy_Java_Masterclass_2025;

public class CodingExercise24 {

    public static int getDigitCount(int n){
        if(n < 0)
            return -1;
        return Integer.toString(n).length();
    }

    public static int reverse(int n){
        int sign = 1, rev = 0;
        if(n < 0) {
            sign = -1;
            n *= sign;
        }
        while(n > 0){
            rev = (rev * 10) + (n % 10);
            n = n / 10;
        }
        return sign * rev;
    }

    public static void numberToWords(int n){
        if(n < 0)
            System.out.print("Invalid Value");
        int len = getDigitCount(n), count = 0;
        n = reverse(n);
        while(n > 0){
            int d = n % 10;
            n = n / 10;
            switch(d){
                case 0 :
                    System.out.print("Zero ");
                    break;
                case 1 :
                    System.out.print("One ");
                    break;
                case 2 :
                    System.out.print("Two ");
                    break;
                case 3 :
                    System.out.print("Three ");
                    break;
                case 4 :
                    System.out.print("Four ");
                    break;
                case 5 :
                    System.out.print("Five ");
                    break;
                case 6 :
                    System.out.print("Six ");
                    break;
                case 7 :
                    System.out.print("Seven ");
                    break;
                case 8 :
                    System.out.print("Eight ");
                    break;
                case 9 :
                    System.out.print("Nine ");
                    break;
            }
            count++;
        }
        for(int i = 0; i < len-count; i++){
            System.out.print("Zero ");
        }
    }

    public static void main(String[] args) {
        numberToWords(0);
        System.out.println();
        numberToWords(234);
        System.out.println();
        numberToWords(-112);
        System.out.println();
        numberToWords(5050);
        System.out.println();
        numberToWords(4200);
    }
}
