package netflix.usa.abstruction;

public interface PartOne {

	public void getInfo();
	
	default void defaultCash(){
		String money = "One hundred";
				System.out.println(money);
	}
}
