/*
    Badon Delmotte
    10/9/20
 */
package com.mthree.summative.dogGenetics;
import java.util.Scanner;
import java.util.Random; 

public class DogGenetics {
    public static void main (String[] args){
        Scanner usrDog = new Scanner(System.in);
        Random dogBreed = new Random();
        String dName1 = "St. Bernard";
        String dName2 = "Siberian Husky";
        String dName3 = "Australian Cattle Dog";
        String dName4 = "Sheep Dog";
        String dName5 = "Papillon";
        double breedPercent1 = 0;
        double breedPercent2 = 0;
        double breedPercent3 = 0;
        double breedPercent4 = 0;
        double breedPercent5 = 0;
        double breedSum;
        
        System.out.println("Enter name of your dog: ");
            String dogName = usrDog.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + 
                dogName + "'s prestigious background right here: ");
        
        
        

        //for (int i = 0; i < 1; i++) {}
            
        do
        {
            breedPercent1 = dogBreed.nextDouble() * 100;
            breedPercent2 = dogBreed.nextDouble() * 100;
            breedPercent3 = dogBreed.nextDouble() * 100;
            breedPercent4 = dogBreed.nextDouble() * 100;
            breedPercent5 = dogBreed.nextDouble() * 100;
            breedSum = (breedPercent1 + breedPercent2 + breedPercent3 + breedPercent4 + breedPercent5);
            break;
        } while (breedSum != 100);
           
            
           
        
        System.out.println(dogName + " is: \n");
        System.out.println(Math.round(breedPercent1) + "% " + dName1);
        System.out.println(Math.round(breedPercent2) + "% " + dName2);
        System.out.println(Math.round(breedPercent3) + "% " + dName3);
        System.out.println(Math.round(breedPercent4) + "% " + dName4);
        System.out.println(Math.round(breedPercent5) + "% " + dName5);
        
        System.out.println("Wow! That's quite the dog you have there!");
    }
}
