public class NumberWrapperClass{
	
	//wrapper classes (Integer, Long, Byte, Double, Float, Short)
	
   public static void main(String args[]) {
	   
	//boxing and unboxing int
	//
	System.out.println("boxing and unboxing int");
	Integer x = 5; // boxes int to an Integer object
	
	x =  x + 10;   // unboxes the Integer to a int
	
	System.out.println(x); 
	System.out.println("------------------");
	//END boxing and unboxing int
	
	//-----------------
	//xxxValue() Method
	//Converts the value of this Number object to the xxx data type and returns it.
	System.out.println("xxxValue() Method - Converts the value of this Number object to the xxx data type and returns it.");
      Integer x1 = 5;
      
      // Returns byte primitive data type
      System.out.println( x1.byteValue() );

      // Returns double primitive data type
      System.out.println(x1.doubleValue());

      // Returns long primitive data type
      System.out.println( x1.longValue() );	
	  System.out.println("------------------");
	//END xxxValue() Method
	
	//--------------
	//compareTo() Method
	//Compares this Number object to the argument.
	System.out.println("compareTo() Method - Compares this Number object to the argument.");
      Integer x2 = 5;
      
      System.out.println(x2.compareTo(3));
      System.out.println(x2.compareTo(5));
      System.out.println(x2.compareTo(8));	
	  System.out.println("----------------------");
	//END compareTo() Method
	
	
	//-----------
	//equals() Method
	//Determines whether this number object is equal to the argument.
	System.out.println("equals() Method - Determines whether this number object is equal to the argument.");
      Integer x3 = 5;
      Integer y3 = 10;
      Integer z3 =5;
      Short a3 = 5;

      System.out.println(x3.equals(y3));  
      System.out.println(x3.equals(z3)); 
      System.out.println(x3.equals(a3));	
	  System.out.println("-----------------------");
	//END equals() Method
	
	//-----------
	//valueOf() Method
	//
	System.out.println("valueOf() Method - Returns an Integer object holding the value of the specified primitive.");
      Integer x4 =Integer.valueOf(9);
      Double c4 = Double.valueOf(5);
      Float a4 = Float.valueOf("80");               
      Integer b4 = Integer.valueOf("444",16);

      System.out.println(x4); 
      System.out.println(c4);
      System.out.println(a4);
      System.out.println(b4);	
	  System.out.println("-----------------------------");
	//END valueOf() Method
	
	
	//-----------
	//toString() Method
	//Returns a String object representing the value of a specified int or Integer.
	System.out.println("toString() Method - Returns a String object representing the value of a specified int or Integer.");
      Integer x5 = 5;

      System.out.println(x5.toString());  
      System.out.println(Integer.toString(12)); 
System.out.println("--------------------------");	  
	//END toString() Method

	
	//-----------
	//parseInt() Method
	//This method is used to get the primitive data type of a certain String.
	System.out.println("parseInt() Method - This method is used to get the primitive data type of a certain String.");
      int x6 =Integer.parseInt("9");
      double c6 = Double.parseDouble("5");
      int b6 = Integer.parseInt("444",16);

      System.out.println(x6);
      System.out.println(c6);
      System.out.println(b6);	
	  System.out.println("-----------------------------");
	//END parseInt() Method

	
	//-----------
	//abs() Method
	//Returns the absolute value of the argument.
	System.out.println("abs() Method - Returns the absolute value of the argument.");
      Integer a7 = -8;
      double d7 = -100;
      float f7 = -90;

      System.out.println(Math.abs(a7));
      System.out.println(Math.abs(d7));     
      System.out.println(Math.abs(f7));	
	  System.out.println("------------------------");
	//END abs() Method

	
	//-----------
	//ceil() Method
	//Returns the smallest integer that is greater than or equal to the argument. Returned as a double.
	System.out.println("ceil() Method - Returns the smallest integer that is greater than or equal to the argument. Returned as a double.");
      double d8 = -100.675;
      float f8 = -90;    

      System.out.println(Math.ceil(d8));
      System.out.println(Math.ceil(f8)); 

      System.out.println(Math.floor(d8));
      System.out.println(Math.floor(f8)); 
System.out.println("-----------------------");	  
	//END ceil() Method

	
	//-----------
	//floor() Method
	//The method floor gives the largest integer that is less than or equal to the argument.
	System.out.println("floor() Method - The method floor gives the largest integer that is less than or equal to the argument.");
      double d9 = -100.675;
      float f9 = -90;

      System.out.println(Math.floor(d9));
      System.out.println(Math.floor(f9)); 

      System.out.println(Math.ceil(d9));
      System.out.println(Math.ceil(f9));	
	  System.out.println("");
	//END floor() Method

	
	//-----------
	//rint() Method
	//The method rint returns the integer that is closest in value to the argument.
		System.out.println("rint() Method - The method rint returns the integer that is closest in value to the argument.");

      double d10 = 100.675;
      double e10 = 100.500;
      double f10 = 100.200;

      System.out.println(Math.rint(d10));
      System.out.println(Math.rint(e10)); 
      System.out.println(Math.rint(f10)); 	
	System.out.println("-------------------------------");
	//END rint() Method


	//-----------
	//round() Method
	//The method round returns the closest long or int, as given by the methods return type.
	System.out.println("round() Method - The method round returns the closest long or int, as given by the methods return type.");
      double d11 = 100.675;
      double e11 = 100.500;
      float f11 = 100;
      float g11 = 90f;

      System.out.println(Math.round(d11));
      System.out.println(Math.round(e11)); 
      System.out.println(Math.round(f11)); 
      System.out.println(Math.round(g11)); 	
	  System.out.println("------------------------------");
	//END round() Method

	
	//-----------
	//min() Method
	//The method gives the smaller of the two arguments. The argument can be int, float, long, double.
	System.out.println("min() Method - The method gives the smaller of the two arguments. The argument can be int, float, long, double.");
      System.out.println(Math.min(12.123, 12.456));      
      System.out.println(Math.min(23.12, 23.0));  	
	  System.out.println("---------------------------------");
	//END min() Method

	
	//-----------
	//max() Method
	//This method gives the maximum of the two arguments. The argument can be int, float, long, double.
	System.out.println("max() Method - This method gives the maximum of the two arguments. The argument can be int, float, long, double.");
      System.out.println(Math.max(12.123, 12.456));      
      System.out.println(Math.max(23.12, 23.0)); 	
	System.out.println("-----------------------------------");
	//END max() Method

	
	//----------- MIGHT HAVE ERROR check e and y 
	//exp() Method
	//The method returns the base of the natural logarithms, e, to the power of the argument.
	System.out.println("exp() Method - The method returns the base of the natural logarithms, e, to the power of the argument.");
      double x12 = 11.635;
      double y12 = 2.76;

      System.out.printf("The value of e is %.4f%n", Math.E);
      System.out.printf("exp(%.3f) is %.3f%n", x12, Math.exp(x12));  	
	  System.out.println("--------------------------------");
	//END exp() Method

	
	//-----------
	//log() Method
	//The method returns the natural logarithm of the argument.
	System.out.println("log() Method - The method returns the natural logarithm of the argument.");
      double x13 = 11.635;
      double y13 = 2.76;

      System.out.printf("The value of e is %.4f%n", Math.E);
      System.out.printf("log(%.3f) is %.3f%n", x13, Math.log(x13));	
	System.out.println("-----------------------------------");
	//END log() Method

	//-----------
	//pow() Method
	//The method returns the value of the first argument raised to the power of the second argument.
	System.out.println("pow() Method - The method returns the value of the first argument raised to the power of the second argument.");
      double x14 = 11.635;
      double y14 = 2.76;

      System.out.printf("The value of e is %.4f%n", Math.E);
      System.out.printf("pow(%.3f, %.3f) is %.3f%n", x14, y14, Math.pow(x14, y14));	
	System.out.println("--------------------------------------");
	//END pow() Method

	
	//-----------
	//sqrt() Method
	//The method returns the square root of the argument.
	System.out.println("sqrt() Method - The method returns the square root of the argument.");
      double x15 = 11.635;
      double y15 = 2.76;

      System.out.printf("The value of e is %.4f%n", Math.E);
      System.out.printf("sqrt(%.3f) is %.3f%n", x15, Math.sqrt(x15));	
	  System.out.println("------------------------------");
	//END sqrt() Method

	
	//-----------
	//sin() Method
	//The method returns the sine of the specified double value.
	System.out.println("sin() Method - The method returns the sine of the specified double value.");
      double degrees16 = 45.0;
      double radians16 = Math.toRadians(degrees16);

      System.out.format("The value of pi is %.4f%n", Math.PI);
      System.out.format("The sine of %.1f degrees is %.4f%n", degrees16, Math.sin(radians16));
		System.out.println("-------------------------------");
	//END sin() Method

	
	//-----------
	//cos() Method
	//The method returns the cosine of the specified double value.
	System.out.println("cos() Method - The method returns the cosine of the specified double value.");
      double degrees17 = 45.0;
      double radians17 = Math.toRadians(degrees17);

      System.out.format("The value of pi is %.4f%n", Math.PI);
      System.out.format("The cosine of %.1f degrees is %.4f%n", degrees17, Math.cos(radians17));
System.out.println("-----------------------");	  
	//END cos() Method

	
	//-----------
	//tan() Method
	//The method returns the tangent of the specified double value.
	System.out.println("tan() Method - The method returns the tangent of the specified double value.");
      double degrees18 = 45.0;
      double radians18 = Math.toRadians(degrees18);

      System.out.format("The value of pi is %.4f%n", Math.PI);
      System.out.format("The tangent of %.1f degrees is %.4f%n", degrees18, Math.tan(radians18));
	System.out.println("------------------------");
	//END tan() Method

	//-----------
	//asin() Method
	//The method returns the arcsine of the specified double value.
	System.out.println("asin() Method - The method returns the arcsine of the specified double value.");
      double degrees19 = 45.0;
      double radians19 = Math.toRadians(degrees19);

      System.out.format("The value of pi is %.4f%n", Math.PI);
      System.out.format("The arcsine of %.4f is %.4f degrees %n", Math.sin(radians19),
      Math.toDegrees(Math.asin(Math.sin(radians19))));	
	  System.out.println("----------------------");
	//END asin() Method

	
	//-----------
	//acos() Method
	//The method returns the arccosine of the specified double value.
	System.out.println("acos() Method - The method returns the arccosine of the specified double value.");
      double degrees20 = 45.0;
      double radians20 = Math.toRadians(degrees20);

      System.out.format("The value of pi is %.4f%n", Math.PI);
      System.out.format("The arccosine of %.4f is %.4f degrees %n", Math.cos(radians20),
	Math.toDegrees(Math.acos(Math.cos(radians20))));	
	System.out.println("----------------------");
	//END acos() Method

	
	//-----------
	//atan() Method
	//The method returns the arctangent of the specified double value.
	System.out.println("atan() Method - The method returns the arctangent of the specified double value.");
      double degrees21 = 45.0;
      double radians21 = Math.toRadians(degrees21);

      System.out.format("The value of pi is very very very approximately %.4f%n", Math.PI);
      System.out.format("The arctangent of %.4f is %.4f degrees %n", Math.cos(radians21), 
         Math.toDegrees(Math.atan(Math.sin(radians21))));	
		 System.out.println("------------------------------");
	//END atan() Method

	
	//-----------
	//atan2() Method
	//The method converts rectangular coordinates (x, y) to polar coordinate (r, theta) and returns theta.
	System.out.println("atan2() Method - The method converts rectangular coordinates (x, y) to polar coordinate (r, theta) and returns theta.");
      double x22 = 45.0;
      double y22 = 30.0;

      System.out.println( Math.atan2(x22, y22) );	
	  System.out.println("------------------------------");
	//END atan2() Method

	
	//-----------
	//toDegrees() Method
	//The method converts the argument value to degrees.
	System.out.println("toDegrees() Method - The method converts the argument value to degrees.");
      double x23 = 45.0;
      double y23 = 30.0;

      System.out.println( Math.toDegrees(x23) );
      System.out.println( Math.toDegrees(y23) );	
	  System.out.println("------------------------");
	//END toDegrees() Method
	
	//-----------
	//toRadians() Method
	//The method converts the argument value to radians.
	System.out.println("toRadians() Method - The method converts the argument value to radians.");
      double x24 = 45.0;
      double y24 = 30.0;

      System.out.println( Math.toRadians(x24) );
      System.out.println( Math.toRadians(y24) );	
	System.out.println("-----------------------");
	//END toRadians() Method

	
	//-----------
	//random() Method
	//The method is used to generate a random number between 0.0 and 1.0. The range is: 0.0 =< Math.random < 1.0. Different ranges can be achieved by using arithmetic operations.
	System.out.println("random() Method - The method is used to generate a random number between 0.0 and 1.0. \n The range is: 0.0 =< Math.random < 1.0. Different ranges can be achieved by using arithmetic operations.");
      System.out.println( Math.random() );
      System.out.println( Math.random() );	
	  System.out.println("-------------------------------");
	//END random() Method

	
	//-----------
	//
	
	//END

	
	//-----------
	//
	
	//END

	
	//-----------
	//
	
	//END	
   }	
}