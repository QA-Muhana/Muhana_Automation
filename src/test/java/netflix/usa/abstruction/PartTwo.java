package netflix.usa.abstruction;

public class PartTwo implements PartOne {

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		String name = "BMW";
		System.out.println(name);
	}
public static void main(String[] args) {
	PartTwo obj = new PartTwo();
	obj.getInfo();
	obj.defaultCash();
}
}
