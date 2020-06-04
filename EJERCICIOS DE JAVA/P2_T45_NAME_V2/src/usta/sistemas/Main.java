package usta.sistemas;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
	/*AUTHOR: Jhon Alexis Piracoca Arcos
      DATE: 02/06/2020
      DESCRIPTION: this software load in a vector the names of the file named “names.txt” (created in the previous exercise)
                   and visualize them on the screen, the software should show a menu where it gives the user the option to
                   enter new names or delete existing ones.
    */
        int option= f_menu_option();
        do {
            if(option==1){
                f_add_names();
            }else if(option==2){
                f_DeleteNames();
            }else if(option==3) {
                f_ShowNames();
            }
            option=f_menu_option();
        }while (option!=0);
    }
    public static byte f_menu_option() {
        //DESCRIPTION: this method show a menu
        try {
            System.out.println("╔══════════════════════════════════════════╗");
            System.out.println("║                SoftNames                 ║");
            System.out.println("║               Version 1.0                ║");
            System.out.println("║          Created by: Jhon Alexis         ║");
            System.out.println("╚══════════════════════════════════════════╝");
            System.out.println("Select a option: " +
                    "\n1.Enter names" +
                    "\n2.Delete old names" +
                    "\n3.Visualize the archive" +
                    "\n0.Exit");
            byte option = keyboard.nextByte();
            while (option < 0 || option > 3) {
                System.err.println("ERROR: the input must be between 1 and 3, Retry: ");
                option = keyboard.nextByte();
            }
            return option;
        } catch (Exception e) {
            System.out.println("ERROR: the method f_menu has an error because: ");
            e.printStackTrace();
            return 0;
        }
    }
    public static void f_ShowNames() {
        try {
            Scanner myFile = new Scanner(new File("d:/names.txt"));

            System.out.println("The data of the archive Names.txt is:");

            while (myFile.hasNextLine()) {
                System.out.println(myFile.nextLine());
            }
        } catch (Exception e) {
            System.err.println("ERROR, The method f_ShowNames has an error because:");
            e.printStackTrace();
        }
    }
    public static void f_DeleteNames() {
        try {
            PrintWriter myFile = new PrintWriter("d:/names.txt", "UTF-8");

            myFile.println("");
            myFile.close();

            System.out.println("The data has deleted susessfully.");
        } catch (Exception e) {
            System.err.println("ERROR, The method f_DeleteNames has an error because:");
            e.printStackTrace();
        }
    }
    public static void f_add_names(){
        try {
            File file= new File("d:/names.txt");
            if (file.exists()) {
                //instanciamos el archivo con TRUE para agregar nuevas lineas
                FileWriter myFile = new FileWriter(file, true);
                //lo cargamos en memoria RAM
                BufferedWriter datafile= new BufferedWriter(myFile);
                //agregamos la linea
                datafile.write("\n"+f_input_name());
                System.out.println("----the new name is save---");
                //cerrramos el archivo
                datafile.close();
            }else{
                System.out.println("SORRY the file D:/names.txt DON'T EXIST");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String f_input_name(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input de new name:");
        String name=keyboard.nextLine();
        while(name.length()<5){
            System.err.println("ERR: the size of the name should than five or greater");
            System.out.println("Input again the name");
            name=keyboard.nextLine();
        }
        return name;
    }
}
