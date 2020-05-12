package usta.sistemas;

public class Main {

    public static void main(String[] args) {
     /*AUTHOR: Jhon Alexis Piracoca Arcos
        DATE: 04/05/2020
       DESCRIPTION: this software that allows storing the salaries of the employees grouped by shift.
       */
        f_menu();
        int[]turn_morning = f_salary_turn();
        int[]turn_afternoon = f_salary_turn();
        int salary_total_morning = f_show_salary_morning(turn_morning);
        int salary_total_afternoon = f_show_salary_afternoon(turn_afternoon);
        System.out.println("The total salary (morning + afternoon)= "+(salary_total_morning+salary_total_afternoon));
    }
    public static void f_menu() {
        //DESCRIPTION: this method show the menu of this software
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║            SoftTwoVectorSalary           ║");
        System.out.println("║               Version 1.0                ║");
        System.out.println("║          Created by: Jhon Alexis         ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }
    public static int[]f_salary_turn(){
        //DESCRIPTION: this method returns the salary of 8 employees
        int[] salary =new int[8];
        for(int i=0;i<8;i++){
            salary[i]= (int) Math.floor(Math.random()*(2000000-980658)+980658);
        }
        return salary;
    }
    public static int f_show_salary_morning(int[]turn_morning){
        //DESCRIPTION: this method show the salary by turn of afternoon
        System.out.println("-----Turn the morning-----");
        int total_salary =0;
        for(int i=0;i<8;i++){
            total_salary+=turn_morning[i];
            System.out.println("The salary of employed ("+(i+1)+") is: "+turn_morning[i]);
        }
        System.out.println("The total salary by turn of morning is: "+total_salary);
        return total_salary;
    }
    public static int f_show_salary_afternoon(int[]turn_afternoon){
        //DESCRIPTION: this method show the salary by turn of morning
        System.out.println("-----Turn the afternoon-----");
        int total_salary =0;
        for(int i=0;i<8;i++){
            total_salary+=turn_afternoon[i];
            System.out.println("The salary of employed ("+(i+1)+") is: "+turn_afternoon[i]);
        }
        System.out.println("The total salary by turn of afternoon is: "+total_salary);
        return total_salary;
    }
}
