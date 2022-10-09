package netflix.usa.polymorphism;

public class MethodOverloading {

	public void getInfo(String name , int salary) {
		System.out.println(name);
		System.out.println(salary);
	}
	public void getInfo(int age , String address) {
		System.out.println(age);
		System.out.println(address);
	}
	public void getInfo(double bonus, String name) {
		System.out.println(bonus);
		System.out.println(name);
	}
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.getInfo("Muhana", 100000);
		obj.getInfo(28, "USA");
		obj.getInfo(7000.70, "Sagar");
	}
}
