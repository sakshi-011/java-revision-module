package main.java.Udemy_Java_Masterclass_2025;

public class CodingExercise14 {

    public static boolean isLeapYear (int year){
        if(year <= 1 || year >= 9999)
            return false;
        if(year % 400 == 0)
            return true;
        if(year % 4 == 0 && year % 100 != 0)
            return true;
        else
            return false;
    }

    public static int getDaysInMonth(int month, int year){
        if(year < 1 || year > 9999)
            return -1;
        boolean isLeap = isLeapYear(year);
        return switch(month) {
            case 1 , 3 , 5 , 7 , 8 , 10 , 12 -> 31;
            case 4 , 6 , 9 , 11 -> 30;
            case 2 -> {
                if(isLeap)
                    yield 29;
                else
                    yield 28;
            }
            default -> -1;
        };
    }

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2,1994));
        System.out.println(getDaysInMonth(34,2023));
        System.out.println(getDaysInMonth(2,2000));
        System.out.println(getDaysInMonth(12,1994));
        System.out.println(getDaysInMonth(9,1994));
        System.out.println(getDaysInMonth(7,-1122));
        System.out.println(getDaysInMonth(2,2020));
    }
}
