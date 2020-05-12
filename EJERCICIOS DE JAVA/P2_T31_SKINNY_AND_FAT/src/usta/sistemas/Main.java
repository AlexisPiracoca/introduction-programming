package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
      /*AUTHOR: Jhon Alexis Piracoca Arcos
        DATE: 06/05/2020
       DESCRIPTION: this software generates the weights (values ​​between 20 to 120 kilos) for N men
       */
      int total_people = f_menu_total_people();
      double[] vector_weights = f_fill_vector_weights(total_people);
      f_show_malnourished_people(vector_weights);
      f_show_skinny_people(vector_weights);
      f_show_fat_people(vector_weights);
      f_show_all_weights(vector_weights);
    }
    public static int f_menu_total_people() {
        //DESCRIPTION: this method return a menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║             SoftSkinnyAndFat             ║");
        System.out.println("║               Version 1.0                ║");
        System.out.println("║          Created by: Jhon Alexis         ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println("Input the total people:");
        Scanner keyboard = new Scanner(System.in);
        int total_number = keyboard.nextInt();
        while (total_number<=0){
            System.err.println("ERROR: the value cannot be lass than zero");
            System.out.println("Input the total people again: ");
            total_number = keyboard.nextInt();
        }
        return total_number;
    }
    public static double[] f_fill_vector_weights(int total_people){
        //DESCRIPTION: this method return a vector
        double[]vector_weights = new double[total_people];
        for (int i=0; i<total_people; i++){
            vector_weights[i] = (Math.random()*(120-20+1)+20);
        }
        return vector_weights;
    }
    public static void f_show_malnourished_people(double[]vector_weights){
        //DESCRIPTION: this method show the total people are malnourished
        int total_malnourished = 0;
        for(double weight: vector_weights){
            if (weight<40){
                total_malnourished++;
            }
        }
        System.out.println("The total of malnourished people is: "+total_malnourished);
    }
    public static void f_show_skinny_people(double[]vector_weights){
        //DESCRIPTION: this method show the total people are skinny
        int total_skinny = 0;
        for(double weight: vector_weights){
            if (weight>=40 & weight<70){
                total_skinny++;
            }
        }
        System.out.println("The total of skinny people is: "+total_skinny);
    }
    public static void f_show_fat_people(double[]vector_weights){
        //DESCRIPTION: this method show the total people are flat
        int total_fat = 0;
        for(double weight: vector_weights){
            if (weight>=70){
                total_fat++;
            }
        }
        System.out.println("The total of fat people is: "+total_fat);
    }
    public static void f_show_all_weights(double[]vector_weights){
        //DESCRIPTION: this method show oll weights
        for(int i=0; i<vector_weights.length; i++){
            System.out.println("The weight of the person ("+(i+1)+" )is: "+vector_weights[i]);
        }
    }
}
