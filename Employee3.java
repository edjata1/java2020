import java.io.*;
public class Employee3{
	
	private static double salary;
	
	public static final String DEPARTMENT = "Development ";
	
	public static void main(String args[]){
		
		salary = 1000.00;
		System.out.println(DEPARTMENT + "average salary: $" + salary);
	}
}