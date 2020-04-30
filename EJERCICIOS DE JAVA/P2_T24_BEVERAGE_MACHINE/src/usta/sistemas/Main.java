package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Jhon Alexis Piracoca Arcos
        DATE: 30/04/2020
        DESCRIPTION: this software simulate a coffee machine
	    */
        f_menu();
        int product= f_options();

        int product_cost=f_date_product(product,1); //me retorna el costo del product
        int product_time=f_date_product(product,2); //me retorna el tiempo del producto

        int money_user= f_input_money();

        while(money_user<product_cost){
            System.err.println("Do you need input "+(product_cost-money_user)+" money");
            money_user+= f_input_money();
        }
        int surplus= money_user-product_cost;
        System.out.println("Your surplus money is: $"+surplus+" the product time finish is: "+product_time+" seconds");
    }
    public static void f_menu() {
        //DESCRIPTION: this method show the menu of this software
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║            SoftCoffeeMachine             ║");
        System.out.println("║               Version 1.0                ║");
        System.out.println("║          Created by: Jhon Alexis         ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }
    public static int f_options() {
        //DESCRIPTION: this method show the menu the options
        System.out.println("╔═════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║     PRODUCT      ║       VALUE       ║     TIME CREATION     ║    OPTION    ║");
        System.out.println("║══════════════════║═══════════════════║═══════════════════════║══════════════║");
        System.out.println("║  Aromática       ║      $1.300       ║         30 seg        ║      1       ║");
        System.out.println("║══════════════════║═══════════════════║═══════════════════════║══════════════║");
        System.out.println("║  Café Negro      ║      $1.000       ║         30 seg        ║      2       ║");
        System.out.println("║══════════════════║═══════════════════║═══════════════════════║══════════════║");
        System.out.println("║  Café con Leche  ║      $1.900       ║         45 seg        ║      3       ║");
        System.out.println("║══════════════════║═══════════════════║═══════════════════════║══════════════║");
        System.out.println("║  Capuchino       ║      $2.500       ║         60 seg        ║      4       ║");
        System.out.println("║══════════════════║═══════════════════║═══════════════════════║══════════════║");
        System.out.println("║  Mocachino       ║      $2.700       ║         70 seg        ║      5       ║");
        System.out.println("╚═════════════════════════════════════════════════════════════════════════════╝");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the option:");
        int option = keyboard.nextInt();
        while (option < 1 || option > 5) {
            System.err.println("ERROR: this option not exits");
            System.out.println("Input Again the option:");
            option = keyboard.nextInt();
        }
        return option;
    }
    public static int f_input_money(){
        //DESCRIPTION: this method return the input money of user
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input your money$:");
        int money = keyboard.nextInt();
        while (money < 50 || money > 5000) {
            System.err.println("ERROR: your money cannot be processed (between $50 and $5000)");
            System.out.println("Input Again your money$:");
            money = keyboard.nextInt();
        }
        return money;
    }
    public static int f_date_product(int product, int option){
        //description: this methods return two choice (money or time)
        int data_product;
        if (product==1){  //aromatica
            if(option==1){  //money
                data_product=1300;
            }else{ //time
                data_product=30;
            }
        }else if(product==2){  //cafe negro
            if(option==1){  //money
                data_product=1000;
            }else{ //time
                data_product=30;
            }
        }else if(product==3){  //caffe con leche
            if(option==1){  //money
                data_product=1900;
            }else{ //time
                data_product=45;
            }
        }else if(product==4){ //capuchino
            if(option==1){  //money
                data_product=2500;
            }else{ //time
                data_product=60;
            }
        }else{ //mocachino
            if(option==1){  //money
                data_product=2700;
            }else{ //time
                data_product=70;
            }
        }
        return  data_product;
    }
}
