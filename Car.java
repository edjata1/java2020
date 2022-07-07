/*
* @Car class implements the car functionalities like drive
* @Adds gas and gets gas
* @author Empress Djata 
* @version 1.0
*/

class Car 
{
    private int gas = 0; // Gas varaible set to 0 initial value of gas in tank
   
    
    //this gets the MPG from the user and returns the value
    public void gethybridCar_MPG(int mpg)
    {
        hybridCar_MPG = hybridCar_MPG + mpg;
        
        return hybridCar_MPG;
    }
    
    public int sethybridCar_MPG()
    {
    
    }
    
    public void HybridCar_MPG(int hybridCar_MPG)
    {
        this.hybridCar_MPG = hybridCar_MPG;   
        return this.hybridCar_MPG;
    }
    
    private final int MILES_PER_GALLON = hybridCar_MPG; // Constant that indicates 50 miles per a gallon for Hybrid Cars

    /*
    * @Car: Class constructor with one parameter gas
    */
    public Car(int gas) 
    {
        this.gas = gas;
    }

    /**
    * @drive: method that takes one parameter distance
    * @gasRequired: is distance divided by MILES_PER_GALLON
    * @gas is gas less the gasRequired
    */
    public void drive(int distance) 
    {
        // Calculating gas required for given distance to be travelled
        int gasRequired = distance / MILES_PER_GALLON;
        
        // Check if enough gas is there in tank to drive
        if (gas >= gasRequired) {
            
            // Subtract the gasRequired from gas
            gas = gas - gasRequired;
            
            // Print successful drive message
            System.out.println("Successfully driven distance " + distance + " miles");
        
        } 
        else 
        {
            // Print unsuccessful drive message
            System.out.println("There is not enough gas to drive " + distance + " miles");
        }
    }

    /*
    * @addGas: method to add gas to the tank
    */
    public void addGas(int gas) 
    {
        // Adding gas
        this.gas = this.gas + gas;
        
        // Print success message
        System.out.println("Successfully added " + gas + " gallons of gas");
    }

    /**
    * @return: This method gives the gas in the tank
    */
    public int getGasLevel() 
    {
        return this.gas;
    }
    

}

/**
 * @HybridCar class to test the Car class features
 */
 
/*Start of HybridCar main
class HybridCar 
{
   
    public static void main(String[] args) 
    {
        
        Car myHybrid = new Car(50); //50 miles per gallon

        myHybrid.addGas(20); //Tank up 20 gallons

        myHybrid.drive(100); //Drive 100 miles

        System.out.println("The fuel remaining is " + myHybrid.getGasLevel() + " gallons");
    }
}
End of HybridCar main*/
/* Output upon running application:
  ----jGRASP exec: java -ea HybridCar
 Successfully added 20 gallons of gas
 Successfully driven distance 100 miles
 The fuel remaining is 68 gallons
 
  ----jGRASP: operation complete.
*/