package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Jhon Alexis Piracoca Arcos
	DATE: 14/04/2020
	DESCRIPTION: This software ask for two numbers and says if they are the same or not
	 */
        f_menu();
        boolean rpta = f_compare();
        if (rpta == true){
            System.out.println("|||||||||||||||||||||||||||||");
            System.out.println("|||The two numbers is same|||");
            System.out.println("|||||||||||||||||||||||||||||");
        }else{
            System.out.println("||||||||||||||||||||||||||||||||||||");
            System.out.println("|||The two numbers aren't is same|||");
            System.out.println("||||||||||||||||||||||||||||||||||||");
        }
    }

    public static void f_menu() {
        //Description: this method show the menu of this software
        System.out.println("  ==============================  ");
        System.out.println("||---------SoftAreaFigures------||");
        System.out.println("||----Version 1.0 2020-04-14----||");
        System.out.println("||---Created by: Jhon Alexis----||");
        System.out.println("  ==============================  ");
        System.out.println("Input the option of the figure: \n1-circle\n2-square\n3-triangle");
    }

    public static boolean f_compare() {
        Scanner keyoard = new Scanner(System.in);
        int n1, n2;
        boolean rpta;
        System.out.println("This software ask for two integer numbers and says if they are the same or not");
        System.out.println("Input the first number");
        n1 = keyoard.nextInt();
        System.out.println("Input the second number");
        n2 = keyoard.nextInt();
        if (n1 == n2){
            rpta=true;
        }else{
            rpta=false;
        }
        return rpta;
    }
}
