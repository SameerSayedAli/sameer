class NumberIsPrimeOrNot {

	public static void main(String[] args) {
		int num = 15;
		int s = 0;
		for(int i = 2 ; i<= num/2 ; i++){
			if(num%i ==0){
				s = 1;
				break;
			}
			if(s == 1){
				System.out.println(num + " is a prime number");
			}
			else{
				System.out.println(num + " is not prime");
			}

		}
	}

}
