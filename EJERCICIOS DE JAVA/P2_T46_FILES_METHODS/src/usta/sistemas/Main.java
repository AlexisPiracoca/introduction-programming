package usta.sistemas;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        // write your code here
        File myfile = new File("D:/names.txt");
        //para saber si el archivo no existe, devuelva true or false
        System.out.println("Files.exits():" + myfile.exists());
        // para saber si directorio, devuelve true o false
        System.out.println("File.isDirectory():" + myfile.isDirectory());
        // para saber la fecha de modificación
        System.out.println("File.lastModified():" + myfile.lastModified());
        // para saber el nombre del archivo
        System.out.println("File.getName():" + myfile.getName());
        // para saber la ruta
        System.out.println("File.getPath():" + myfile.getPath());
        // para saber el tamaño en bytes que ocupa en disco
        System.out.println("File.length():" + myfile.length() + " bytes");
        // para saber si es de lectura, devuelve true o false
        System.out.println("File.canRead():" + myfile.canRead());

        File newfolder = new File("D:/carpeta con archivos ");
        System.out.println(newfolder.mkdir());

       /*
        // si fuera un directorio, para saber los archivos que contiene
        File carpeta = new File("D:/carpeta con archivos");
        System.out.println("------listado archivos D:/carpeta con archivos------");
        for (String archivo : carpeta.list()) {
            System.out.println(archivo);
        }
        //con TRUE le indicamos que se van añadir más registros sin robar los existentes
        try{
            FileWriter myFile2 = new FileWriter("d:/names.txt",true);
            //cargar en memoria ram del S.O. el contenido del archivo
            BufferedWriter datafile = new BufferedWriter(myFile2);
            datafile.write("\nnueva linea tres");
            datafile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
        //cargamos la información del archivo en memoria ram
        try {
            BufferedWriter dataFile = new BufferedWriter(new FileWriter("d:/names.txt", true));
            //agregamos la nueva linea
            dataFile.write("nueva linea sin borrar");
            dataFile.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
