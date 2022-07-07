/**
@author Empress Djata 
@version 1.0
*/
import java.util.Scanner;

/**
   This program simulates a stamp machine that receives dollar bills and 
   dispenses first class and penny stamps.
*/
public class MyStampMachine
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      final int FIRST_CLASS_STAMP_PRICE = 47; // Price in pennies
      final int PENNY_STAMP_PRICE = 3; // Price in pennies


      System.out.print("Enter number of dollars: ");
      int dollars = in.nextInt();

      System.out.println("Select stamp option number: \n1:) First Class \n2:) Penny");
      int stampOptionNumber = in.nextInt();
      
      System.out.print("Number of stamps: ");
      int numberOfStamps = in.nextInt();
      
      
      if (stampOptionNumber == 1){
         
         System.out.println("Option 1 selected. " + numberOfStamps + " stamps");
               int costOfStampOrdder = FIRST_CLASS_STAMP_PRICE * numberOfStamps;
               int yourChange = dollars - costOfStampOrdder;
               
               int firstClassStamps = 100 * dollars / FIRST_CLASS_STAMP_PRICE;
               //int change = 100 * dollars - firstClassStamps * costOfStampOrdder
               yourChange = firstClassStamps - (dollars - costOfStampOrdder) ;
               double yCh = (2 * 1.00) - (.47 *4);
         
         System.out.printf("yCh: %.2f$", yCh);
               
         System.out.println("cost Of " + numberOfStamps + " Stamps: $" + costOfStampOrdder);

         System.out.println("firstClassStamps: " + firstClassStamps);

         System.out.println("your Change: " +  yourChange);

         System.out.println("___________________________");



      
      }else if (stampOptionNumber ==2){
      
         System.out.println("Option 2 selected." + numberOfStamps  + " stamps");

      } else{
      
         System.out.println("Invalid option selection.");

      }
      
      // Compute and print the number of stamps to dispense
      int stampType = 0;
      
      int firstClassStamps = 100 * dollars / FIRST_CLASS_STAMP_PRICE;
      int pennyStamps = 100 * dollars / PENNY_STAMP_PRICE;
      
      int change = 100 * dollars - firstClassStamps * FIRST_CLASS_STAMP_PRICE;
      int change2 = 100 * dollars - pennyStamps * PENNY_STAMP_PRICE;

      
      System.out.printf("First class stamps: %6d%n", firstClassStamps);
      System.out.printf("Penny stamps:       %6d%n", change);
   }
}