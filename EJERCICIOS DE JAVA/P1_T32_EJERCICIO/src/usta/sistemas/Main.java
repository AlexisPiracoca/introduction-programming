package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /*Author: Jhon Alexis Piracoca
	    *Date: 2020/03/12
	    * Description: This software input two variable and adds
	    */
	    Scanner keyboard = new Scanner(System.in);
	    int v1, v2, suma;
        System.out.println("this program adds two variable, input the first variable: ");
        v1=keyboard.nextInt();
        System.out.println("Input the second variable: ");
        v2=keyboard.nextInt();
        suma= v1+v2;
        System.out.println("This sumatory is: "+suma);
    }
}
