package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Jhon Alexis Piracoca Arcos
	   DATE: 13/04/2020
	   DESCRIPTION: This software program that uses different methods to convert to from
	 */
        int kind_from, kind_to;
        f_menu();
        kind_from=f_kind_from_grades();
        if (kind_from!=0){  //if user input 1 or 2 or 3
            kind_to=f_kind_to_grades(kind_from);
            if (kind_to!=0){
                f_convert(kind_from,kind_to);
    }
   }

   }
    public static void f_menu(){
        //DESCRIPTION: This method show the menu of this software
        System.out.println("-----------------------------");
        System.out.println("|--------SoftCovert---------|");
        System.out.println("|--Version 1.0 2020/13/04---|");
        System.out.println("|--Created by: Jhon Alexis--|");
        System.out.println("-----------------------------");
        System.out.println("Input of the kind of options grades: \n1=Celsius \n2=Fahrenheit \n3=Kelvin");
    }
    public static int f_kind_from_grades() {
        // DESCRIPTION: This method return form kind of grades
        Scanner keyboard = new Scanner(System.in);
        int opt = keyboard.nextInt();
        if (opt == 1 || opt == 2 || opt == 3) {
            if (opt==1||opt==2||opt==3){
                System.out.println("Started");
            }
        } else {
            System.err.println("ERROR: finish the software, the reason is the class does not exist");
            opt=0;
        }
        return opt;
    }
    public static int f_kind_to_grades(int kind_from){
        //DESCRIPTION: This method return to kinds grades
        System.out.println("Input of the kind do you want convert the grades:\n 1-celsius\n 2-fahrenheit\n 3-kelvin:");
        Scanner keyboard = new Scanner(System.in);
        int opt=keyboard.nextInt();
        if (opt==1 || opt ==2 || opt==3){
            if (opt==kind_from){
                System.err.println("ERR: THE CLASS ARE SAME");
                opt=0;
            }
        }else{
            System.err.println("ERR: FINISH THE SOFTWARE, THE REASON IS THE CLASS DOES NOT EXIST");
            opt=0;
        }
        return opt;

        }
    public static void f_convert(int kind_from, int kind_to) {
        //DESCRIPTION: this method convert kinds grades
        System.out.println("Input the grades:");
        Scanner keyboard = new Scanner(System.in);
        int grades = keyboard.nextInt();
        double grades_convert;
        if (kind_from == 1 && kind_to == 2) {    //Convert celsius to fahrenheit
            grades_convert = grades * 1.8 + 32;
            System.out.println("The celsius is:" + grades + " is same grades fahrenheit is:" + grades_convert);
        } else if (kind_from == 1 && kind_to == 3) {   //Convert celsius to kelvin
            grades_convert = grades + 273.15;
            System.out.println("The celsius is:" + grades + " is same grades kelvin is:" + grades_convert);
        } else if (kind_from == 2 && kind_to == 1) {   //Convert fahrenheit to celsius
            grades_convert = (grades - 32) / 1.8;
            System.out.println("The fahrenheit is:" + grades + " is same grades celsius is:" + grades_convert);
        } else if (kind_from == 2 && kind_to == 3) {   //Convert fahrenheit to kelvin
            grades_convert = ((grades - 32) / 1.8) + 273.15;
            System.out.println("The fahrenheit is:" + grades + " is same grades kelvin is:" + grades_convert);
        } else if (kind_from == 3 && kind_to == 1) {   //Convert kelvin to celsius
            grades_convert = grades - 273.15;
            System.out.println("The kelvin is:" + grades + " is same grades celsius is:" + grades_convert);
        } else if (kind_from == 3 && kind_to == 2) {   //Convert kelvin to fahrenheit
            grades_convert = (grades - 273.15) * 1.8 + 32;
            System.out.println("The kelvin is:" + grades + " is same grades fahrenheit is:" + grades_convert);
        }
    }
}



