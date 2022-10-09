package doe.usa.inheritance;

public class ClassC extends ClassB {

 public void getNewhouse() {
		System.out.println("i have a brand new house");
	}
		public void getLaptop(){
			System.out.println("i got a new laptop");
		}
		public static void main(String[] args) {
			ClassC obj = new ClassC();
			obj.getLaptop();
			obj.getNewhouse();
			obj.getProperties();
			obj.getCash();
			obj.getVehicle();
			obj.getJob();
		} 
	}

