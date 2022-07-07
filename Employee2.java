import java.io.*;
public class Employee2{

	// this instance variable is visible for any child class.
	public String name;
	
	// salary  variable is visible in Employee class only.
	private double salary;
	
	// The name variable is assigned in the constructor.
	public Employee2(String empName){
		name = empName;
	}

	//Assign the salary to the variable salary
	public void setSalary(double empSal){
		salary = empSal;
	}
	
	//This method prints the employee details.
	public void printEmp(){
		System.out.println("Name: "+ name);
		System.out.println("Salary: " + salary);
	}
	
	public static void main(String args[]){
		
		Employee2 empOne = new Employee2("Ransika");
		empOne.setSalary(1000);
		empOne.printEmp();
	}
}