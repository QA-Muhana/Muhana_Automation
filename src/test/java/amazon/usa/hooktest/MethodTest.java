package amazon.usa.hooktest;

import java.security.DomainCombiner;

public class MethodTest {
static int salary;
static String Name;
static String departments;


 public void getSalary(){
	  salary =100000;
	  System.out.println("Employees Salary:" + salary);
 }
	  
	  
	  public void getEmployees() {
		  Name = "Muhana";
		  System.out.println("Employees Name:"+ Name );
		  }
	  
	  public static void getDepartments() {
		  salary =100000;
		  Name =" Muhana";
		  departments = "QA Automation";
		 }
	  public static void getEmpInfo(String name,int salary) {
		  System.out.println("Employee Name:"+ Name);
		  System.out.println("Employee salary :"+ salary);
		  
	  }
	 
	
	  public static void main(String[] args) {
		MethodTest obj = new MethodTest();
		obj.getEmployees();
		obj.getSalary();
		;
		MethodTest.getDepartments();
		
		
		
		MethodTest.getEmpInfo("Muhana", 98000);
		MethodTest.getEmpInfo("Sumana", 100000);
		MethodTest.getEmpInfo("Bappy", 120000);
		MethodTest.getEmpInfo("Ashani", 105000);
		MethodTest.getEmpInfo("Dishma", 98000);
		
	 }
	}
	
	  