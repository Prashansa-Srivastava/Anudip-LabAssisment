
public class Main {
	
	public static void main(String[] args) {
		// instance of Employee class
		Employee emp = new Employee("Shashwat",20,"8********9","Noida sector 63",567845.7,"IT");
		// instance of Manager class
		Manager mng = new Manager("Prashansa",22,"9*********0","New Delhi",800234.66,"Marketing");
		// now print the salary
		emp.printName();
		emp.printAge();
		emp.printPhoneNumber();
		emp.printAddress();
		emp.printSalary();
		
		mng.printName();
		mng.printAge();
		mng.printPhoneNumber();
		mng.printAddress();
		mng.printSalary();
		
	}


}
