package usta.sistemas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file_data_project {
    //AUTHOR: Jhon Alexis Piracoca Arcos
    //DATE: 2020/06/09
    //DESCRIPTION: this class creates and show data of a file d:/project.txt
    public static boolean f_add_project(String code, String name, String faculty, String researcher) {
        //DESCRIPTION: this method create  new line into a file d:/students.txt
        boolean result;
        try {
            File myfile = new File("D:/project.txt");
            if (myfile.exists()) {
                //instanciamos el archivo con true para agregar nuevas lineas
                FileWriter myfile3 = new FileWriter(myfile, true);
                //cargar la data del archivo en memoria
                BufferedWriter datamyfile2 = new BufferedWriter(myfile3);
                datamyfile2.write("\n" + code + "|" + name + "|" + faculty + "|" + researcher);
                datamyfile2.close();
                result = true;
            } else {
                result = false;
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public static String[][]f_all_data_project(){
        //DESCRIPTION: this method returns all data of file D:/project.txt
        String[][] matrix_project;
        String linea_texto, linea_tmp, linea_tmp1,linea_tmp2;
        int row = 0, total_lines = 0, separador1, separador2, separador3;
        try{
            File myfile = new File("D:/project.txt");
            if(myfile.exists()){
                Scanner myfile3 = new Scanner(myfile);
                while (myfile3.hasNextLine()){
                    total_lines++;
                    myfile3.nextLine();
                }
                myfile3.close();
                matrix_project = new String[total_lines][4];
                myfile3 = new Scanner(myfile);
                while (myfile3.hasNextLine()) {
                    linea_texto = myfile3.nextLine();
                    separador1 = linea_texto.indexOf("|");
                    if (separador1 != -1){
                        matrix_project[row][0] = linea_texto.substring(0, separador1);//solo el codigo del estudiante
                        linea_tmp = linea_texto.substring(separador1 + 1);
                        separador2 = linea_tmp.indexOf("|");
                        matrix_project[row][1] = linea_tmp.substring(0, separador2); //solo el nombre
                        linea_tmp1 = linea_tmp.substring(separador2 + 1);
                        separador3 = linea_tmp1.indexOf("|");
                        matrix_project[row][2] = linea_tmp1.substring(0, separador3); //solo la facultad
                        linea_tmp2 = linea_tmp1.substring(separador3 + 1);
                        matrix_project[row][3] = linea_tmp2; //solo el investigador
                        row++;
                    }
                }
                myfile3.close();
                return matrix_project;
            }else{
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return  null;
        }
    }
}
