package amazon.usa.hooktest;

public class DailyPractice {
	int salary;
	

	public void getEmployeeInfo(){
		String employeeName = "Fahim";
		System.out.println("Employee Name:" +employeeName);
		
	
		
	}

	public static void getDepartment() {
		int salary = 100000;
	System.out.println("Employee salary:" + salary);	
	}
	
	
   public void getSalary () {
	   String Name = "Farzana";
	   int bonus = 10000;
	   System.out.println("Employee Name:" + Name + ", bonus:" + bonus);
	      
	   
   }
	public void getMuhana(String Name, int id) {
		System.out.println("Employee Name:" + Name);
		System.out.println("Employee id:" + id);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    DailyPractice obj = new DailyPractice();
		obj.getEmployeeInfo();
		obj.getSalary();
		DailyPractice.getDepartment(); //we call static method by class name
		obj.getMuhana("Muhana", 5000);
		obj.getMuhana("Farzana", 10000);
		obj.getMuhana("Shammy", 8000);
		
	}

}
