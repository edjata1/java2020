//Complete this AccountRunner.java file:

/**
@Tester for BankAccount and its subclasses
@author Empress Djata 
@version 1.0
*/

public class AccountRunner
{
   public static void main(String[] args)
   {
      BankAccount account = new SavingsAccount(1000, "abc123");
      account.endOfMonth();
      
        
      System.out.printf("after one month: %.2f%n" , account.getBalance());
      System.out.println("Expected: 1000.75");
      
      account = new SavingsAccount(1000, "qrs123");
      account.withdraw(100);
        
      //do a 12 end of month processings
      for(int i = 0; i < 12; i++)
      {
         account.endOfMonth();
      }
      
      account.deposit(100);
        
      System.out.printf("%.2f%n" , account.getBalance());
      System.out.println("Expected: 1008.13");
     
   
   }
}