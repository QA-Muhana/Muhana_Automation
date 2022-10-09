package netflix.usa.encapsulation;

public class EncapsulationTest {
	
private	String name = "Muhana Trisha";
private	String JobTittle = "QA Tester";
private	String Address = "USA";
private	int Salary = 100000;

protected String getName() {
	return name;
}
protected String getJobTittle() {
	return JobTittle;
}
protected String getAddress() {
	return Address;
}
protected int getSalary() {
	return Salary;
}
	
public static void main(String[] args) {
	EncapsulationTest obj = new EncapsulationTest();
System.out.println("Employee Name: " + obj.getName());
System.out.println("Employee JobTittle: " + obj.getJobTittle());
System.out.println("Employee Salary: " + obj.getSalary());
System.out.println("Employee Address: " +	obj.getAddress());
}	
}
