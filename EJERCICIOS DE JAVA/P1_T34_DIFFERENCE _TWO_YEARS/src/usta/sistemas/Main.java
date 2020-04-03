package usta.sistemas;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Author: Jhon Alexis Piracoca
	 *Date: 2020/03/12
	 *Description: This software prints two birth years and their difference
	 */
	Scanner keyboard = new Scanner(System.in);
	int y1, y2, difference;
        System.out.println("This software prints two birth years and their difference, input the first year: ");
	    y1= keyboard.nextInt();
        System.out.println("Input the second year: ");
        y2= keyboard.nextInt();
        difference = y1-y2;
        System.out.println("This difference between the two years is: "+difference+" years");
    }
}

