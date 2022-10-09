package amazon.usa.inheritance2;

public class AlamBhai implements KumarDavid, Tawhid{

	public void getCar() {
		// TODO Auto-generated method stub
		System.out.println("lamburghini");
	}

	public void getCash() {
		// TODO Auto-generated method stub
		System.out.println("4500000");
	}
  public void getHouse() {
	  System.out.println("A palace");
  }
 
 
	public static void main(String[] args) {
		AlamBhai obj = new AlamBhai();
		obj.getCar();
		obj.getCash();
		obj.getHouse();
	}
}
