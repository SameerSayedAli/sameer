public class EvenOddArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = 4;
		int arr[] = new int[row];
		
		System.out.println("enter the value of array ");
		int i ;
		for( i = 0; i<row-1;i++) {
			arr[i] = sc.nextInt();
			
			
		}
		if(arr[i]%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}

	}

}
