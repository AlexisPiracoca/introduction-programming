package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Jhon Alexis Piracoca Arcos
      DATE: 13/05/2020
      DESCRIPTION: this software rate food in the Giordano Bruno building cafeteria. For this,
                    a scale of 1 to 10 was defined (1 denotes horrible and 10 denotes excellent).
    */
        int total_students = f_menu_total_students();
        int[][] rates_matrix = f_fill_rate_matrix_(total_students);
        f_show_bad_rates(rates_matrix);
        f_show_regular_rates(rates_matrix);
        f_show_excellent_rates(rates_matrix);
    }
    public static int f_menu_total_students() {
        //DESCRIPTION: this method return a menu
        Scanner keyboard = new Scanner(System.in);
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║              SoftRatesFoods              ║");
        System.out.println("║               Version 1.0                ║");
        System.out.println("║          Created by: Jhon Alexis         ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println("Input who many students do you want by rate food: ");
        int total_students = keyboard.nextInt();
        while (total_students<=0){
            System.err.println("ERROR: this value must greater than zero");
            System.out.println("Input again who many students do you want: ");
            total_students = keyboard.nextInt();
        }
        return total_students;
    }
    public static int [][]f_fill_rate_matrix_(int total_students){
        //DESCRIPTION: this method returns a matrix with rates of N students
        int[][] rates_matrix = new int[total_students][20];
        for (int i=0; i<total_students; i++) {
            for (int j=0; j<20; j++){
                rates_matrix[i][j] = (int) Math.floor((Math.random()*10))+1;
            }
        }
        return rates_matrix;
    }
    public static void f_show_bad_rates(int[][] rates_matrix){
        //DESCRIPTION: this method show the bad rates (<=3)
        int total_bad_rates = 0;
        for (int i=0; i<rates_matrix.length; i++){
            for (int j=0; j<20; j++){
                if (rates_matrix[i][j]<=3){
                    total_bad_rates++;
                }
            }
        }
        double percent = (total_bad_rates*100)/(rates_matrix.length*20);
        System.out.println("Total bad rates (<=3): "+total_bad_rates+" and with a percentage: "+percent+"%");
    }
    public static void f_show_regular_rates(int[][] rates_matrix){
        //DESCRIPTION: this method show the regular rates (between 4 and 6)
        int total_regular_rates = 0;
        for (int i=0; i<rates_matrix.length; i++){
            for (int j=0; j<20; j++){
                if (rates_matrix[i][j]>=4 && rates_matrix[i][j]<=6){
                    total_regular_rates++;
                }
            }
        }
        double percent = (total_regular_rates*100)/(rates_matrix.length*20);
        System.out.println("Total regular rates (>=4 and <=6): "+total_regular_rates+" and with a percentage: "+percent+"%");
    }
    public static void f_show_excellent_rates(int[][] rates_matrix){
        //DESCRIPTION: this method show the excellent rates (grater or same than 7)
        int total_excellent_rates = 0;
        for (int i=0; i<rates_matrix.length; i++){
            for (int j=0; j<20; j++){
                if (rates_matrix[i][j]>=7){
                    total_excellent_rates++;
                }
            }
        }
        double percent = (total_excellent_rates*100)/(rates_matrix.length*20);
        System.out.println("Total excellent rates (>=7): "+total_excellent_rates+" and with a percentage: "+percent+"%");
    }
}
