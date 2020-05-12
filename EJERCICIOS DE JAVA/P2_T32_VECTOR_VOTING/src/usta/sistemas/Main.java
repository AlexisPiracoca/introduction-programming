package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Jhon Alexis Piracoca Arcos
        DATE: 06/05/2020
       DESCRIPTION: this software randomly generate the number of votes (values ​​between 1 and 5000) for N candidates
       */
	int total_candidates = f_menu_total_candidates();
	int[] vector_votes = f_fill_vector_votes(total_candidates);
	f_show_the_winner(vector_votes);
	f_show_all_votes(vector_votes);
    }
    public static int f_menu_total_candidates() {
        //DESCRIPTION: this method return a menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║              SoftDemocratic              ║");
        System.out.println("║               Version 1.0                ║");
        System.out.println("║          Created by: Jhon Alexis         ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println("Input the total candidates: ");
        Scanner keyboard = new Scanner(System.in);
        int total_candidates = keyboard.nextInt();
        while (total_candidates<2){
            System.err.println("ERROR: the value cannot be lass than two");
            System.out.println("Input the total candidates again: ");
            total_candidates = keyboard.nextInt();
        }
        return total_candidates;
    }
    public static int[] f_fill_vector_votes(int total_votes){
        //DESCRIPTION: this method return a vector with votes
        int[]vector_votes = new int[total_votes];
        for (int i=0; i<total_votes; i++) {
            vector_votes[i] = (int) Math.floor((Math.random()*5000)+1);
        }
        return vector_votes;
    }
    public static void f_show_the_winner(int[]vector_votes){
        //DESCRIPTION: this method show the winner candidate
        int winner_votes = 0, winner_number = 0;
        for (int i=0; i<vector_votes.length; i++) {
            if(i==0){
                    winner_votes = vector_votes[i];
            }else{
                if(vector_votes[i]>winner_votes){
                    winner_votes = vector_votes[i];
                    winner_number = i;
                }
            }
        }
        System.out.println("The winner candidate is: "+winner_number+" with total votes = "+winner_votes);
        f_show_the_second_candidate(vector_votes, winner_number);
    }
    public static void f_show_the_second_candidate(int[]vector_votes, int winner){
        //DESCRIPTION: this method show the second candidate
        int second_candidate = 0, second_votes = 0;
        for (int i=0; i<vector_votes.length; i++) {
            if(winner != i){
                if(second_votes<vector_votes[i]){
                    second_votes = vector_votes[i];
                    second_candidate = i;
                }
            }
        }
        System.out.println("The second candidate is: "+second_candidate+" with total votes = "+second_votes);
    }
    public static void f_show_all_votes(int[]vector_votes){
        //DESCRIPTION: this method show the total votes
        int total_votes = 0;
        for (int i=0; i<vector_votes.length; i++) {
            total_votes+=vector_votes[i];
            System.out.println("The votes of the candidate ("+(i+1)+" )is: "+vector_votes[i]);
        }
        System.out.println("The total votes is: "+total_votes);
    }
}
