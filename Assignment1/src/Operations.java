import java.util.Scanner;
public class Operations {
	public static void main(String[] args)
	{
	    char operator;
	    double num1, num2;
	    // create an object of Scanner class
	    Scanner sc = new Scanner(System.in);
	    
	    // ask users to enter numbers
	    System.out.println("Enter first number");
	    num1 = sc.nextDouble();

	    System.out.println("Enter second number");
	    num2 = sc.nextDouble();

	    // ask users to choose operator
	    System.out.println("Choose an operator: +, -, *, % or /");
	    operator = sc.next().charAt(0);
	    sc.close();
	    
		//method calling  
	    operation(num1,num2,operator);
	}
	
	public static void operation(double num1,double num2,char operator) {
		double result;
		
		switch (operator) {

	      // performs addition between numbers
	      case '+':
	        result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result);
	        break;

	      // performs subtraction between numbers
	      case '-':
	        result = num1 - num2;
	        System.out.println(num1 + " - " + num2 + " = " + result);
	        break;

	      // performs multiplication between numbers
	      case '*':
	        result = num1 * num2;
	        System.out.println(num1 + " * " + num2 + " = " + result);
	        break;
	        
		      // performs reminder between numbers
	      case '%':
		        result = num1 % num2;
		        System.out.println(num1 + " / " + num2 + " = " + result);
		        break;

	      // performs division between numbers
	      case '/':
	        result = num1 / num2;
	        System.out.println(num1 + " / " + num2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }
	}
}

