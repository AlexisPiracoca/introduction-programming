package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Jhon Alexis Piracoca Arcos
	  DATE: 29/03/2020
	  DESCRIPTION: This software calculates the time it takes one person to get from one city to another by bicycle, considering that it has a constant speed
	 */
        System.out.println("----------------------------------------");
        System.out.println("              TIMEDIST                  ");
        System.out.println("----------------------------------------");
        double speed, distance, time;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("This software calculates the time it takes one person to get from one city to another by bicycle, considering that it has a constant speed. Input the distance in km");
        distance = keyboard.nextDouble();
        System.out.println("Enter the speed at which it will constantly go in km/h");
        speed = keyboard.nextDouble();
        time = distance/speed;
        System.out.println("The time you gonna spent is: "+time+" hours");
    }
}
