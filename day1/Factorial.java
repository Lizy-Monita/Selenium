package week1.day1;

public class Factorial {

	public static void main(String[] args) {
	 /* * Goal: Find the Factorial of a given number
		input: 5
		 * output: 5*4*3*2*1 = 120 
*/		 
		
	int a = 4;		// Declare your input number
	int fact=4;			// Declare and initialize an integer variable by name: fact
	for (int a1 = 1; a1 < 4; a1++) {		// Iterate from 1 to your input (tip: using loop concept)
		fact=fact*a1;						// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)
		}
	System.out.println("Factorial of "+a+" is: "+fact);
	}
	
}
