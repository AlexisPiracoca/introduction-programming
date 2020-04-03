package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	 /* AUTHOR: Jhon Alexis Piracoca Arcos
	   DATE: 25/03/2020
	   DESCRIPTION: This software helps determine if you have coronavirus (COVID-19)
	 */
        Scanner keyboard = new Scanner(System.in);
        int tos, dcorporal, dresp, temp, edad;
        int si=1, no=0;
	    System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------------Dr.coronavirus-------------------------");
        System.out.println("This software helps determine if you have coronavirus (COVID-19)");
        System.out.println("----------------------------------------------------------------");
        System.out.println("created by: Jhon Alexis Piracoca");
        System.out.println("----------------------------------------------------------------");
        System.out.println("You have a dry cough yes(1) or not(0)");
          tos=keyboard.nextInt();
           System.out.println("You have body pain yes(1) or not(0)");
             dcorporal=keyboard.nextInt();
              System.out.println("You have trouble breathing yes(1) or not(0)");
                dresp=keyboard.nextInt();
                 System.out.println("What is your temperature");
                   temp=keyboard.nextInt();
                    System.out.println("How old are you");
                      edad=keyboard.nextInt();
                       if (tos == 1 & dcorporal == 1 & dresp == 1 & temp > 38) {
                           System.out.println("The user can have COVID-19 and must remain isolated and strictly follow the health instructions");
                           if (edad>60 && dresp == 1){
                               System.out.println("You must contact your eps");
                           }
                           else{
                               System.out.println("Must stay home");
                              }
                            }
                             if (tos == 0 & dcorporal == 0 & dresp == 0 & temp < 38) {
                               System.out.println("You are healthy");
                           }
                       }
    }

