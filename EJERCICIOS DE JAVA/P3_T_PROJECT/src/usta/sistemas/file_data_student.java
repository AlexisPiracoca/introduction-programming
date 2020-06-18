package usta.sistemas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file_data_student {
    //AUTHOR: Jhon Alexis Piracoca Arcos
    //DATE: 2020/06/09
    //DESCRIPTION: this class creates and show data of a file d:/students.txt
    public static boolean f_add_student(String p_name, String p_last_name, String p_faculty){
        //DESCRIPTION: this method create  new line into a file d:/students.txt
        boolean result;
        try {
            File myfile = new File("D:/students.txt");
            if(myfile.exists()){
                //instanciamos el archivo con true para agregar nuevas lineas
                FileWriter myfile2 = new FileWriter(myfile,true);
                //cargar la data del archivo en memoria
                BufferedWriter datamyfile = new BufferedWriter(myfile2);
                datamyfile.write("\n"+p_name+"|"+p_last_name+"|"+p_faculty);
                datamyfile.close();
                result = true;
            }else{
                result = false;
            }
            return result;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public static String[][]f_all_data_students(){
        //DESCRIPTION: this method returns all data of file D:/students.txt
        String[][] matrix_students;
        String linea_texto, linea_tmp;
        int row = 0, total_lines = 0, separador1, separador2;
        try{
            File myfile = new File("D:/students.txt");
            if(myfile.exists()){
                Scanner myfile2 = new Scanner(myfile);
                while (myfile2.hasNextLine()){
                    total_lines++;
                    myfile2.nextLine();
                }
                myfile2.close();
                myfile2 = null;
                matrix_students = new String[total_lines][3];
                myfile2 = new Scanner(myfile);
                while (myfile2.hasNextLine()) {
                    linea_texto = myfile2.nextLine();
                    separador1 = linea_texto.indexOf("|");
                    if (separador1 != -1){
                        matrix_students[row][0] = linea_texto.substring(0, separador1);//solo el nombre del estudiante
                        linea_tmp = linea_texto.substring(separador1 + 1);
                        separador2 = linea_tmp.indexOf("|");
                        matrix_students[row][1] = linea_tmp.substring(0, separador2); //solo el apellido
                        matrix_students[row][2] = linea_tmp.substring(separador2 + 1); //solo la facultad
                        row++;
                    }
                }
                myfile2.close();
                return matrix_students;
            }else{
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return  null;
        }
    }
}
