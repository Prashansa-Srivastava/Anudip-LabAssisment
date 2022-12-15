
public class Main {
	
	public static void main(String[] args) {
		// instance of Employee class
		Employee emp = new Employee("xyz",22,"8********9","Noida sector 63",567845.7,"IT");
		// instance of Manager class
		Manager mng = new Manager("PQR",25,"9*********0","New Delhi",800234.66,"Marketing");
		// now print the salary
		emp.printSalary();
		mng.printSalary();
	}


}
