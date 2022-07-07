public class ConditionalOperatorTest {
	
	public static void main (String args[]){
		
		int a, b;
		a = 10;
		
		//This variable x = (expression) ? value if true : value if false
		b = (a == 1) ? 20: 30;
		System.out.println("Value of b is: " + b);
		
		b = (a == 10) ? 20: 30;
		System.out.println("Value of be is: " + b);
	}
}