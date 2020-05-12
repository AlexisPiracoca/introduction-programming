package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	 /*AUTHOR: Jhon Alexis Piracoca Arcos
        DATE: 06/05/2020
       DESCRIPTION: this software Ask the user to enter N number of people's names and
                    determine how many names have the letter "a" and how many have the letter "e".
       */
	 int total_person = f_menu_total_person();
	 String[]vector_names = f_fill_vector(total_person);
	 f_show_letter_a(vector_names);
	 f_show_letter_e(vector_names);
    }
    public static int f_menu_total_person(){
        //DESCRIPTION: this method return the total person
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║             SoftNamesVowels              ║");
        System.out.println("║               Version 1.0                ║");
        System.out.println("║          Created by: Jhon Alexis         ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println("Input the total person do you need: ");
        Scanner keyboard = new Scanner(System.in);
        int total_person = keyboard.nextInt();
        while (total_person<=0){
            System.err.println("ERROR: the total of person will be greater than zero");
            System.out.println("Input again the total person do you need: ");
            total_person = keyboard.nextInt();
        }
        return total_person;
    }
    public static String[] f_fill_vector(int total_person){
        //DESCRIPTION: this method fill the vector
        String[]vector_names = new String[total_person];
        Scanner keyboard = new Scanner(System.in);
        for (int i=0; i<total_person; i++){
            System.out.println("Input the name bye person:"+(i+1));
            vector_names[i] = keyboard.nextLine();
        }
        return vector_names;
    }
    public static void f_show_letter_a(String[] vector_name){
        //DESCRIPTION: this method counts the names that have the letter a
        int total_words = 0;
        for (int i=0; i<vector_name.length; i++){
            if(vector_name[i].indexOf("a")>=0){
                total_words++;
            }
        }
        System.out.println("The total letter (a) are: "+total_words);
    }
    public static void f_show_letter_e(String[] vector_name){
        //DESCRIPTION: this method counts the names that have the letter a
        int total_words = 0;
        for (int i=0; i<vector_name.length; i++){
            if(vector_name[i].indexOf("e")>=0){
                total_words++;
            }
        }
        System.out.println("The total letter (e) are: "+total_words);
    }
}
