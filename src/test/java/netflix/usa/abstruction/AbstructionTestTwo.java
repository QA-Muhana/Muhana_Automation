package netflix.usa.abstruction;

public class AbstructionTestTwo extends AbstrationTestOne{

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("This a concrete method");
	}
	public static void main(String[] args) {
		AbstructionTestTwo obj = new AbstructionTestTwo();
		obj.getCash();
		obj.getHouse();
		obj.getInfo();
	}
}
