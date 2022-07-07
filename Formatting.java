/**
@author Empress Djata 
@version 1.0
*/

public class Formatting
{
   public static void main(String[] args)
   {
      double pricePerLiter = 1.236515465146;
      
      //This will line the two amounts into columes using the format specifier
      //f for floating-point numbers, s for string and d for integer
      
      //displays price with two digits are decimal
      System.out.printf("%.2f", pricePerLiter); 
     
      //The price is printed using ten characters: 6 spaces ------ followed by 4 characters     
      System.out.printf("%10.2f", pricePerLiter); 
      
      int price = 25;
      System.out.printf("\n%d", price); 
      
      System.out.printf("\nQuantity:%5d", price); 
      
      int quantity = 26;
      double total = 15;
      
      System.out.printf("\nQuantity: %7d%nTotal: %10.2f%n", quantity, total);
    
   }
}