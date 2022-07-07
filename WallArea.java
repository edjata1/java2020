/**
@Wall Area
@author Empress Djata 
@version 1.0
*/

import java.util.Scanner;


public class WallArea
{
   public static void main(String[] args)
   {
   
   final double windowHeight = 3;
   final double windowWidth = 2;
   
   //Declare a scanner
   Scanner in = new Scanner(System.in);
   
   //prompt for and read the width and height
   System.out.print("Wall width: ");
   double wallWidth = in.nextDouble();
   
   System.out.print("Wall Height: ");
   double wallHeight = in.nextDouble();
   
   // add the number of windows
   System.out.print("Number of windows: ");
   int numberOfWindows = in.nextInt();
   
   double areOfWindow = (windowHeight * windowWidth) * (double)numberOfWindows;
   
   // compute the area of the wall without the windows
   double area = ((wallWidth * wallHeight) - areOfWindow);
   
   System.out.println("Area: " + area); 
   }
   
}   
   