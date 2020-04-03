package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	   /* AUTHOR: Jhon Alexis Piracoca Arcos
	   DATE: 24/03/2020
	   DESCRIPTION: This software calculate the grade final of a student
	   */
	   Scanner keyboard = new Scanner(System.in);
	   double grade1, grade2, grade3, grade4, gradefinal;
        System.out.println("Software gradesoft: calculate the final grade");
        System.out.println("Do you need input de first grade (20%), the grade between 0 to 5:");
        grade1=keyboard.nextDouble();
        System.out.println("Do you need input de second grade (25%), the grade between 0 to 5:");
        grade2=keyboard.nextDouble();
        System.out.println("Do you need input de third grade (25%), the grade between 0 to 5:");
        grade3=keyboard.nextDouble();
        System.out.println("Do you need input de fourth grade (30%), the grade between 0 to 5:");
        grade4=keyboard.nextDouble();
        if (grade1<0 || grade1>5 ||
            grade2<0 || grade2>5 ||
            grade3<0 || grade3>5 ||
            grade4<0 || grade4>5){
            System.out.println("ERROR: this grades no are between 0 to 5");
        }else{
            gradefinal=(grade1*0.2)+(grade2*0.25)+(grade3*0.25)+(grade4*0.30);
            System.out.println("The final grade is: "+gradefinal);
        }

    }
}
