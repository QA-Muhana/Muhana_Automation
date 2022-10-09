package netflix.usa.polymorphism;

public class MethodOverriding {

	public void getCar() {
		System.out.println("I have a BMW");
	}
	public void getHouse() {
		System.out.println("I have a Villa");
	}
	public void getHusband() {
		System.out.println("My husband name is Sagar");
	}
	public static void main(String[] args) {
		MethodOverriding obj = new MethodOverriding();
		obj.getCar();
		obj.getHouse();
		obj.getHusband();
	}
}
