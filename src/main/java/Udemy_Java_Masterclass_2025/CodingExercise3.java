package main.java.Udemy_Java_Masterclass_2025;

public class CodingExercise3 {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int mb = kiloBytes / 1024, kb = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + mb + " MB and " + kb + " KB");
        }
    }
}
