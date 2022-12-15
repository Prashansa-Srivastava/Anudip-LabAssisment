
public class Matrix {
	
	//main method 
	public static void main(String[] args) {
		//assign number of row and col.
		int rows=3,col=3;
		int [][]arr1 = {{10,20,30},{ 40,50,60},{60,70,80}};
		int [][]arr2 = { {1,2,3},{4,5,6},{7,8,9}};
		//add to matrix
		AddTwoMatrix(arr1,arr2,rows,col);
	}
	
	
	//method to add to 2 matrix
	public static void AddTwoMatrix(int [][]arr1,int [][]arr2,int rows,int col) {
		int [][]sum = new int[rows][col];
		for(int i=0; i<rows;i++) {
			for(int j=0; j<col;j++) {
				sum[i][j] = arr1[i][j]+ arr2[i][j];
			}
		}
		printMatrix(sum);
	}
	
	
	// method to print the result of addition of two matrix
	public static void printMatrix(int [][]sum) {
		System.out.println("Sum of two matrices is: ");
		for(int[] row: sum) {
			for(int col:row) {
				System.out.print(col +" ");
			}
			System.out.println();
		}
	}
}
