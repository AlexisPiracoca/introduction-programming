package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Jhon Alexis Piracoca Arcos
	   DATE: 31/03/2020
	   DESCRIPTION: This software determine the time it take a person to get from one city to another or bicycle
	 */
        Scanner keyboard = new Scanner(System.in);
        System.out.println("----------soft velocity----------");
        System.out.println("|         version: 1.0          |");
        System.out.println("|         Maker if: Jhon Alexis |");
        System.out.println("---------------------------------");
        double velocity;
        System.out.println("Input the constant velocity (Km):");
        velocity = keyboard.nextDouble();
        f_time(velocity);

    }

    public static void f_time(double velocity) {
        /* Description: This function calculate the time t: d*v */
        Scanner keyboard = new Scanner(System.in);
        double time, distance;
        System.out.println("Input the distance between into two cities (Km):");
        distance = keyboard.nextDouble();
        time = distance / velocity;
        System.out.println("This time is:" + time + " hours");

    }
}
