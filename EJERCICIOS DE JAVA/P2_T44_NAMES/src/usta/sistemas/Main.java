package usta.sistemas;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
    public static int total_names;
    public static String[] vector_names;
    public static void main(String[] args) {
	/*AUTHOR: Jhon Alexis Piracoca Arcos
      DATE: 02/06/2020
      DESCRIPTION: this software ask the user to enter N amount of names of people and these names are
                   saved in a file called "names.txt", the names must be saved one on each line
                   (Each name must have a minimum of 5 letters).
    */
        f_menu();
        for (int i=0; i<total_names; i++){
            vector_names[i] = f_input_name(i);
        }
        f_save_file();
    }
    public static void f_menu() {
        //DESCRIPTION: this method show a menu
        try {
            System.out.println("╔══════════════════════════════════════════╗");
            System.out.println("║                SoftNames                 ║");
            System.out.println("║               Version 1.0                ║");
            System.out.println("║          Created by: Jhon Alexis         ║");
            System.out.println("╚══════════════════════════════════════════╝");
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Input the total names: ");
            total_names = keyboard.nextInt();
            while(total_names<1){
                System.out.println("Sorry the total names should be greater than zero, input again the total names: ");
                total_names = keyboard.nextInt();
            }
            vector_names = new String[total_names];
        }catch (Exception e){
            System.err.println("ERROR: the system is finish, because: ");
            e.printStackTrace();
        }
    }
    public static String f_input_name(int i){
        //DESCRIPTION: this method returns the name
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Input the name for person ("+(i+1)+")");
            String name = keyboard.nextLine();
            while (name.length()    <5){
                System.out.println("Sorry, the name should have five or more characters, Input again the name for person ("+(i+1)+")");
                name = keyboard.nextLine();
            }
            return name;
        }catch (Exception e){
            System.out.println("ERROR: the software is finish beacuse: ");
            e.printStackTrace();
        }
        return " ";
    }
    public static void f_save_file(){
        //DESCRIPTION: this method walks the vector and save the data into a file
        try{
            PrintWriter myfile = new PrintWriter("d:/names.txt","UTF-8");
            for (String i_name:vector_names){
                myfile.println(i_name);
            }
            myfile.close();
            System.out.println("The data with name is save into d:/names.txt");
        } catch (Exception e) {
            System.err.println("The data don´t save into d:/names.txt, because");
            e.printStackTrace();
        }
    }
}
