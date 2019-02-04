package com.company;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        System.out.println("Welcome! Let's Play Roll Dice! ");
        int total_score = 0;
        do {
            Scanner keyboard = new Scanner(System.in);

            // Created an instance of the Random class
              Random rand = new Random();

              int num1 = 1 + rand.nextInt(6);
              int num2 = 1 + rand.nextInt(6);


//            for (int i = 0; i < 6; i++) {
//               int n = 1 + rand_1.nextInt(6);
//             //   int n = rand_1.nextInt(5) + 1;
//
//
//            }
//            // Roll dice 2
//            Random rand_2 = new Random();
//            for (int k = 0; k < 6; k++) {
//             //   int t = 1 + rand_2.nextInt(6);
//             int t = 1 + rand_2.nextInt(6) ;
//
//            }
//
//            int dice_1 = rand_1.nextInt(6);
//            int dice_2 = 1 + rand_2.nextInt(6);
            int score = 0;


//            System.out.print("Your rolls " + dice_1);
//            System.out.println(" " + dice_2);

            System.out.println("Your rolls "+ num1 + " " + num2);




//            score = (dice_1 + dice_2);
            score = (num1 + num2);

            if(num1 == 1 && num2 == 1 ){
                total_score += (total_score + 25);
            }
            else if (num1 == 1 || num2 == 1)
                {
                    total_score = (total_score);
                }
            else if (score > 2)
            {
                total_score = (total_score + score);
            }


           // else if (dice_1 == 1)
           //      {total_score = (total_score);}
           // else if (dice_2 == 1)
           //      {total_score = (total_score);}
            System.out.println("Score: " + score);
            System.out.println("total score: " + total_score);
            System.out.println("Roll again? y or n ");
            String answer = keyboard.nextLine();

            if (answer.equalsIgnoreCase( "n")){
                System.out.println("Thank you for playing!");
                System.exit(0);
            }
            if (total_score > 99) {
                System.out.println("You have scored over 100");
                System.out.println("Thank you for playing!");
            }

        }
        while (total_score < 99);

    }
}
