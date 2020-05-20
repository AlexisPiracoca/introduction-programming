package usta.sistemas;
public class Main {
    public static int[][] matrix_votes = new int[10][2];
    public static int winner;
    public static int loser;
    public static void main(String[] args) {
	/*AUTHOR: Jhon Alexis Piracoca Arcos
      DATE: 19/05/2020
      DESCRIPTION: this software Performs a simulation to vote on a bill in a department that proposes to end nightclubs and bars:
    */
        f_menu();
        f_fill_matrix();
        f_show_winner();
        f_show_most_votes();
        f_show_less_votes();
        f_show_all_votes();
    }
    public static void f_menu() {
        //DESCRIPTION: this method show a menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║           SoftVotesClubsAndBars          ║");
        System.out.println("║               Version 1.0                ║");
        System.out.println("║          Created by: Jhon Alexis         ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }
    public static void f_fill_matrix() {
        //DESCRIPTION: this method fill the matrix
        for (int i = 0; i < matrix_votes.length; i++) {
            matrix_votes[i][0] = (int) Math.floor((Math.random() * 5000) + 1);//votes by NO
            matrix_votes[i][1] = (int) Math.floor((Math.random() * 5000) + 1);//votes by YES
        }
    }
    public static void f_show_winner() {
        //DESCRIPTION: this method show the winner
        int total_yes = 0, total_not = 0;
        for (int i = 0; i < matrix_votes.length; i++) {
            total_not += matrix_votes[i][0];
            total_yes += matrix_votes[i][1];
        }
        if (total_not == total_yes) {
            System.out.println("YES and NOT are same = " + total_not);
            winner = -1;
        } else if (total_not > total_yes) {
            System.out.println("The winner is the NOT: " + total_not + " and the loser is YES: " + total_yes + " with the %" + (total_not * 100 / (total_not + total_yes)));
            winner = 0;
        } else {
            System.out.println("The winner is the YES: " + total_yes + " and the loser is NOT: " + total_not + " with the %" + (total_yes * 100 / (total_yes + total_not)));
            winner = 1;
        }
    }
    public static void f_show_most_votes(){
        //description: this you must view the rows that have the most voted for the winner and those that least
        int more_votes_winner=matrix_votes[0][winner], more_votes_winner_row=0;
        int more_votes_loser=matrix_votes[0][loser], more_votes_loser_row=0;

        for (int i=1; i< matrix_votes.length;i++){  //to walk the matrix | row to row

            if (more_votes_winner<matrix_votes[i][winner]){
                more_votes_winner=matrix_votes[i][winner];
                more_votes_winner_row=i;
            }
            if (more_votes_loser<matrix_votes[i][loser]){
                more_votes_loser=matrix_votes[i][loser];
                more_votes_loser_row=i;
            }

        }
        System.out.println(" the municipality whit the more votes for winner was :"+(more_votes_winner_row+1)+" total votes: "+more_votes_winner);
        System.out.println(" the municipality whit the more votes for loser was :"+(more_votes_loser_row+1)+" total votes: "+more_votes_loser);
    }
    public static void f_show_less_votes(){
        //description: this you must view the rows that have the less voted for the winner and those that least
        int less_votes_winner=matrix_votes[0][winner], less_votes_winner_row=0;
        int less_votes_loser=matrix_votes[0][loser], less_votes_loser_row=0;

        for (int i=1; i< matrix_votes.length;i++){  //to walk the matrix | row to row

            if (less_votes_winner>matrix_votes[i][winner]){
                less_votes_winner=matrix_votes[i][winner];
                less_votes_winner_row=i;
            }
            if (less_votes_loser>matrix_votes[i][loser]){
                less_votes_loser=matrix_votes[i][loser];
                less_votes_loser_row=i;
            }

        }
        System.out.println(" the municipality whit the less votes for winner was :"+(less_votes_winner_row+1)+" total votes: "+less_votes_winner);
        System.out.println(" the municipality whit the less votes for loser was :"+(less_votes_loser_row+1)+" total votes: "+less_votes_loser);
    }
    public static void f_show_all_votes(){
        //description: this methods show the all votes
        System.out.println(" NO | YES");
        for (int i=0; i<matrix_votes.length;i++){
            System.out.println(matrix_votes[i][0]+" | "+matrix_votes[i][1]);
        }
    }
}