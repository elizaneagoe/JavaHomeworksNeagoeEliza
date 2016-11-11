/*
 Verifying the formula sin^x+cos^x=1 for a number inputed from keyboard
 */
package javahomeworksneagoeeliza;

import java.util.Scanner;


/**
 *
 * @author Lizuca
 */
public class SinusCosinusNeagoeEliza {
   public static void main(String[] args) {
       System.out.println("Input number");
       Scanner number= new Scanner(System.in); 
 double angle=number.nextDouble();
 double sinx=Math.pow(Math.sin(angle),2);
 double cosx=Math.pow(Math.cos(angle),2);
 double result= sinx+cosx;
 System.out.println("sin^x + cos^2x="+result);
 
         
    
}
}