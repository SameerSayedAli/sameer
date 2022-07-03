import java.util.Scanner;

public class AddMatrices {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int row,col,row1, col1;
		
		System.out.println("enter the no of rows ");
		row = sc.nextInt();

		System.out.println("enter the no of colunms ");
		col = sc.nextInt();
		
		
		System.out.println("enter the no of rows of 2nd");
		row1 = sc.nextInt();

		System.out.println("enter the no of colunms 2nd");
		col1 = sc.nextInt();
		int arr[][] = new int[row][col];
		
		int arr1[][] = new int[row1][col1];
		
		//taking input values of array1
				System.out.println("enter the values for 1st array");
				for(int i = 0; i<row ; i++) {
					for(int j = 0; j<col; j++) {
						arr[i][j]= sc.nextInt();
					}
				}
				//taking input values of array 2
				System.out.println("enter the value for 2nd array");
				for(int i = 0; i<row1 ; i++) {
					for(int j =0 ; j<col1; j++) {
						arr1[i][j] = sc.nextInt();
						
					}
				}
				
				//Adding 2 matrices 
//				int h,r;
				int arr2[][] = new int[row1][col1];
				System.out.println("the sum of two matrices");
				for(int i = 0; i<row1;i++) {
					for(int j = 0; j<col1;j++) {
						arr2[i][j]=arr[i][j]+arr1[i][j];
						System.out.print(arr2[i][j]+" ");
						
					}
					System.out.println();
					
				}
				System.out.println();
				
				//subtraction of 2 matrices 
				int arr3[][] = new int[row1][col1];
				System.out.println("the subtraction of two matrices");
				for(int i = 0; i<row1;i++) {
					for(int j = 0; j<col1;j++) {
						arr3[i][j]=arr[i][j]- arr1[i][j];
						System.out.print(arr3[i][j]+" ");
						
					}
					System.out.println();
					
				}
				
		
	}

}
