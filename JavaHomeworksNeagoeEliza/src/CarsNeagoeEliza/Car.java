/*
 * Implementation of class Car
 */
package CarsNeagoeEliza;



/**
 *Class implements attributes and behavior of a car 
 * @author Lizuca
 */

public class Car {
    // create enumeration as a new type in Java
    
 
    public enum Color { WHITE, RED, GREEN, BLUE, MAGENTA, YELLOW } ; 
    //create attributes of car
    
    private String name;
    private Color color;
   
    
    @Override
    public String toString(){
     
    return name+ " " + color + " ";
    }
//first contrustor-the default constructor
    public Car(){
        name = "Default car name";
        color = Color.GREEN; 
    }
    
    // second constructor- with 2 parameteres
    
    public Car(String newName, Color newColor){
       
        color = newColor;
        name = newName;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    


 
       
  
  }  

