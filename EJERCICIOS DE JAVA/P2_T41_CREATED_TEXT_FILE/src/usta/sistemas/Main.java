package usta.sistemas;

import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Jhon Alexis Piracoca Arcos
      DATE: 28/05/2020
      DESCRIPTION: created text file
    */
        try{
            PrintWriter admin_files = new PrintWriter("d:/prueba.txt");
            admin_files.println("First line");
            admin_files.println("Second line");
            admin_files.close();
        }catch (Exception e){
            System.err.println("ERROR: this software is finish because: ");
            e.printStackTrace();
        }
    }
}
