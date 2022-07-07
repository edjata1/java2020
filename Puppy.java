public class Puppy{
	
	//create variable for puppyAge
	int puppyAge;
	
	public Puppy(){	
	}
	
	public Puppy (String name){
		//This constructor has one parameter, name.
		System.out.println("Passed Name is: " + name);
	}
	
	//setting puppy age
	public void setAge(int age){
		puppyAge = age;
	}
	
	//getting puppy age and printing it out
	public int getAge(){
		System.out.println("Puppy's age is: " + puppyAge);
		return puppyAge;
	}
	
	public static void main(String []args){
		
		//Object creation 
		Puppy myPuppy = new Puppy("Tommy");
		
		//call class method to set age
		myPuppy.setAge(2);
		
		//call another class method to get puppy's age
		myPuppy.getAge();
		
		//access instance variable 
		System.out.println("Variable value: " + myPuppy.puppyAge);
	}
}