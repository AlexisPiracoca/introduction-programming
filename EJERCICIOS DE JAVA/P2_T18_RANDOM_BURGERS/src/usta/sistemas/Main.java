package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /*AUTHOR: Jhon Alexis Piracoca Arcos
        DATE: 27/04/2020
        DESCRIPTION: This software that generates a random number from 1 to 100 is required.
	    */
        f_menu();
        int random_number = f_random_number();
        int number_user = f_user_number();
        int attemps = 5;
        while (number_user != random_number & attemps > 1){
            attemps--;
            System.err.println("The number is different than the generated number (Attemps = "+attemps+ ")");
            number_user = f_user_number();
        }
        if(attemps > 1){
            System.out.println("Congratulations, you win a hamburger with the number "+random_number);
        }else{
            System.out.println("Sorry you lost, the random number was "+random_number);
        }
    }
    public static void f_menu(){
        //DESCRIPTION: this method show the menu of this software
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║          SoftRandomBurgers         ║");
        System.out.println("║        Version 1.0 2020-04-27      ║");
        System.out.println("║       Created by: Jhon Alexis      ║");
        System.out.println("╚════════════════════════════════════╝");
    }
     public static int f_random_number(){
        //DESCRIPTION: this method created the random number
        int number = (int)Math.floor(Math.random() * 100 + 1);
        if(number < 50) {
            System.out.println("Hint 1: The number is minor than 50 ");
        }else{
            System.out.println("Hint 1: The number is greater than 50 ");
        }
        if(number % 2 == 0){
            System.out.println("Hint 2: The number i pair ");
        }else{
            System.out.println("Hint 2: The number is odd ");
        }
        return number;
     }
     public static int f_user_number(){
        //DESCRIPTION: this method ask the number
         Scanner keyboard = new Scanner(System.in);
         int input = keyboard.nextInt();
         System.out.println("Type the number to compare (0 - 100): ");
         input = keyboard.nextInt();
         while (input < 0 || input > 100 ){
             System.err.println("ERROR: THE INPUT MUST BE BETWEEN 0 AND 100 \n retry");
         }
         return input;
     }

        }
