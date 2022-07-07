/**
@PiggyBank
@author Empress Djata 
@version 1.0
*/
public class PiggyBank{

   public static void main(String[] args){
   
   int pennies = 1729;
   int dollars = pennies / 100; // set dollars to 17
   int cents = pennies % 100; // sets cents to 29
   System.out.println(pennies + " is dollars " + dollars + " and " + cents + " cents.");
   
   // integer division and remainder table 
   
   int n = pennies; 
   System.out.println("Little piggy has " + n + " pennies.");
   
   System.out.println("n % 10 now piggy last digit is " + n % 10);
   System.out.println("without piggy's last digit it's " + n / 10);
   System.out.println("n % 100 the last two digits of piggy is " + n % 100);
   System.out.println("piggy has $" + n / 100.0);
   System.out.println("-n % 10 negative last digit " + -n % 10);
   System.out.println("n % 2; 0 if it's an even or 1 if odd amount: " + n % 2);
   
   
   int pennies2 = 27;
   int dollars2 = pennies2 / 100;
   int cents2 = pennies2 % 4;
      System.out.print("Dollars: ");
      System.out.println(dollars2);
      System.out.print("Cents: ");
      System.out.println(cents2);
   
   /*
        ----jGRASP exec: java -ea PiggyBank
 1729 is dollars 17 and 29 cents.
 Little piggy has 1729 pennies.
 n % 10 now piggy last digit is 9
 without piggy's last digit it's 172
 n % 100 the last two digits of piggy is 29
 piggy has $17.29
 -n % 10 negative last digit -9
 n % 2; 0 if it's an even or 1 if odd amount: 1
 Dollars: 0
 Cents: 3
 
  ----jGRASP: operation complete.
   */
   }
}