/**
@Ballon
@author Empress Djata 
@version 1.0
*/
import java.util.Scanner;
import static java.lang.Math.PI;

public class Balloon
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Diameter: ");
      double diameter = in.nextDouble();

      double volume1 = (Math.PI * diameter * diameter * diameter)/6;
      
      diameter++;
      
      double volume2 = (Math.PI * diameter * diameter * diameter)/6;
      
      double growth = volume2 - volume1;

      System.out.printf("Increase: %.0f", growth);
      System.out.println();
      
      diameter++;
      
      double volume3 = (Math.PI * diameter * diameter * diameter)/6;

      growth = volume3 - volume2;

      System.out.printf("Increase: %.0f", growth);
      System.out.println();
      
      /*
      output:
           ----jGRASP exec: java -ea Balloon
 Diameter: 10
 Increase: 173
 Increase: 208
 
  ----jGRASP: operation complete.
  */
   }
}