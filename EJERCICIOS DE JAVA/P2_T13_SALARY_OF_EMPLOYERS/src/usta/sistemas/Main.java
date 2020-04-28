package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR; Jhon Alexis Piracoca Arcos
	  DATE: 21/04/2020
	  DESCRIPTION: this software calculates the average salary, total salary and highest salary of N employees,
	               where salary = (salary / 30) * working_days.
	 */
	f_menu();
	int N=f_number_employers();
	double highestSalary = 0, total_salary = 0, average_salary = 0, salary_employe;
	for (int i=1;1<=N;i=1+1){
       salary_employe = f_salary(i);
       total_salary = total_salary + salary_employe;
       if (highestSalary<salary_employe){
           highestSalary = salary_employe;
        }
      }
	average_salary = total_salary/N;
        System.out.println("The total salary is: "+total_salary+" the average salary is:  "+average_salary+" the highest salary is: "+highestSalary);
    }
    public static void f_menu() {
        //Description : This method shows the menu of this software
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║          SoftSalary USTA 2020           ║");
        System.out.println("║             Version 1.0                 ║");
        System.out.println("║         Created by: Jhon Alexis         ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }
    public static int f_number_employers(){
        //DESCRIPTION: this method return the numbers of employers
        Scanner keyboard = new Scanner(System.in);
        int employes;
        do {
            System.out.println("Input the total employers (input more then 1 employer):");
            employes = keyboard.nextInt();
        }while (employes<1);
        return employes;
    }
    public static double f_salary(int i){
        //DESCRIPTION: this method return the salary of one employer
        Scanner keyboard = new Scanner(System.in);
        double sueldo, diasT, salary;
        do{
            System.out.println("Input the wages (the value must be more zero): ");
            sueldo = keyboard.nextDouble();
        }while (sueldo<1);
        do{
            System.out.println("Input the days worked (the value must be between 1 and 30 ");
            diasT = keyboard.nextDouble();
        }while(diasT<1||diasT>30);
        salary = (sueldo/30)*diasT;
        return salary;
    }
}
