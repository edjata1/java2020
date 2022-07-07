/**
@Punch Recipe Calculation 
@author Empress Djata 
@version 1.0
*/
import java.util.Scanner;

public class PunchRecipe
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Number of people: ");
      
      int people = in.nextInt();
      
      final int OZ_PER_PERSON = 9;
      
      int amount = people * OZ_PER_PERSON;
      
      final int OZ_PER_CAN = 12;
      int cans = (amount -1) / OZ_PER_CAN;
      cans++;
      
      System.out.println("Cans: "+ cans);
      
      /*
  ----jGRASP exec: java -ea PunchRecipe
 Number of people: 12
 Cans: 9
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java -ea PunchRecipe
 Number of people: 5
 Cans: 4
 
  ----jGRASP: operation complete.      
      */
   }
}
