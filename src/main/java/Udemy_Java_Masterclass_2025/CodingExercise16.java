package main.java.Udemy_Java_Masterclass_2025;

public class CodingExercise16 {

    public static boolean isPalindrome(int n){
        String s = Integer.toString(Math.abs(n));
        int len = s.length();
        for(int i = 0; i < len / 2; i++){
            if(s.charAt(i) != s.charAt(len - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
    }
}
