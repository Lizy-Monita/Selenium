package week1.day1;

public class ArmstrongNumber{

/*	 * Goal: To find whether a number is an Armstrong number or not
	 * Armstrong number is a number that is equal to the sum of cubes of its digits. For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
	 * inputs: 153
	 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
	 * 
*/
	
public static void main(String[] args) {
	int a = 153;					// Declare your input

	int calculated=0, remainder, original;		// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
	original = a; 			// Assign input into variable original 
	while (a>0) {			// Use loop to calculate: which loop to use until the number greater than 0??
		remainder = a%10;			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
		a = a/10;					// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
		calculated = calculated+(remainder*remainder*remainder);	// Within loop: Add calculated with the cube of remainder & assign it to calculated
	}
		if (calculated==original) {					// Check whether calculated and original are same
			System.out.println( original +" is an Armstrong Number");			//When it matches print it as Armstrong number
		}
		else
		{
		System.out.println( original +" is not an Armstrong Number");
		}
		


		



		

		

		

		



	}



}