package usta.sistemas;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    /*AUTHOR: Jhon Alexis Piracoca Arcos
      DATE: 01/06/2020
      DESCRIPTION: this software Create a txt file in C: \ named "programmer.txt" where the programmer's personal data is stored, for each line:
      Name:
      Biography:
      E-mail:
      Phone:
    */
        f_menu();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = keyboard.nextLine();
        System.out.println("Input your biography: ");
        String biography = keyboard.nextLine();
        System.out.println("Input your e-mail: ");
        String email = keyboard.nextLine();
        System.out.println("Input your number phone: ");
        String phone = keyboard.nextLine();
        boolean ifsave=f_save_data(name,biography,email,phone);
        if(ifsave == true){
            System.out.println("Your information this save into: d:/userdata.txt");
        }else{
            System.out.println("I am sorry, your information is NOT save into: d:/userdata.txt");
        }
    }
    public static void f_menu() {
        //DESCRIPTION: this method show a menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║             SoftSaveDataUser             ║");
        System.out.println("║               Version 1.0                ║");
        System.out.println("║          Created by: Jhon Alexis         ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }
    public static boolean f_save_data(String name, String biography, String email, String phone){
        //DESCRIPTION: this method save the information into a file
        boolean ifsave = true;
        try {
            PrintWriter Myfile = new PrintWriter("d:/userdata.txt", "UTF-8");
            Myfile.println("Name: "+name);
            Myfile.println("Biography: "+biography);
            Myfile.println("E-mail: "+email);
            Myfile.println("Phone: "+phone);
            Myfile.close();
        }catch (Exception e){
            System.err.println("THE SOFTWARE CANNOT SAVE THE INFORMATION");
            e.printStackTrace();
            ifsave = false;
        }
        return ifsave;
    }
}
