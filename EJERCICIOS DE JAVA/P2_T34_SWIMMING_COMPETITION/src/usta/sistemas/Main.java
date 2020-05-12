package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Jhon Alexis Piracoca Arcos
        DATE: 12/05/2020
       DESCRIPTION: this software Allow to simulate the data of a swimming competition where the four
                    times are stored for each competitor and also determine based on all the times of
                    the competitors who is the winner.
       */
	int total_competitors = f_menu_total_competitions();
	double[][]matrix_competition = f_fill_matrix_competition(total_competitors);
	String texto = " ";
        System.out.println("------------------The times of competition-------------------");
        System.out.println("P | T1  | T2  | T3  | T4  | T5  | T6  | T7  | T8  | T9  | T10  ");
	for(int i=0; i<total_competitors; i++){
	    texto += "\n" +(i+1);
	    for(int j=0; j<10; j++){
            texto +=" | "+matrix_competition[i][j]+"";
        }
    }
        System.out.println(texto);
    }
    public static int f_menu_total_competitions() {
        //DESCRIPTION: this method return a menu
        Scanner keyboard = new Scanner(System.in);
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║          SoftSwimmingCompetition         ║");
        System.out.println("║               Version 1.0                ║");
        System.out.println("║          Created by: Jhon Alexis         ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println("Input who many competitors do you want: ");
        int total_competitors = keyboard.nextInt();
        while (total_competitors<=0){
            System.err.println("ERROR: this value must greater than zero");
            System.out.println("Input again who many competitors do you want: ");
            total_competitors = keyboard.nextInt();
        }
        return total_competitors;
    }
    public static double [][]f_fill_matrix_competition(int total_competitors){
        //DESCRIPTION: this method returns a fill matrix of time the competition
        double[][]matrix_competition = new double[total_competitors][10];
        for (int i=0; i<total_competitors; i++) {
            for (int j=0; j<10; j++){
                matrix_competition[i][j] = Math.floor(Math.random()*(10-6)+6);
        }
        }
        return matrix_competition;
    }
}
