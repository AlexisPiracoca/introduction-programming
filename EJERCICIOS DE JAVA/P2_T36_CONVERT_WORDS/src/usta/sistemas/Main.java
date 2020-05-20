package usta.sistemas;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Jhon Alexis Piracoca Arcos
      DATE: 14/05/2020
      DESCRIPTION: this software Allow to create a 4x5 matrix with the following information
                   replace all the vowels with = a = @, e = 3, i = 1, o = Ø (alt + 157), u = ⌂ (alt +127)
    */
        f_menu();
        String[][] matrix_names = {{"maria", "pedro", "JOSE", "camilo", "rodrigo"},
                                   {"Ana", "lucia", "martha", "juliana", "patricia"},
                                   {"Felipe", "ALEXANDER", "soffy", "Carmen", "Augusto"},
                                   {"Alfredo", "Luis", "Ramiro", "Karen", "ANDREA"}};
        matrix_names=f_replace_vowels(matrix_names);
        System.out.println("--------------------SHOW MATRIX-------------------");
        for(int i=0; i<matrix_names.length; i++){ //recorrer las filas
            System.out.print("\n ("+(i+1)+")=");
            for(int j=0; j<matrix_names[0].length; j++){
                System.out.print(" | "+matrix_names[i][j]+" ");
            }
        }
    }
    public static void f_menu(){
        //DESCRIPTION: this method show a menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║             SoftConvertWords             ║");
        System.out.println("║               Version 1.0                ║");
        System.out.println("║          Created by: Jhon Alexis         ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println("This program creates a 4x5 matrix with the people names");
    }
    public static String[][]f_replace_vowels(String[][] matrix_names){
        //DESCRIPTION: this method replace a vowels with = a = @, e = 3, i = 1, o = Ø (alt + 157), u = ⌂ (alt +127)
        for(int i=0; i<matrix_names.length; i++){ //recorre las filas
            for(int j=0; j<5; j++){ //recorre las columnas
                matrix_names[i][j]=matrix_names[i][j].toUpperCase().replace('A', '@').
                                                                    replace('E', '3').
                                                                    replace('I', '1').
                                                                    replace('O', 'Ø').
                                                                    replace('U', '⌂');
            }
        }
        return matrix_names;
    }
}
