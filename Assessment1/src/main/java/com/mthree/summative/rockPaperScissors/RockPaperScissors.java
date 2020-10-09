/*
    Badon Delmotte
    10/8/20
    Summative Assessment 1 
    Exercise 1
 */
package com.mthree.summative.rockPaperScissors;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main (String[] args){
        Scanner usrChoice = new Scanner(System.in);
        Random compChoice = new Random();
        int winsUser = 0;
        int winsComp = 0;
        int winsTies = 0;

        // intro and user inputs number of rounds they wish to play        
        while (true){
        System.out.println("\nRock, Paper, Scissors");
        System.out.println("How many rounds would you like to play? (Between 1 and 10 rounds inclusive) ");
            int roundsCount = usrChoice.nextInt();
            
        // if user enters an integer outside of (1 --> 10), then the program ends
        if (roundsCount < 1 || roundsCount > 10) 
            break;
            //System.exit(0); could use this as well, but "break" is better whilst in while(true) loop
        
        // the game itself       
        for (int i = 1; i <= roundsCount; i++)
        {    
            System.out.println("\nGame " + i + ": " + " Type 1 for Rock, 2 for Paper, 3 for Scissors");            
            // user choices
            int numChoice = usrChoice.nextInt();                  
            switch (numChoice)
            {
                case 1:
                    numChoice = 1;
                    System.out.println("\nYou Chose: Rock");
                    break;
                case 2:
                    numChoice = 2;
                    System.out.println("\nYou Chose: Paper");
                    break;
                case 3:
                    numChoice = 3;
                    System.out.println("\nYou Chose: Scissors");
                    break; 
                   
            }    
            if (numChoice != 1 || numChoice != 2 || numChoice != 3)
                System.out.println("YOU ENTERED INCORRECT VALUE");
            
            // computer choices
            int numChoice2 = compChoice.nextInt(3) + 1;
            switch (numChoice2)
            {
                case 1:
                    numChoice2 = 1;
                    System.out.println("Your Opponent Chose: Rock");
                    break;
                case 2:
                    numChoice2 = 2;
                    System.out.println("Your Opponent Chose: Paper");
                    break;
                case 3:
                    numChoice2 = 3;
                    System.out.println("Your Opponent Chose: Scissors");
                    break;        
            }           
            // the rules of the game
            if (numChoice == 1 && numChoice2 == 1)
            {    
                System.out.println("Winner: TIE");
                winsTies++;
            }    
            if (numChoice == 2 && numChoice2 == 1)
            {    
                System.out.println("Winner: USER");
                winsUser++;
            }    
            if (numChoice == 3 && numChoice2 == 1)
            {    
                System.out.println("Winner: COMPUTER");
                winsComp++;
            }    
            if (numChoice == 1 && numChoice2 == 2)
            {    
                System.out.println("Winner: COMPUTER");
                winsComp++;
            }    
            if (numChoice == 2 && numChoice2 == 2)
            {    
                System.out.println("Winner: TIE");
                winsTies++;
            }    
            if (numChoice == 3 && numChoice2 == 2)
            {    
                System.out.println("Winner: USER");
                winsUser++;
            }        
            if (numChoice == 1 && numChoice2 == 3)
            {    
                System.out.println("Winner: USER");
                winsUser++;
            }
            if (numChoice == 2 && numChoice2 == 3)
            {
                System.out.println("Winner: COMPUTER");
                winsComp++;
            }
            if (numChoice == 3 && numChoice2 == 3)
            {
                System.out.println("Winner: TIE");
                winsTies++;
            }               
        }        
        // final print statements; the stats 
        System.out.println("\nUser Wins: " + winsUser);
        System.out.println("Computer Wins: " + winsComp);
        System.out.println("Ties: " + winsTies);    
        
        if (winsUser > winsComp)
            System.out.println("Overall Winner: USER");
        if (winsUser < winsComp)
            System.out.println("Overall Winner: COMPUTER");
        if (winsUser == winsComp)
            System.out.println("NO OVERALL WINNER");
        
        System.out.println("\nWould you like to play again? 'Y' or 'N'? ");
            String usrQuestion = usrChoice.nextLine();
        
        if (usrChoice.nextLine().equals("Y"))
            continue;
        else
        {   
            System.out.println("Thanks For Playing!");
            break;
        }
        
        } // end of while(true) loop
        
        
        
    }
}
