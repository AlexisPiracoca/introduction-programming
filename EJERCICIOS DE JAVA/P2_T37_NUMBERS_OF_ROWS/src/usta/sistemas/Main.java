package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
     /*AUTHOR: Jhon Alexis Piracoca Arcos
      DATE: 19/05/2020
      DESCRIPTION: this software fill a two-dimensional array of N x M (values that the user must enter by keyboard),
                   with random numbers between 1 and 1000.
    */
        int rows = f_menu_total_rows();
        int columns = f_total_columns();
        int[][]matrix_numbers = new int[rows][columns];
        matrix_numbers = f_fill_matrix(matrix_numbers);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the number of the row: ");
        int number_row = keyboard.nextInt();
        int summatory = 0;
        double average = 0;
        while (number_row>=0 && number_row<matrix_numbers.length){
            System.out.println();
            for(int j=0; j<matrix_numbers[0].length; j++){
                System.out.print(" | "+matrix_numbers[number_row][j]);
                summatory+=matrix_numbers[number_row][j];
            }
            average=summatory/matrix_numbers[0].length;
            System.out.println(" By number row "+number_row+", summatory is: "+summatory+" and average is: "+average);
            System.out.println("Input the other number of the row");
            number_row=keyboard.nextInt();
        }
        System.out.println("Thanks");
    }
    public static int f_menu_total_rows(){
        //DESCRIPTION: this method show a menu
        Scanner keyboard = new Scanner(System.in);
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║             SoftRowsNumbers              ║");
        System.out.println("║               Version 1.0                ║");
        System.out.println("║          Created by: Jhon Alexis         ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println("Input who many rows do you want in the matrix: ");
        int total_rows = keyboard.nextInt();
        while (total_rows<=0){
            System.err.println("ERROR: the value must greater than zero");
            System.out.println("Input again who many total rows do you want: ");
            total_rows = keyboard.nextInt();
        }
        return total_rows;
    }
    public static int f_total_columns(){
    //DESCRIPTION: this method returns the total columns of a matrix
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input who many rows do you want in the matrix");
        int total_columns = keyboard.nextInt();
    while (total_columns<=0){
        System.err.println("ERROR: the value must greater than zero");
        System.out.println("Input again who many total rows do you want");
        total_columns = keyboard.nextInt();
    }
        return total_columns;
   }
    public static int[][]f_fill_matrix(int[][] matrix_numbers){
        //DESCRIPTION: this method fill a matrix
       for(int i=0; i<matrix_numbers.length; i++){
           for(int j=0; j<matrix_numbers[0].length; j++){
               matrix_numbers[i][j]=(int)Math.floor((Math.random()*1000)+1);
           }
       }
       return matrix_numbers;
   }
}
