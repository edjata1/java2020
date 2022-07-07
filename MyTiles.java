/**
@author Empress Djata 
@version 1.0
*/

import java.util.Scanner;

public class MyTiles
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Total width inches: ");
      int totalWidth = in.nextInt();
      
      System.out.print("Tile width inches: ");
      int tileWidth = in.nextInt();
      
      int numberOfPairs = (totalWidth - tileWidth) / (2 * tileWidth);      
      int numberOfTiles = 1 + 2 * numberOfPairs;
      double gap = (totalWidth - numberOfTiles * tileWidth) / 2.0;
      
      System.out.print("*****");
      
      for(int i = 0; i < numberOfPairs; i++){
         System.out.print("_____");
         System.out.print("*****");

      }
      System.out.println();

      System.out.println("Number of B/W tiles: " + numberOfTiles);
      System.out.println("Start and end with ***** for B");
      System.out.println("Gap at each end: " + gap);
      
      /*
      output:

  ----jGRASP exec: java -ea MyTiles
 Total width inches: 100
 Tile width inches: 5
 *****_____*****_____*****_____*****_____*****_____*****_____*****_____*****_____*****_____*****
 Number of B/W tiles: 19
 Start and end with ***** for B
 Gap at each end: 2.5
 
  ----jGRASP: operation complete.
 
      */
   }
}