package netflix.usa.abstruction;

public class ConstructorOne {

	public ConstructorOne() {
		
	}
	public ConstructorOne(String name ,int age) {
		System.out.println("Employee Name:" + name);
		System.out.println("Employee age:" + age);
	}
	public ConstructorOne(int salary , String Add) {
		System.out.println("Employee salary: " + salary);
		System.out.println("Employee Add: " + Add);
	}
	public static void main(String[] args) {
		ConstructorOne obj = new ConstructorOne("Muhana" ,28);
		ConstructorOne x = new ConstructorOne(100000, "USA");
	}
}
