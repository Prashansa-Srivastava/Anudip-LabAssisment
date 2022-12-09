import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args)
	{
		int num1,num2,num3;
	    // create an object of Scanner class
	    Scanner sc = new Scanner(System.in);

		 // ask users to enter numbers
	    System.out.println("Enter first number");
	    num1 = sc.nextInt();

	    System.out.println("Enter second number");
	    num2 = sc.nextInt();
	    
	    System.out.println("Enter third number");
	    num3 = sc.nextInt();
	    
		//method calling  
	    greatestnum(num1,num2,num3);
	    sc.close();
	}
	
	public static void greatestnum(int num1, int num2, int num3) {
		
		//comparing numbers, num1 with num2
		if(num1>num2) {
			
			//comparing numbers, num1 with num3
			if(num1>num3) {
				System.out.println("Greatest Number is  " + num1);
			}
			else {
				System.out.println("Greatest Number is  " + num3);

			}
		}
		else{
			//comparing numbers, num2 with num3
				if(num2>num3) {
					System.out.println("Greatest Number is  " + num2);
				}
				else
				{
					System.out.println("Greatest Number is  " + num3);
	
				}
			}	
		}		
	}
