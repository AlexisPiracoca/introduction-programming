package usta.sistemas;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Jhon Alexis Piracoca Arcos
        DATE: 04/05/2020
       DESCRIPTION: this software saves the salaries of 5 employees using an arrangement (vector),
                    where the salaries are a random value between $1.000.000 and $2.000.000
       */
	f_menu();
	int[]salary_of_employees = f_sueldos();
    f_show_sueldos(salary_of_employees);
    }
    public static void f_menu() {
        //DESCRIPTION: this method show the menu of this software
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║             SoftVectorSalary             ║");
        System.out.println("║               Version 1.0                ║");
        System.out.println("║          Created by: Jhon Alexis         ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }
    public static int[] f_sueldos(){
        //DESCRIPTION: this method returns a vector with salary of live employees
        Random rand = new Random();
        int[] salary = new int [5]; //this var to save the salary of five employees
        for (int i=0;i<5;i++){
            salary[i]=(int) Math.floor(Math.random()*(2000000-1000000+1)+100000);
        }
        return salary;
    }
    public static void f_show_sueldos(int[]salary){
        //DESCRIPTION: this method show the vector with the salary
        System.out.println("-----The list of salary is:-----");
        for (int i=0;i<5;i++) {
            System.out.println("The salary of employed (" + (i + 1) + ") is :" + salary[i]);
        }
    }
}
