public class DecisionStatements{
	
	public static void main(String args[]) {
	
	//Enhanced for loop
	int [] numbers0 = {10, 20, 30, 40, 50};

	for(int x0 : numbers0 ) {
		System.out.print( x0 );
		System.out.print(",");
	}
	System.out.print("\n");
	
	String [] names0 = {"James", "Larry", "Tom", "Lacy"};

	for( String name0 : names0 ) {
		System.out.print( name0 );
		System.out.print(",");
	}
	//END
	
	//if statement code
	int x = 10;

	if( x < 20 ) {
		System.out.print("This is if statement");
		}
	
	//END if statement code
	
	// if...else statement
	int x1 = 30;

	if( x1 < 20 ) {
		System.out.print("This is if statement");
	}else {
		System.out.print("This is else statement");
	}
	
	//Or 
	int x2 = 30;

	if( x2 == 10 ) {
		System.out.print("Value of X is 10");
	}else if( x2 == 20 ) {
		System.out.print("Value of X is 20");
	}else if( x2 == 30 ) {
		System.out.print("Value of X is 30");
	}else {
		System.out.print("This is else statement");
	}
	
	//END of if .. else
		
	//nested if statement
	
	 int x3 = 30;
      int y3 = 10;

      if( x3 == 30 ) {
         if( y3 == 10 ) {
            System.out.print("X = 30 and Y = 10");
         }
      }
	//END nested if statement
	
	//switch statement
      // char grade = args[0].charAt(0);
      char grade = 'C';

      switch(grade) {
         case 'A' :
            System.out.println("Excellent!"); 
            break;
         case 'B' :
         case 'C' :
            System.out.println("Well done");
            break;
         case 'D' :
            System.out.println("You passed");
         case 'F' :
            System.out.println("Better try again");
            break;
         default :
            System.out.println("Invalid grade");
      }
      System.out.println("Your grade is " + grade);	
	//END switch statement
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}
	
}