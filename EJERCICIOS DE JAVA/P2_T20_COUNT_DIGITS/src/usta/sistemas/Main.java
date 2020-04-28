package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
     /*AUTHOR: Jhon Alexis Piracoca Arcos
        DATE: 28/04/2020
        DESCRIPTION: this software that counts the number of digits of a number entered by keyboard.
	    */
        f_menu();
        int total_digits = 0;
        int number = f_number_user();
        if (number != 0){
            while (number != 0){
                number = number/10;
                total_digits++;
            }
        }else {total_digits = 1;}
        System.out.println("The total digits of the number is: "+total_digits);
    }
    public static void f_menu(){
        //DESCRIPTION: this method show the menu of this software
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║              SoftDigits            ║");
        System.out.println("║        Version 1.0 2020-04-28      ║");
        System.out.println("║       Created by: Jhon Alexis      ║");
        System.out.println("╚════════════════════════════════════╝");
    }
    public static int f_number_user(){
    //DESCRIPTION: this method return the number input by the user
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the any number");
        int num = keyboard.nextInt();
        return num;
    }
}
