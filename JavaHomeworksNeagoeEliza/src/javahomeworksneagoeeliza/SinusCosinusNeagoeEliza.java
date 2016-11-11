/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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