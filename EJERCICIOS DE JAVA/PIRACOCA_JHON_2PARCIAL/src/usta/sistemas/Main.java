package usta.sistemas;
import java.util.Scanner;
public class Main {
    public static int[][] matrix_wages;
    public static int[] vector_wages_employee;
    public static void main(String[] args) {
	 /*AUTHOR: Jhon Alexis Piracoca Arcos
      DATE: 26/05/2020
      DESCRIPTION: this software simulates the automatic generation of the twelve (12) salaries of the year for N employees.
    */
        f_menu_N_employees();
        f_fill_matrix_wages();
        f_calculates_total_values();
        f_show_rich_employee();
    }
    public static void f_menu_N_employees() {
        //DESCRIPTION: this method show a menu and determinate who many N rows
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║               SoftCompany                ║");
        System.out.println("║               Version 1.0                ║");
        System.out.println("║          Created by: Jhon Alexis         ║");
        System.out.println("╚══════════════════════════════════════════╝");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the number of employees: ");
        int total_employees = keyboard.nextInt();
        while (total_employees<=0) {
            System.err.println("ERROR: the value must greater than zero");
            System.out.println("Input again the number of employees: ");
            total_employees = keyboard.nextInt();
        }
        matrix_wages = new int[total_employees][12];
        vector_wages_employee = new int[total_employees];
    }
    public static void f_fill_matrix_wages(){
        //DESCRIPTION: this method fills the matrix
        for(int i=0; i<matrix_wages.length; i++){
            for (int j=0; j<matrix_wages[0].length; j++) {
                matrix_wages[i][j] = (int) Math.floor((Math.random()*(4439015-877803+1))+877803);
            }
        }
    }
    public static void f_calculates_total_values(){
        //DESCRIPTION: this method calculates the total wages in the year
        for(int i=0; i<matrix_wages.length; i++){
            vector_wages_employee[i]=0;
            for (int j=0; j<matrix_wages[0].length; j++) {
                vector_wages_employee[i]+= matrix_wages[i][j];
            }
        }
    }
    public static void f_show_rich_employee() {
        //DESCRIPTION: this methods show the employees that more money was paid
        int total_paid=vector_wages_employee[0];
        int employee_winner=0, winner_money=vector_wages_employee[0];
        for(int i=1; i<vector_wages_employee.length; i++){
            total_paid+= vector_wages_employee[i];
            if(winner_money<vector_wages_employee[i]){
                employee_winner = i;
                winner_money = vector_wages_employee[i];
            }
        }
        double average = total_paid/(matrix_wages.length*matrix_wages[0].length);
        System.out.println("The total money was paid = $"+total_paid+" the average is = $"+average);
        System.out.println("Employee that more money was paid = "+(employee_winner+1)+" $"+winner_money);
    }
}
    