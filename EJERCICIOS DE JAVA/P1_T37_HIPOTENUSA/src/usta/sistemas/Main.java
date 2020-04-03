package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Jhon Alexis Piracoca
	DATE:19/03/2029
	DESCRIPTION: This program calculate the hipotenusa the triangle
	 */
     Scanner keyboard= new Scanner(System.in);
     System.out.println("This program calculate the hipotenuse the triangle input the first leg (mts):");
     double c1, c2, hipotenuse;
     c1=keyboard.nextDouble();
     System.out.println("Input the second leg(mts): ");
     c2=keyboard.nextDouble();
     hipotenuse= Math.sqrt(Math.pow(c1,2)+Math.pow(c2,2));
     System.out.println("This hipotenuse is(mts):"+hipotenuse);

    }
}
