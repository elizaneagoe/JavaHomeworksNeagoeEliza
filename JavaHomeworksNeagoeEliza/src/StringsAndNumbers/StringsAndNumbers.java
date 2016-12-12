/*
 Implementing different String methods.
 */
package StringsAndNumbers;

import java.util.Scanner;

/**
 *
 * @author Lizuca
 */
public class StringsAndNumbers {
    public static void main(String[] args) {
     /*1.What is the initial capacity of the following string builder?
     StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");*/
     
    StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
    
    System.out.println("Question 1: " + sb.capacity());
    
     String hannah = "Did Hannah see bees? Hannah did.";
      
    //a	What is the value displayed by the expression hannah.length()?
    System.out.println("Question 2.a: " + hannah.length());
     
    //b What is the value returned by the method call hannah.charAt(12)?
     System.out.println("Question 2.b: " + hannah.charAt(12));
     
    //c	Write an expression that refers to the letter b in the string referred to by hannah.
    System.out.println("Question 2.c: " + hannah.charAt(15));
    
    /*3 How long is the string returned by the following expression? What is the string?
    "Was it a car or a cat I saw?".substring(9, 12)*/
    
    String a= "Was it a car or a cat I saw?";
    System.out.println("Question 3: " + "The new string is:" +a.substring(9,12)+ "; length: "+ a.substring(9,12).length() );
     
    
    /*4 Show two ways to concatenate the following two strings together to get the string "Hi, mom.":
     String hi = "Hi, ";

     String mom = "mom.";*/
    
    String hi = "Hi, ";

    String mom = "mom.";
   
    String mommy1 = hi.concat(mom);
    String mommy2 = hi + mom ;
    System.out.println("Question 4.1: " + mommy1);
    System.out.println("Question 4.2: " + mommy2);
    
    //5	Write a program that computes your initials from your full name and displays them.
    
    System.out.println("Enter your first name:");
    Scanner prenume = new Scanner(System.in);
    String firstname = prenume.nextLine();
    System.out.println("Enter your last name:");
    Scanner nume = new Scanner(System.in);
    String lastname = nume.nextLine();
    String initial1 = firstname.substring(0,1);
    String initial2 = lastname.substring(0,1);
    System.out.println("Question 5: " + "The initials are: " + initial1+"."+initial2+".");
  
    }
    
}
