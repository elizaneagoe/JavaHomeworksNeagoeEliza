/*
 Operations with different type of variables
 */
package javahomeworksneagoeeliza;

/**
 *
 * @author Lizuca
 */
public class VariablesOperationsNeagoeEliza {
    
     public static void main(String[] args) {
         
     //Determination of the difference between two numbers
    byte a=15;
    byte b=24;
    if(a>=b){
        System.out.println("Diferenta dintre numere este " + (a-b));}
    
    else {
        System.out.println("Diferenta dintre numere este " + (b-a));}
    
    // Verifying if a number is prime
    short c=17;
    boolean prim= true;
    float half=c/2;
   
    for( int div=2;div<=half;  div++) {
    if (c % div == 0){ 
      prim= false;
         break;   
    }
    
     }
    if(!prim) {
     System.out.println("Numarul nu este prim"); }
        else {
       System.out.println("Numarul este prim") ; 
     }
           
        
    
}
           
    
}
