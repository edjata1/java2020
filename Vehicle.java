class Vehicle 
{
   
    public static void main(String[] args) 
    {
        
        Car myHybrid = new Car(50); //50 miles per gallon

        myHybrid.addGas(20); //Tank up 20 gallons

        myHybrid.drive(100); //Drive 100 miles

        System.out.println("The fuel remaining is " + myHybrid.getGasLevel() + " gallons");
    }
}
/* Output upon running application:
  ----jGRASP exec: java -ea HybridCar
 Successfully added 20 gallons of gas
 Successfully driven distance 100 miles
 The fuel remaining is 68 gallons
 
  ----jGRASP: operation complete.
*/