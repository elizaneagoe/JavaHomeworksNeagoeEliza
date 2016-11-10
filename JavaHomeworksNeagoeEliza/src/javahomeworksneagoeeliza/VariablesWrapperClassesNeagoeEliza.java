/*
 Wrapper Classes
 */
package javahomeworksneagoeeliza;

/**
 *
 * @author Lizuca
 */
public class VariablesWrapperClassesNeagoeEliza {
    
    public static void main(String[] args) {
         
     //Determination of the difference between two numbers
    byte a=15;
    Byte aa= new Byte(a);
    byte b=24;
    Byte bb= new Byte(b);
    if(aa>=bb){
        System.out.println("Diferenta dintre numere este " + (a-b));}
    
    else {
        System.out.println("Diferenta dintre numere este " + (b-a));}
    
    // Verifying if a number is prime
    short c=17;
   Short cc= new Short(c);
    Boolean prim= new Boolean(true);
    Float half= new Float(c/2);
   
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
