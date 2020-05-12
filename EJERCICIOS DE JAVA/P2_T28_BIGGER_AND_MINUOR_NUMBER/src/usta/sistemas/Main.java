package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	 /*AUTHOR: Jhon Alexis Piracoca Arcos
        DATE: 05/05/2020
       DESCRIPTION: this software calculates wha number is the bigger or minor
       */
	 int total_numbers = f_menu_total_numbers();
	 int[] vector_numbers = f_fill_vector_numbers(total_numbers);
	 f_show_bigger_number(vector_numbers);
	 f_show_minor_number(vector_numbers);
    }
    public static int f_menu_total_numbers() {
        //DESCRIPTION: this method return the total numbers
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║            SoftBiggerAndMinor            ║");
        System.out.println("║               Version 1.0                ║");
        System.out.println("║          Created by: Jhon Alexis         ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println("Input the total number: ");
        Scanner keyboard = new Scanner(System.in);
        int total_number = keyboard.nextInt();
        while (total_number<=0){
            System.err.println("ERROR: the value can´t be minor or same zero");
            System.out.println("Input again the total number: ");
            total_number = keyboard.nextInt();
        }
        return total_number;
    }
    public static int[] f_fill_vector_numbers(int total_numbers){
        //DESCRIPTION: this method fill the vector
        Scanner keyboard = new Scanner(System.in);
        int[] vector = new int[total_numbers];
        for(int i=0; i<vector.length; i++){
            System.out.println("Input the integer number ("+(i+1)+")");
            vector[i]=keyboard.nextInt();
        }
        return vector;
    }
    public static void f_show_bigger_number(int[] vector_numbers){
        //DESCRIPTION: this method show the bigger number in vector
        int bigger_number = 0;
        for(int i=0; i<vector_numbers.length; i++){
            if(i==0){
                bigger_number = vector_numbers[i];
            }else{
                if(bigger_number < vector_numbers[i]){
                    bigger_number = vector_numbers[i];
                }
            }
        }
        System.out.println("The bigger number is: "+bigger_number);
    }
    public static void f_show_minor_number(int[] vector_numbers){
        //DESCRIPTION: this method show the bigger number in vector
        int minor_number = 0;
        for(int i=0; i<vector_numbers.length; i++){
            if(i==0){
                minor_number = vector_numbers[i];
            }else{
                if(minor_number > vector_numbers[i]){
                    minor_number = vector_numbers[i];
                }
            }
            System.out.println("The vector ["+i+"]"+vector_numbers[i]);
        }
        System.out.println("The minor number is: "+minor_number);
    }
}
