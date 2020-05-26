package usta.sistemas;

public class Main {
    public static int[][]matrix_votes = new int[123][8];
    public static int[] total_votes = new int[8];
    public static String[] vector_parties = {"liberal", "Conservador", "Alianza verde", "La U", "Cambio Radical", "Centro Democrático", "MIRA", "Polo"};
    public static int winner_votes = 0;
    public static int winner_column = 0;
    public static void main(String[] args) {
     /*AUTHOR: Jhon Alexis Piracoca Arcos
      DATE: 21/05/2020
      DESCRIPTION: this software performs a simulation of a voting process for the Boyacá governor
                  where there are seven (8) candidates from the main political parties in Colombia
    */
        f_menu();
        f_fill_matrix();
        f_total_votes();

        for(int i=0; i<total_votes.length; i++){
            System.out.println("Political parties: "+vector_parties[i]+", total votes: "+total_votes[i]);
        }
        f_show_winner_and_second();
    }
    public static void f_menu() {
        //DESCRIPTION: this method show a menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║              SoftDemocracy               ║");
        System.out.println("║               Version 1.0                ║");
        System.out.println("║          Created by: Jhon Alexis         ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }
    public static void f_fill_matrix(){
        //DESCRIPTION: this method fills the matrix with votes.
        for(int i=0; i<matrix_votes.length;i++){  //to walk rows matrix from 0 to 122
            for (int k=0; k< matrix_votes[0].length;k++) { //to walk columns matrix from 0 to 7
                matrix_votes[i][k]= (int) Math.floor((Math.random()*1000)+1);  //random numbers between 1 to 1000
            }
        }
    }
    public static void f_total_votes(){
        //DESCRIPTION: this method calculates the total votes for every parties
        for (int k=0; k< matrix_votes[0].length;k++) { //to walk columns matrix from 0 to 7
            for(int i=0; i<matrix_votes.length;i++) {  //to walk rows matrix from 0 to 122
                total_votes[k]+=matrix_votes[i][k];    //sum every row (i) by any column
            }
        }
    }
    public static void f_show_winner_and_second(){
        //DESCRIPTION: this  method walks the vector total_votes
        winner_votes=total_votes[0];
        int loser_votes=total_votes[0], loser_column=0;

        for(int k=1; k<total_votes.length;k++){
            if (winner_votes<total_votes[k]){
                winner_votes=total_votes[k];
                winner_column=k;
            }
        }
        //-------Second place--------
        for(int k=0; k<total_votes.length;k++){
            if(winner_column!=k){  //without winner column
                if (loser_votes<total_votes[k]){
                    loser_votes=total_votes[k];
                    loser_column=k;
                }
            }
        }
        System.out.println("The winner is: "+vector_parties[winner_column]+" total votes: "+total_votes[winner_column]);
        System.out.println("The second place is: "+vector_parties[loser_column]+" total votes: "+total_votes[loser_column]);
    }
}
