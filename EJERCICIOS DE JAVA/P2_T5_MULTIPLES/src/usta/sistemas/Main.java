package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Jhon Alexis Piracoca Arcos
	DATE: 14/04/2020
	DESCRIPTION: This software created a program that ask for two numbers and says if one is a multiple of the other
	 */
	f_menu();
	f_input_numbers();
    }
    public static void f_menu() {
        //Description: this method show the menu of this software
        System.out.println("  ==============================  ");
        System.out.println("||---------SoftMultiplos------||");
        System.out.println("||----Version 1.0 2020-04-14----||");
        System.out.println("||---Created by: Jhon Alexis----||");
        System.out.println("  ==============================  ");
    }
    public static boolean f_multiple(int n1, int n2){
        //DESCRIPTION: This method determinate if its multiple
        boolean multiple = false;
        if (n1%n2==0){
            multiple=true;
        }
        return multiple;
    }
    public static void f_input_numbers(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the first integer number");
        int n1=keyboard.nextInt();
        System.out.println("Input the second integer number");
        int n2=keyboard.nextInt();
        boolean rpta=f_multiple(n1,n2);
        if (rpta==true){
            System.out.println(n1+" its multiple of "+n2);
        }else{
            System.out.println(n1+ " is not multiple of "+n2);
        }
    }
}
