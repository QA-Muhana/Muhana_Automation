package netflix.usa.polymorphism;

public class MethodOverridingOne extends  MethodOverriding{

	public void getProperty() {
		System.out.println("I have a land");
	}
	public void getHusband() {
		System.out.println("My husband name is Parijat");
		}
		
	public static void main(String[] args) {
		MethodOverridingOne obj = new MethodOverridingOne();
		obj.getProperty();
		obj.getHusband();
	}
}
