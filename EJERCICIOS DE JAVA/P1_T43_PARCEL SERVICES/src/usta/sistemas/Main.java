package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        public static void main(String[] args) {
            // AUTHOR: Jhon Alexis Piracoca Arcos
            // DATE: 01/04/2020
            // DESCRIPTION: This software calculates the shipping coast of the then ten different products
            int p1, p2, p3, p4, p5, destiny, total_bill;
            Scanner keyboard = new Scanner(System.in);
            f_menu();
            System.out.println("Input the price of the first product:");
            p1 = keyboard.nextInt();
            System.out.println("Input the price of the second product:");
            p2 = keyboard.nextInt();
            System.out.println("Input the price of the third product:");
            p3 = keyboard.nextInt();
            System.out.println("Input the price of the fourth product:");
            p4 = keyboard.nextInt();
            System.out.println("Input the price of the fifth product:");
            p5 = keyboard.nextInt();
            System.out.println("Input the destiny (1=NORTH AMERICA) (2=CENTRAL AMERICA) (3=SOUTH AMERICA) (4=EUROPE) (4=ASIA)");
            destiny = keyboard.nextInt();
            total_bill = p1 + p2 + p3 + p4 + p5 + f_parcel_services(destiny);
            System.out.println("The total bll is:" + total_bill);


        }

        public static void f_menu() {
            //DESCRIPTION: This method show the menu
            System.out.println("--------------------------------");
            System.out.println("|         Soft Calculate       |");
            System.out.println("|    version 1.0 2020-apr-01   |");
            System.out.println("|    Maker: Jhon Alexis        |");
            System.out.println("--------------------------------");
        }

        public static void f_parcel_services(int p_destiny) {
            //DESCRIPTION: This software calculates the cost of parcel services
            int valor;
            if (p_destiny == 1) {
                valor = 11;
            } else if (p_destiny == 2) {
                valor = 10;
            } else if (p_destiny == 3) {
                valor = 12;
            } else if (p_destiny == 4) {
                valor = 24;
            } else if (p_destiny == 5) {
                valor = 27;
            } else {
                System.err.println("ERROR: DESTINY NOT FOUND");
                valor = 0;
            }
            return valor;
    }
}
