package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*  AUTHOR: Jhon Alexis Piracoca Arcos
	DATE: 26/03/2020
	DESCRIPTION: This software realizes many operations with strings
	 */
	  Scanner keyboard = new Scanner(System.in);
	    String name;
          System.out.println("╔============================================╗");
          System.out.println("║   StringSoft USTA 2020                     ║");
          System.out.println("║   Version 1.0                              ║");
          System.out.println("║   Creado por: Jhon Alexis Piracoca Arcos   ║");
          System.out.println("╚============================================╝");
          System.out.println("Input your completed name please (names and surnames):");
          name = keyboard.nextLine();
            if(name.length()<6 ) {
                System.out.println("ERROR: the name is very short, you must enter the full name (name and surname)");
            }else {
                    if (name.length()>20) {
                        System.out.println("ERROR: the name is too long, you only have to enter your full name (name and surname)");
                    }else {
                        System.out.println("His name is: ");
                        System.out.println(name.replace("a", "@").replace("e","3").replace("i","1").replace("o","0").replace("A","@").replace("E","3").replace("I","1").replace("O","0"));
                    }
            }

    }
}
