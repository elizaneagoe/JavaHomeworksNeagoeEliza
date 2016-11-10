/*
 Displaying a name inputed from keyboard
 */
package javahomeworksneagoeeliza;

import java.util.Scanner;

/**
 *
 * @author Lizuca
 */
public class JavaHomeworksNeagoeEliza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Introduceti numele si prenumele");
       Scanner scanner;
        scanner = new Scanner(System.in);
       String numeprenume=scanner.nextLine();
       System.out.println("Numele dumneavoastra este " + numeprenume);
       
             
       
    }
}