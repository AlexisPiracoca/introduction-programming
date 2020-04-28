package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Jhon Alexis Piracoca Arcos
      DATE: 23/04/2020
	  DESCRIPTION: this software ask for a password (3 attempts maximum) or until the password is 352, 259 or 569.
	 */
        f_menu();
        int n_intentos = 1;
        boolean option=f_input_password();
        while (n_intentos<=3 && option==false){
            System.err.println("The password is wrong, try again: ");
            n_intentos+=1;
            option = f_input_password();

        }
        if (n_intentos == 4) {
            System.out.println("You cannot het into the platform");
        }else{
            System.out.println("Welcome to the platform");
        }
    }
    public static void f_menu() {
        //Description: This method shows the menu of this software
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║          SoftPassword USTA 2020         ║");
        System.out.println("║          Version 1.0 2020-04-23         ║");
        System.out.println("║         Created by: Jhon Alexis         ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }
    public static boolean f_input_password() {
        //DESCRIPTION: this method return the value of the password
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the password");
        boolean pass = false;
        int password = keyboard.nextInt();
        if (password == 352 || password == 259 || password == 569) {
            pass = true;
        }
        return pass;
    }
}
