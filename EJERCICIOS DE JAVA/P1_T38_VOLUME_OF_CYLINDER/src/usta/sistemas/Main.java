package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Jhon Alexis Piracoca
	Date: 19/03/2020
	DESCRIPTION: This program calculate the volume of a cylinder
	 */
	Scanner keyboard= new Scanner(System.in);
	System.out.println("This program calculate the volume of a cylinder input the height(cm):");
	double height, radius, volume;
	height=keyboard.nextDouble();
	System.out.println("Input the radius(cm):");
	radius=keyboard.nextDouble();
	volume=3.1415*Math.pow(radius,2)*height;
	System.out.println("This volume of the cylinder is(cm):"+volume);

    }
}
