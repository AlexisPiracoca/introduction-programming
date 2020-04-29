package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
      /*AUTHOR: Jhon Alexis Piracoca Arcos
        DATE: 29/04/2020
        DESCRIPTION: this software tells is now many number there are between 1 and that are prime
	    */
        f_menu();
        int number = f_user_number();
        int total_primes = 0;
        for (int i=1; i<=number; i++){
            if(f_prime_number(i)==true){
                total_primes++;
                System.out.println("Number "+i+" is prime");
            }
        }
        System.out.println("The total prime is "+total_primes);
    }
    public static void f_menu(){
        //DESCRIPTION: this method show the menu of this software
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║              SoftPrime             ║");
        System.out.println("║        Version 1.0 2020-04-28      ║");
        System.out.println("║       Created by: Jhon Alexis      ║");
        System.out.println("╚════════════════════════════════════╝");
    }
    public static int f_user_number(){
        //DESCRIPTION: this method return a number input by the user
        Scanner keyboard = new Scanner(System.in);
        int number;
        System.out.println("Input a number grater than 1 ");
        number = keyboard.nextInt();
        while (number <= 1){
            System.err.println("ERROR: the number is not grater than 1, please rectify ");
            System.out.println("Input again a number grater than 1 ");
            number = keyboard.nextInt();
        }
        return number;
    }
    public static boolean f_prime_number(int number) {
        //DESCRIPTION: this method contain the function of prime number
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count = count + 1;
            }
        }
        if (count <= 2) {
            return true;
        } else {
            return false;
        }
    }
}
