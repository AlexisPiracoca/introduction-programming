package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	 /*AUTHOR; Jhon Alexis Piracoca Arcos
      DATE: 23/04/2020
	  DESCRIPTION: Records the times of each lap of training and determines the best lap, the average and
	               the number of laps per training (the laps will be until the athlete gets tired / exhausted)
	 */
	 int total_laps = 0;
	 double best_lap = 0, average, time_lap, sumatory_time = 0;
	 f_menu();
	 while (f_continue()==true){
         total_laps+= 1;
         time_lap = f_value_lap(total_laps);
         sumatory_time+= time_lap;
         if (total_laps==1){
             best_lap = time_lap;
         }if (time_lap<best_lap){
             best_lap = time_lap;
         }
     }
	 average = sumatory_time/total_laps;
        System.out.println("The best lap is: "+best_lap+", total laps is: "+total_laps+", average time: "+average);
    }
    public static void f_menu() {
        //Description: This method shows the menu of this software
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║         SoftSportTime USTA 2020         ║");
        System.out.println("║          Version 1.0 2020-04-23         ║");
        System.out.println("║         Created by: Jhon Alexis         ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }
    public static boolean f_continue(){
        //DESCRIPTION: this method return one boolean value true or false
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you want to continue the training (True/False): ");
        boolean rta = keyboard.nextBoolean();
        return rta;
    }
    public static double f_value_lap(int lap){
        //DESCRIPTION: this method return the time of a lap
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the time ("+lap+") lap (seconds): ");
        double time = keyboard.nextDouble();
        while (time<1){
            System.err.println("ERROR: THE TIME MUST GREATER TO BE ONE ");
            System.out.println("Input again the time ("+lap+") lap (seconds): ");
            time = keyboard.nextDouble();
        }
       return time;
    }
}
