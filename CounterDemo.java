public class CounterDemo
{

   public static void main(String[] args){
   
   //System.out.println("Hello World");
   
   Counter tally = new Counter();
     
   tally.count();
   tally.count();
   
   int result = tally.getValue();
   
   System.out.println("Value: " + result);
   
   tally.count();
   tally.count();
   
   result = tally.getValue();
   
   System.out.println("Value: " + result);

   }
}