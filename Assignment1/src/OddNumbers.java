
public class OddNumbers {
	
	public static void main(String args[])
	{
		int number=20;  
		System.out.println("List of odd numbers: ");
		//method calling  
		displayoddno(number);
	}
	public static void displayoddno( int number)
	{
		for (int i=1; i<=number; i++)   
		{  
			//check if the number is odd or not
			if (i%2!=0)   
			{  
			//prints the odd numbers  
			System.out.print(i + " ");  
			}  
		}
	}
}
