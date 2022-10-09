package doe.usa.inheritance;

public class ClassB extends ClassA {

	public void getVehicle() {
		System.out.println("I have a great RB");
	}	
		public void getJob(){
			System.out.println("I have a grocery store");
		}
			public static void main(String[] args) {
				ClassB obj = new ClassB();
				obj.getVehicle();
				obj.getJob();
				obj.getCash();
				obj.getProperties();
			}
	
}
