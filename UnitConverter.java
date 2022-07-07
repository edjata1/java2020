import java.util.Scanner;

public class UnitConverter
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      boolean done = false;
      double factor1 = 1;
      double factor2 = 1;
      String unit1 = "";
      String unit2 = "";
      
      while (!done)
      {
         boolean getSecond = true;
         System.out.print("From unit (in, cm, m, again, quit): ");
         String command = in.next();
         if (command.equals("in"))
         {
            factor1 = 2.54; // Convert to cm 
            unit1 = command;
         }
         else if (command.equals("cm"))
         {
            . . .
         }
         else if (command.equals("m"))
         {
            . . .
         }
         else if (command.equals("again"))
         {
            getSecond = false;
         }
         else if (command.equals("quit"))
         {
            done = true;
            getSecond = false;
         }
         else
         {
            System.out.println("Sorry, unknown unit.");
            getSecond = false;
         }

         if (getSecond)
         {
         System.out.print("To unit: ");
            unit2 = in.next();
            if (unit2.equals("in"))
            {
               factor2 = 2.54; // Convert from cm
            }
            else . . .
         }
         
         if (. . .)
         {
            double value = in.nextDouble();
            double result = value * factor1 / factor2; 
            System.out.println(value + " " + unit1 + " = " + result + " " + unit2);
         }
      }
   }
}