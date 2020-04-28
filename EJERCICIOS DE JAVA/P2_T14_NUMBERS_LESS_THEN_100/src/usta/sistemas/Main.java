package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
      /*AUTHOR; Jhon Alexis Piracoca Arcos
	  DATE: 22/04/2020
	  DESCRIPTION: Ths software read from the keyboard series of numbers until you get one
	               lower than 100, in the end determine the sum and average of the numbers entered
	 */
      f_menu();
      Scanner keyboard = new Scanner(System.in);
      int total_number = 0;
      double sumatory = 0, average = 0, number;
        System.out.println("Input a number: ");
        number = keyboard.nextDouble();
        while (number > 100) {
            sumatory = sumatory + number;
            total_number = total_number + 1;
            System.out.println("Input other number: ");
            number = keyboard.nextDouble();
        }
        if (total_number!=0){
            average = sumatory/total_number;
        }
        System.out.println("The sumatory of "+total_number+" is = "+sumatory+" and average = "+average);
    }
    public static void f_menu() {
        //Description: This method shows the menu of this software
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║          SoftNumbers USTA 2020          ║");
        System.out.println("║          Version 1.0 2020-04-22         ║");
        System.out.println("║         Created by: Jhon Alexis         ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

}
