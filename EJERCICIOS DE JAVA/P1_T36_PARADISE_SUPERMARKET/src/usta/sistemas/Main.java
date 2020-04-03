package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR:Jhon Alexis Piracoca
	 * DATE: 19/03/2020
	 * DESCRIPTION:This software generated a bill of supermarket paradise
	 */
	    System.out.println("Bill software of supermarket paradise, input the first product: ");
	    Scanner keyboard= new Scanner(System.in);
	    int p1, p2, p3, p4, total_bruto;
	    double IVA,TOTAL;
	    p1= keyboard.nextInt();
        System.out.println("Input second product");
        p2= keyboard.nextInt();
        System.out.println("Input third product");
        p3= keyboard.nextInt();
        System.out.println("Input fourth product");
        p4= keyboard.nextInt();
        total_bruto= p1+p2+p3+p4;
        IVA=total_bruto*0.19;
        TOTAL= total_bruto+IVA;
        System.out.println("Your bill is: ");
        System.out.println("Total bruto:$" +total_bruto);
        System.out.println("IVA:$"+IVA);
        System.out.println("Total factura:$"+TOTAL);

    }
}
