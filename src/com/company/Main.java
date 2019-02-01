package com.company;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome! Let's Play Roll Dice! ");
        int total_score = 0;
        do {
            Scanner keyboard = new Scanner(System.in);

            // Roll dice 1
            Random rand_1 = new Random();
            for (int i = 0; i < 6; i++) {
                int n = 1 + rand_1.nextInt(6);
            }
            // Roll dice 2
            Random rand_2 = new Random();
            for (int k = 0; k < 6; k++) {
                int t = 1 + rand_2.nextInt(6);
            }

            int dice_1 = rand_1.nextInt(6);
            int dice_2 = 1 + rand_2.nextInt(6);
            int score = 0;


            System.out.print("Your rolls " + dice_1);
            System.out.println(" " + dice_2);

            score = (dice_1 + dice_2);
            if (score > 2)
            { total_score = (total_score + score);}
            else if (score == 2)
                { total_score = (total_score + 25);}
            else if (dice_1 < 2)
            {total_score = (total_score + 0);}
            else if (dice_2 < 2)
            {total_score = (total_score + 0);}

           // else if (dice_1 == 1)
           //      {total_score = (total_score);}
           // else if (dice_2 == 1)
           //      {total_score = (total_score);}
            System.out.println("Score: " + score);
            System.out.println("total score: " + total_score);
            System.out.println("Roll again? yes or no ");
            String answer = keyboard.nextLine();

            if (answer == "no"){
                total_score = 100;
                System.out.println("Thank you for playing!");
            }
            if (total_score > 99) {
                System.out.println("You have scored over 100");
                System.out.println("Thank you for playing!");
            }

        }
        while (total_score < 99);

    }
}
