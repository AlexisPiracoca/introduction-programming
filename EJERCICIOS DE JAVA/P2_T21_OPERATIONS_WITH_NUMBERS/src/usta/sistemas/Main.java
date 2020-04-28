package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
     /*AUTHOR: Jhon Alexis Piracoca Arcos
        DATE: 28/04/2020
        DESCRIPTION: this software Show the mean of positive numbers, the mean of negative numbers and the number of zeros.
	    */
        f_menu();
        f_operations_numbers();
    }
    public static void f_menu(){
        //DESCRIPTION: this method show the menu of this software
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║            SoftOperations          ║");
        System.out.println("║        Version 1.0 2020-04-28      ║");
        System.out.println("║       Created by: Jhon Alexis      ║");
        System.out.println("╚════════════════════════════════════╝");
    }
    public static void f_operations_numbers(){
        //DESCRIPTION: this function asks for ten numbers
        int sumatory_positives = 0, sumatory_negatives = 0, total_cero = 0, number;
        int total_positives = 0, total_negatives = 0;
        double average_positives = 0, average_negatives = 0;
        for(int i= 0; i <= 10; i++){
            number = f_user_numbers(i);
            if (number < 0){
                sumatory_negatives -= number;
                total_negatives++;
            }else if (number > 0){
                sumatory_negatives += number;
                total_positives++;
            }else{
                total_cero++;
            }
        }
       if (total_positives > 0){
           average_positives = sumatory_positives/total_positives;
       }
       if (total_negatives > 0){
           average_negatives = sumatory_negatives/total_negatives;
       }
        System.out.println("The positives average is " +average_positives);
        System.out.println("The negatives average is " +average_negatives);
        System.out.println("The total zero numbers is " +total_cero);
    }
    public static int f_user_numbers(int i){
        //DESCRIPTION: this method returns a number from the user
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the number " +i);
        int number =keyboard.nextInt();
        return number;
    }
    }
