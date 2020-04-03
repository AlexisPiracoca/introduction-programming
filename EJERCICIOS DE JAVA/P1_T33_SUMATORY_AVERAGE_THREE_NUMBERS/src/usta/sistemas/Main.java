package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* Author: Jhon Alexis Piracoca
	*Date: 2020/03/12
	* Description: This software realice the sumatory by three numbers and average thems
	 */
	Scanner keyboard = new Scanner(System.in);
	int v1, v2, v3, sumatory;
	double average;
        System.out.println("This software realice the sumatory by three numbers and average thems, input the first number: ");
        v1 = keyboard.nextInt();
        System.out.println("Input the second number");
        v2 = keyboard.nextInt();
        System.out.println("Input the third number");
        v3 = keyboard.nextInt();
        sumatory = v1+v2+v3;
        average = sumatory/3;
        System.out.println("The sumatory is: " +sumatory+ " and the average is: "+average);

    }
}
10
