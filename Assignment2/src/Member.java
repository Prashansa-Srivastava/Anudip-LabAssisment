
public class Member {
	
	// Data member
	private String name;
	private int age;
	private String phoneNumber;
	private String address;
	private double salary;
	
	// parameterized Constructor
	public Member(String name,int age,String phoneNumber, String address, double salary) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}
	
	// method for print Name
	public void printName() {
		System.out.println("Nmae is  "+ name);
	}
	
	// method for print age
	public void printAge() {
		System.out.println("Age is  "+ age);
	}
	
	// method for print Phone Number 
	public void printPhoneNumber() {
		System.out.println("PhoneNumber is  "+ phoneNumber);
	}
	
	// method for print Address
	public void printAddress() {
		System.out.println("Address is  "+ address);
	}
	// method for print salary
	public void printSalary() {
		System.out.println("Salary is  "+ salary);
	}
	
}