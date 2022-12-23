/**
 * 
 */
package ca.bcit.comp1510.lab08;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Mai Vu
 *
 */
public class Games {
    private int userScore;
    private Scanner scan;
    private Random generator;
    boolean flag = true;
    public Games() {
        userScore = 0;
        scan = new Scanner(System.in);
        generator = new Random();
    }
    
    
    /** Play game. */
    public void play() {      
        while (flag) {
            System.out.print("Welcome to the Games program! \n" 
                    + "Make your choice(enter a number): \n"
                    + "1. See your score \n2. Guess a number \n" 
                    + "3. Play Rock, Paper, Scissors \n4. Quit \n>");
            int opt = scan.nextInt();
            switch (opt) {
                case 1:
                    System.out.println(userScore);                 
                    break;
                case 2:
                    guessANumber();
                    break;
                case 3:
                    rockPaperScissors();
                    break;             
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("That's not a valid choice!");
            }
        }
    }
    
    /** Guess a number game. */
    public void guessANumber() {
        int randNum = generator.nextInt(101);
        int tryNum = 1;
        System.out.println("I've picked a random number between 0 and 100\n" 
                + "Can you guess it?\nGuess the number!");
        while (flag) {       
            int yourGuess = scan.nextInt();
            if (yourGuess > randNum) {
                System.out.println("Too high, guess again!\nGuess the number!");
                tryNum++;
            } else if (yourGuess < randNum) {
                System.out.println("Too low, guess again!\nGuess the number!");
                tryNum++;
            } else if (yourGuess == randNum) {
                System.out.println("RIGHT!");
                if (tryNum <= 5) {
                    System.out.println("Five points!");
                    userScore = userScore + 5;
                }
                flag = false;
            }
        }
        flag = true;      
    }
    
    /** Rock, Paper, Scissors game. */
    public void rockPaperScissors() {
        int rand = generator.nextInt(3);
        int numGuess = 0;
        System.out.println("I've picked 1 of rock, paper, scissors\n" 
                + "Which one do you choose?"); 
        String yourGuess = scan.nextLine().toLowerCase().trim();
        while (flag) {
            yourGuess = scan.nextLine().toLowerCase().trim();
            if (yourGuess.equals("rock")) {
                numGuess = 0;
                flag = false;           
            } else if (yourGuess.equals("paper")) {
                numGuess = 1;
                flag = false;
            } else if (yourGuess.equals("scissors")) {
                numGuess = 2;
                flag = false;
            } else {
                System.out.println("Invalid! Try again!");
            }
        }
        if (numGuess == rand) {
            System.out.println("Tie");
        }
        if (numGuess - rand == 1) {
            System.out.print("You Win! ");
            if (rand == 0) {
                System.out.println("Paper wraps rock");
            } else {
                System.out.println("Scissors cut paper");
            }
            userScore = userScore +5;
        }
        
        if (numGuess == 0 && rand == 2) {
            System.out.println("You Win! Rock Smashes Scissors");
            userScore = userScore + 5;
        }
        if (numGuess == 2 && rand == 0) {
            System.out.println("You Lose! I picked Scissor");
            userScore = userScore - 3;
        }
        if (numGuess - rand == -1) {
            System.out.print("You Lose! I picked ");
            if (rand == 1) {
                System.out.println("Paper");
            } else {
                System.out.println("Scissors");
            }
            userScore = userScore - 3;
        }
        flag = true;
    }

}
