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
public class NameInitialsNeagoeEliza {
public static void main(String[] args){
   System.out.println("Enter your first name:");
   Scanner a= new Scanner(System.in);
  String firstname= a.nextLine();
  System.out.println("Enter your last name:");
  Scanner b= new Scanner(System.in);
  String lastname=b.nextLine();
  String initial1= firstname.substring(0,1);
  String initial2=lastname.substring(0,1);
  System.out.println(initial1+"."+initial2+".");
  
  
  
  
   
    
}
}

