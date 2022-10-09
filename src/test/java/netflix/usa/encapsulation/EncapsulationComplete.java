package netflix.usa.encapsulation;

public class EncapsulationComplete extends EncapsulationTest {

	public static void getInfo() {
		System.out.println("i am learning java encapsulation:");
		

	}
	public static void main(String[] args) {
		EncapsulationComplete.getInfo();
		
		EncapsulationComplete obj = new EncapsulationComplete();
System.out.println("Employee Name :" + obj.getName());
System.out.println("Employee JobTittle :" + obj.getJobTittle());
System.out.println("Employee Salary :" 	+ obj.getSalary());
System.out.println("Employee Address :" + obj.getAddress());
	}
}
