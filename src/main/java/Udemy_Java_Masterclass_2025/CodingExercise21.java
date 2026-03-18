package main.java.Udemy_Java_Masterclass_2025;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CodingExercise21 {

    public static void printFactors(int n){
        if(n < 1)
            System.out.println("Invalid Value");
        List<Integer> res = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                res.add(i);
                if(i != n/i)
                    res.add(n/i);
            }
        }
        Collections.sort(res);
        for(Integer j : res)
            System.out.println(j);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printFactors(n);
    }

}
