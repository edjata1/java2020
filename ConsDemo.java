/*This is a No argument Constructors
 class MyClass{
	MyClass(){
		
	}
}
*/

//This is a Parameterized Constructors
class MyClass{
	int x;
	
	MyClass(int i){
		x = i;
	}
}

public class ConsDemo{
	
	public static void main(String args[]){
		MyClass t1 = new MyClass(10);
		MyClass t2 = new MyClass(20);
		
		System.out.println(t1.x + " " + t2.x);
		
	}
}