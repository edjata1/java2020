   //This is the Class for Counter
   public class Counter
   {
      private int value;
      
      /**
         Gets the current value of this counter.
         @return the current value
      */
      
      public int getValue()
      {
         return value;
      }
      
      /**
         Advances the value of the counter by 1.
      */
      public void count()
      {
         value++;
      }
      
      /**
         Reset the value of thid counter to 0.
      */
      
      public void reset()
      {
         value = 0;
      }
      
   }