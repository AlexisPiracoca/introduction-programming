package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    /*AUTHOR: Jhon Alexis Piracoca Arcos
        DATE: 27/04/2020
        DESCRIPTION: This software using repetitive cycles build a program that prints the multiplication tables from
                     number 1 to number 10 in the range from 1 to 10.
	    */
    f_menu();
    int number_user = f_number_user();
    while(number_user != 0) {
        f_generate_multiplication_table(number_user);
        number_user = f_number_user();
    }
        System.out.println("Thanks you user is software");
    }
    public static void f_menu(){
        //DESCRIPTION: this method show the menu of this software
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║          SoftMultiplication        ║");
        System.out.println("║        Version 1.0 2020-04-27      ║");
        System.out.println("║       Created by: Jhon Alexis      ║");
        System.out.println("╚════════════════════════════════════╝");
    }
    public static int f_number_user(){
        //DESCRIPTION: this method ask for the user what multiply table want and return this number
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the multiply table that you want (0 to exit): ");
        int user_numb = keyboard.nextInt();
        while(user_numb < 0 || user_numb > 99){
            System.err.println("ERROR: YOU ONLY HAVE THE MULTIPLY TABLES BETWEEN THE 0 AND 99");
            System.out.println("Input again the multiply table that you want (0 to exit): ");
            user_numb = keyboard.nextInt();
        }
        return user_numb;
    }
    public static void f_generate_multiplication_table(int number_user){
     //DESCRIPTION: this method with a "FOR" show the multiplication tables
        System.out.println("The multiplication table is: ");
        for (int i=1; i<=10; i++){
            System.out.println(number_user+ " X "+i+" = "+number_user*i);
        }
    }
}
