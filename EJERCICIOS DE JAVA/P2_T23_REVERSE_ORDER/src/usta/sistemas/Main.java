package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
     /*AUTHOR: Jhon Alexis Piracoca Arcos
        DATE: 29/04/2020
        DESCRIPTION: this software Read 5 numbers and show them in reverse order to the one entered
	    */
        f_menu();
        f_number_user();
    }
    public static void f_menu(){
        //DESCRIPTION: this method show the menu of this software
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║             SoftRevers             ║");
        System.out.println("║        Version 1.0 2020-04-29      ║");
        System.out.println("║       Created by: Jhon Alexis      ║");
        System.out.println("╚════════════════════════════════════╝");
    }
    public static void f_number_user(){
        //DESCRIPTION: this method return the number by the user
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        double prom;
        System.out.println("Input the number 1: ");
        num1=keyboard.nextInt();
        System.out.println("Input the number 2: ");
        num2=keyboard.nextInt();
        System.out.println("Input the number 3: ");
        num3=keyboard.nextInt();
        System.out.println("Input the number 4: ");
        num4=keyboard.nextInt();
        System.out.println("Input the number 5: ");
        num5=keyboard.nextInt();
        System.out.println("The inverted numbers are: "+num5+" ,"+num4+" ,"+num3+" ,"+num2+" ,"+num1);
        prom = (num1+num2+num3+num4+num5)/5;
        System.out.println("The average of the numbers is: "+prom);
    }
}
