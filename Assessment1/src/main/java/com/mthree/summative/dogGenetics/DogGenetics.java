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
        int breedPercent1 = 0;
        int breedPercent2 = 0;
        int breedPercent3 = 0;
        int breedPercent4 = 0;
        int breedPercent5 = 0;
        int breedSum;
        
        System.out.println("Enter name of your dog: ");
            String dogName = usrDog.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + 
                dogName + "'s prestigious background right here: ");

        //for (int i = 0; i < 1; i++) {}          
        do
        {
            breedPercent1 = dogBreed.nextInt(100);
            breedPercent2 = dogBreed.nextInt(100);
            breedPercent3 = dogBreed.nextInt(100);
            breedPercent4 = dogBreed.nextInt(100);
            breedPercent5 = dogBreed.nextInt(100);
            breedSum = (breedPercent1 + breedPercent2 + breedPercent3 + breedPercent4 + breedPercent5);
           
        } while (breedSum != 100);    
        
        System.out.println(dogName + " is: \n");
        System.out.println((breedPercent1) + "% " + dName1);
        System.out.println((breedPercent2) + "% " + dName2);
        System.out.println((breedPercent3) + "% " + dName3);
        System.out.println((breedPercent4) + "% " + dName4);
        System.out.println((breedPercent5) + "% " + dName5);
        System.out.println("Total: " + breedSum);
        System.out.println("Wow! That's quite the dog you have there!");
    }
}
