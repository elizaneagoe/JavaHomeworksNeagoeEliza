/*
 * Exercise simulating a pocket calculator 
* for an operation between 2 numbers inputeed from keyboard. 
 */
package CalculatorNeagoeEliza;

import java.util.Scanner;

/**
 *
 * @author Lizuca
 */
public class CalculatorMainNeagoeEliza {
    public static void main(String[] args) {
        double result=0; 
        System.out.println(result); //The default displayed value is 0
        
        while(true){ 
/*We want the calculator to be able to perform more than a 
  single sequence of calculation */
            
        System.out.println("Input the first number:"); 
        Scanner numar1= new Scanner(System.in);
        double a; 
        /** number is declared before the if statement as it will be used 
         * outside the loop
         */
               
        if(numar1.hasNextDouble()) {  //checking if the value inputted is number
         a=numar1.nextDouble();
      
        }
        else {
            
         String acNumar1=numar1.nextLine(); 
          if (acNumar1.equals("AC")){
              System.out.println(0);
              continue;
             
             /**in case the user inputs AC, the calculator will display 0 and 
              * continue with prompting user for the 1st number;
              */
          }
          else{
         if(acNumar1.length()==1 && Character.isLetter(acNumar1.charAt(0))){
                  System.out.println("Calculator stopped");
                  break;
            //if the value inputted is a letter, calculator stops.      
              }
              else{
                  
                 System.out.println("Incorrect input");
                  continue;
              /**if it's not a number,AC, nor letter, the only possibility left
               * is an operator since we're talking about a pocket calculator.
               */  
              }
        }
       }
        System.out.println("Input the operator:");
        Scanner operator=new Scanner(System.in);
        String operation=operator.nextLine();
        if(operation.equals("AC")){
            System.out.println(0);
            continue;
            
        }
        else {
          if(operation.length()==1 && Character.isLetter(operation.charAt(0))){
              System.out.println("Calculator stopped");
              break;
          }
         
        }
            
        System.out.println("Input the second number:");
        Scanner numar2= new Scanner(System.in);
        double b;
         if(numar2.hasNextDouble()){
         b=numar2.nextDouble();
        }
         else{
             
             String acNumar2=numar2.nextLine();
             if (acNumar2.equals("AC")){
                 System.out.println(0);
                 continue;
                 
             } else {
           if(acNumar2.length()==1 && Character.isLetter(acNumar2.charAt(0))){
                     System.out.println("Calculator stopped");
                     break;
                 }
                 else {
                     System.out.println("Incorrect input");
                     continue;
                 }
             }
         }
        System.out.println("Press equal button:");
       Scanner equal= new Scanner(System.in);
       String varEqual=equal.nextLine();
       if(varEqual.equals("AC")){
           System.out.println(0);
           }
       else{
          if (varEqual.length()==1 && Character.isLetter(varEqual.charAt(0))){
                   System.out.println("Calculator stopped");
                   break;
                   
               }
               else{switch(operation) {
            case "+":
                result= a+b;
                System.out.println(result);
                break;
                                       
            case "-":
                result= a-b;
                System.out.println(result);
                break;
            case "*":
                result= a*b;
                System.out.println(result);
                 break;
                 
            case "/":
                result= a/b;
                System.out.println(result);
                
        }
               }
       
        
                
        
        }
    }
    }
}


        
        
        
        

