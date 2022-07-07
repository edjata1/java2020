    /**
   * multiplying big integers and decimals.
   * @BigNumbersProject class implements calculation of BigInteger and BigDecimal
   * @author Empress Djata 
   * @version 1.0
   */

import java.math.BigInteger;
import java.math.BigDecimal;

public class BigNumbersProject
{
   public static void main(String[] args)
   {
      //BigInteger multiply used to multiply big numbers 
      BigInteger oneHundred = new BigInteger("100");
      BigInteger fiftyMillion = new BigInteger("50000000000");
      System.out.println("$" + oneHundred.multiply(fiftyMillion));
      
      //BigDecimal multiply used to multiply big decimal 
      BigDecimal price = new BigDecimal("4.35");
      BigDecimal quantity = new BigDecimal("100");
      BigDecimal total = price.multiply(quantity);
      System.out.println("$" + total);
      
      /*
      output: 
  ----jGRASP exec: java -ea BigNumbersProject
 $5000000000000
 $435.00
 
  ----jGRASP: operation complete.
      */
   }

}