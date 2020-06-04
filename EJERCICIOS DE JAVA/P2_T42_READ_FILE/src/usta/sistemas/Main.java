package usta.sistemas;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 /*AUTHOR: Jhon Alexis Piracoca Arcos
      DATE: 01/06/2020
      DESCRIPTION: this software show the information of a file
    */
        try{
            Scanner Myfile = new Scanner(new File("D:/prueba.txt"));
            while(Myfile.hasNextLine()){
                System.out.println(Myfile.nextLine());
            }
            Myfile.close();
        }catch (Exception e){
            System.out.println("----------------The software has finished with err:-------------");
            e.printStackTrace();
        }

    }
}
