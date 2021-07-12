
public class Calculator {

	//add method .
	public int add (int a, int b) {

		return a + b;
		//return

		
		

	}
	
	//subtract method
	public int subtract (int a, int b) {
		return a - b;
		
	}
	
//multiply method
	public int multiply(int a, int b) {
		return a * b;
		
	}
	public int divide (int a, int b) {
		
		  if (b == 0) {
			   throw new IllegalArgumentException("Division by zero is not supported");
			  }

			  return a / b;
	 }

}

