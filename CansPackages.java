/**
@author Empress Djata 
@version 1.0
*/
class CansPackages
{

   public static void main(String[] agrs){
   
   //variable declaration is "Storage location - like parking space iditifier "JS67" -> "cansPerPack" and holds "car" -> "6", "
   //data of specific type int initialized value of variable "cansPerPack" = "6"
   int cansPerPack = 6;
   double pricePerCan = 1.25;
   System.out.println(cansPerPack);
   int createPerCrate = 4 * cansPerPack;
   double totalCost = createPerCrate * pricePerCan;
   
   //make this a print method
   System.out.println("There are Creates: " + createPerCrate + ", cans Per Pack: " + cansPerPack + ", total cost: $" + totalCost);
   
   //assignment statement different from declaring a variable, using the assingment operator =
   cansPerPack = 8;
   createPerCrate = 4 * cansPerPack;
   totalCost = createPerCrate * pricePerCan;
   System.out.println("There are Creates: " + createPerCrate + ", cans Per Pack: " + cansPerPack + ", total cost: $" + totalCost);
   
   //takes the value in cansPerPack and adds 4 to it
   cansPerPack = cansPerPack + 4;
   createPerCrate = 4 * cansPerPack;
   totalCost = createPerCrate * pricePerCan;
   System.out.println("There are Creates: " + createPerCrate + ", cans Per Pack: " + cansPerPack + ", total cost: $" + totalCost);
   
   //correct way to declare a variable and add 2 to it
   int a = 3;
    a = a + 2;
   System.out.println(a);
   

   
   
   }
   
   class Books{
   
   }
}