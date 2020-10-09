/*
    Badon Delmotte
    10/9/20
 */
package com.mthree.summative.HealthyHearts;
import java.util.Scanner;

public class HealthyHearts {
    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        int age;
        double maxHR;
        double targetHRZ;
        double minHRZ;
        double maxHRZ;
        
        System.out.println("Please Enter Your Age");
            age = userInput.nextInt();
        maxHR = 220 - age;
        System.out.println("Your Max Heart Rate Should Be: " + maxHR + " bpm");
        minHRZ = maxHR * .5;
        maxHRZ = maxHR * .85;
        System.out.println("Your target HR Zone is " + minHRZ + " -- " + maxHRZ + " bpm");
        
        
        
    }
}
