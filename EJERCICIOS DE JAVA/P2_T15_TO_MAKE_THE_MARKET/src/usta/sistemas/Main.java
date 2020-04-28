package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /*AUTHOR; Jhon Alexis Piracoca Arcos
      DATE: 22/04/2020
	  DESCRIPTION: A housewife needs to make the market of the month and only has $ 500,000 pesos
	 */
	f_menu();
	Scanner keyboard = new Scanner(System.in);
	int sumatory = 0, cost_product, total_product = 0;
        do{
            total_product+=1;
            System.out.println("Input the cost the product ("+total_product+"): ");
            cost_product = keyboard.nextInt();
            sumatory+= cost_product;
            System.out.println("The temporally bill is: "+sumatory);
        }while(sumatory<=500000);
        sumatory-=cost_product;
        total_product-=1;
        System.out.println("Total bill: "+sumatory+ ", total product: "+total_product);
    }
    public static void f_menu() {
        //Description: This method shows the menu of this software
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║         SoftMakeMarket USTA 2020        ║");
        System.out.println("║          Version 1.0 2020-04-22         ║");
        System.out.println("║         Created by: Jhon Alexis         ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

}
