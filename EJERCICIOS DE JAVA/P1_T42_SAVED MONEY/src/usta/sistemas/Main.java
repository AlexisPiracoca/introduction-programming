package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    /*AUTHOR: Jhon Alexis Piracoca Arcos
	DATE: 01/04/2020
	DESCRIPTION: This program determines how much money a person saves in a year if you consider that each week you save 15% of your salary
	 */
        Scanner keyboard = new Scanner(System.in);
        f_menu(); //llamo al metodo / funcion llamado f_menu():
        System.out.println("Input your salary");
        int salary = keyboard.nextInt();
        f_saved_money(salary);
    }

    public static void f_menu() {
        /*DESCRIPTION: Show the main*/
        System.out.println("..................................");
        System.out.println(".            Softmoney           .");
        System.out.println(".   Version: 1.0 -- 2020-ap-1    .");
        System.out.println(".   Maker: Jhon Alexis Piracoca  .");
        System.out.println("..................................");

    }

    public static void f_saved_money(int p_salary) {
        //This method / function calculates the total save money in a year.
        double saved_moneey = (((p_salary * 0.15) * 4) * 12);
        System.out.println("The total saved money ina year is: " + saved_moneey);
    }
}
