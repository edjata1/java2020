//Modifiers - private, public, and protected
public class DataStructure { //checked

	//create an array

	private final static int SIZE = 15; //CONSTANT- checked
	private int[] arrayOfInts = new int[SIZE];//checked

	//constructor - have same name as its class

	public DataStructure() {//checked
		//fill the array with ascending integer values

		for (int i = 0; i < SIZE; i++) { //checked
			arrayOfInts[i] = i; //checked
		} //checked
	} //checked

	//method - to print

	public void printEven() { //checked
	
		//Print out values of even indices of the array

		DataStructureIterator iterator = this.new EvenIterator(); //creating new object or instance
		while (iterator.hasNext()) { //checked
			System.out.print(iterator.next() + " "); //checked
		}//checked
		System.out.println();//checked
	}//checked

	//interface
	interface DataStructureIterator extends java.util.Iterator<Integer>{ }//checked

	//Inner class implements the DataStructureIterator interface,
	//which extends the Iterator<Integer> interface

	private class EvenIterator implements DataStructureIterator{ //checked
	
		//Start stepping through the array from the beginning
		private int nextIndex = 0; //checked
	
		public boolean hasNext() { //checked
			
			//check if the current element is the last in the array
			return (nextIndex <= SIZE - 1); //checked
		}//checked

		public Integer next(){ //checked
			
			//record a value of an avan index of the array
			Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);//checked

			//Get the next even element
			nextIndex += 2; //checked
			return retValue; //checked
		}//checked
	}//checked

	public static void main(String s[]){ //checked

		//Fill the array with integer values and print out only
		//values of even indices
		DataStructure ds = new DataStructure(); //checked
		ds.printEven();//checked
	}//checked	
}//checked