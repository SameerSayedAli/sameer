public class TaxCalculator {
	
	float basicsalary;
	boolean citizenship;
	
	
	public float calculteTax(){
		float tax = 30*basicsalary/100;
		return tax;
	}

}

 class TaxCalculatorWork{
	public static void main(String[] args) {
		

				TaxCalculator t = new TaxCalculator();

				t.basicsalary = 30000;

				System.out.println("the tax of the employee for the " + t.basicsalary + " is "
						+ t.calculteTax());

			}
		
	}
