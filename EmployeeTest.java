/*This code will use method from the Employee.java source file*/
import java.io.*;

public class EmployeeTest {
	
	public static void main(String args[]){
		
		//create two object using constructor
		Employee empOne = new Employee("James Smith");
		Employee empTwo = new Employee("Mary Anne");
		
		//Invoking methods for each object created
		empOne.empAge(26);
		empOne.empDesignation("Senior Software Engineer");
		empOne.empSalary(1000);
		empOne.printEmployee();
		
		empTwo.empAge(21);
		empTwo.empDesignation("Software Engineer");
		empTwo.empSalary(500);
		empTwo.printEmployee();
	}
}