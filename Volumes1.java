    /**
   * This program computes the volume (in liters) of a six-pack of soda
   * cans and the total volume of a six-pack and a two-liter bottle.
   * @Volumes1 class implements calculation of can 0.335 ounce to liters
   * @author Empress Djata 
   * @version 1.0
   */
public class Volumes1
{   
   public static void main(String[] agrs)
   {
   int cansPerPack = 6;
   // There are approximately 0.335 liters in a 12-ounce can because one ounce 
   final double CAN_VOLUME = 0.355;
   double totalCansVolume = cansPerPack * CAN_VOLUME;
   
   //int bottles = 4;   
   //declaring Constants can't change them
   final int BOTTLE_VOLUME = 2;
   double totalBottlesVolume = totalCansVolume + BOTTLE_VOLUME;  
   
   //calculate production cost per once
   final double PRODUCTION_COST = 0.025;
   double productionCost = CAN_VOLUME * PRODUCTION_COST;
   System.out.println("Production cost per once: $" + productionCost);
   double canProductionCost = productionCost * totalCansVolume;
   double bottleProductionCost = productionCost * totalBottlesVolume;
   
   //output calculation of 12 ounce cans
   System.out.print("A six-pack of 12-ounce cans contains: ");
   System.out.print(totalCansVolume);
   System.out.println(" liters.");
   System.out.println("Can production cost: $" + canProductionCost);
   
   //output convertion of 12 ounce cans to two-liter
   System.out.print("A six-pack and a two-liter bottle contain: ");
   System.out.print(totalBottlesVolume);
   System.out.println(" liters.");
   System.out.println("Bottle production cost: $" + bottleProductionCost);
   
   /*
   output:    
  ----jGRASP exec: java -ea Volumes1
 Production cost per once: $0.008875
 A six-pack of 12-ounce cans contains: 2.13 liters.
 Can production cost: $0.018903749999999997
 A six-pack and a two-liter bottle contain: 4.13 liters.
 Bottle production cost: $0.03665375
 
  ----jGRASP: operation complete.
*/
   }

}