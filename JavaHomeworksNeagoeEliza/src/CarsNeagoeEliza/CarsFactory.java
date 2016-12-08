/*
 * Class implements user car requests and acts like an inventory for delivered items;
 */
package CarsNeagoeEliza;



import java.util.Scanner;

/**
 *
 * @author Lizuca
 */
public class CarsFactory {
    
     public static void main(String[] args) {
         

    int i = 0 ;
    int z = 0;
    
      Car[] delieveredCars = new Car[100];
      delieveredCars[z] = null;
      
   while(true){
        
        i++;
        
    System.out.println("Please insert your model(or press X to exit the menu):");
    Scanner model = new Scanner( System.in );
    String newModel = model.nextLine();
    
    if ( "x".equalsIgnoreCase(newModel)){
       System.out.println("***End of program***");
   System.exit(0);
       }
    
          else {
    System.out.println("Please select the color(or press X to exit the menu):");   
    
    Scanner color = new Scanner(System.in);
    String desiredColor = color.nextLine();
    
    if("x".equalsIgnoreCase(desiredColor)){
       System.out.println("***End of program***");
   System.exit(0);
      }
    
         else {
    boolean validColor = false;
    
    
    for(Car.Color colorInput: Car.Color.values()){
        if (desiredColor.equalsIgnoreCase(colorInput.toString() ) ) {
        validColor = true;
        break;}
     }
         
    if(validColor){
 Car newCar = new Car( newModel, Car.Color.valueOf(desiredColor.toUpperCase()) );

  System.out.println("A new "+ newCar.getColor()+ " "+ newCar.getName() + " was deliverd");
  delieveredCars[z]= newCar;
  z++;
  System.out.println("We have delivered " + i + " car(s) as follows:" );
  System.out.println("No.|Car Name|Car Color");
  System.out.println("======================");
  
   int y = 0;
   for(z = 0;z <= i; z++ ){
       if(delieveredCars[z] != null){
       y++;
       System.out.println( y + ". | " + delieveredCars[z]);
             
        }
       
      }
    }
         else{
         System.out.println("Invalid color, renew your request!");
         
         }
        }
       }
      }
     }
    }
    
   
 

    
 
   
     

  

     
 
   

