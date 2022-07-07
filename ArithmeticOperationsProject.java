/**
@Arithmetic Operations 
@author Empress Djata 
@version 1.0
*/
import java.util.Scanner;

public class ArithmeticOperationsProject
{
   public static void main(String[] args)
   {
      //Subtraction formula
      double subtractX = 0, subtractY = 0;
      int subtractA = 0, subtractB = 0;
      
      //if(subtractX % 1 != 0 && subtractY % 1 != 0){}else{}
         double subtractionDoubleTotal = subtractX - subtractY;
         int subtractionIntTotal = subtractA - subtractB;
      
      
      //Addition formula
      double addX = 0, addY = 0;
      double additionDoubleTotal = addX + addY;
      
      //Multiplication formula
      double multiplyX = 0, multiplyY = 0;
      double multiplicationDoubleTotal = multiplyX * multiplyY;
      
      //expression x +2y
      double expressionX = 0, expressionY = 0;
      int a = 2;
      double expressionDoubleTotal = expressionX + a * expressionY;
      
      //expression2 2 * (x + y)
      double expressionX2 = 0, expressionY2 = 0;
      int b = 2;
      double expressionX2DoubleTotal2 = b * (expressionX + expressionY);
      
      //expression3 (x + y)/2
      double expressionX3 = 0, expressionY3 = 0;
      int c = 2;
      double expressionX3DoubleTotalAdd3 = (expressionX3 * expressionY3)/2;
      
      //expression4 (x * y)/2
      double expressionX4 = 0, expressionY4 = 0;
      int d = 2;
      double expressionX3DoubleTotalMult3 = (expressionX4 * expressionY4)/2;  
      
      double total = 0.0;
      int items = 0;
      double price = 4.95;
      total = total + price;
      items++;
      System.out.println("1st total: $" + total + ", number of " + items);
      
      price = 1.95;
      total = total + price;
      items++;
      System.out.println("2nd total: $" + total +  ", number of " + items);
      
      price = -4.95;      
      total = total + price;
      items--;    
      System.out.println("3rd total: $" + total +  ", number of " + items);

   }
}