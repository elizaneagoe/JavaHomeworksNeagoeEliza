/*
 * Displaying a message based on the weekday inputted by user;
 */
package WeekDaysNeagoeEliza;

/**
 *
 * @author Lizuca
 */
import java.util.Scanner;

/**
 *
 * @author Lizuca
 */
public class WeekDaysNeagoeEliza {

public enum Weekdays {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday} ;  
 
public static void main(String[] args) {
   
       
       System.out.println("Input the weekday: ");
       Scanner day = new Scanner(System.in);
       String newDay = day.nextLine();
      boolean validDay = false;
       
      // verifying if user input is a valid weekday 
       for ( Weekdays day1:Weekdays.values() ) {
           
           if ( newDay.equalsIgnoreCase(day1.toString()))
           {
               newDay = day1.toString();
               validDay = true;
               break; }
       }
       
       
       if (validDay){
              
       switch (newDay){
           
           case "Monday":
               System.out.println("Mondays are bad");
               break;
               
           case "Friday":
               System.out.println("Fridays are better");
               break;
               
           case "Saturday":
           case "Sunday":
               System.out.println( "Weekends are best" );
               break;
               
           
           default:
              System.out.println( "Weekdays are so-so" );
                break;
              
       }
       
       }
       else {
           System.out.println( "Incorrect input" );
           
     
       }
       
       }
  
    
    
}