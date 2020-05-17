package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {

//		Solution 1		
		long input =2357382750275017L, sumOfDigits;
		String val = String.valueOf(input);
		char[] charArray = val.toCharArray();
		sumOfDigits=0;
		for (char c : charArray)	{
			sumOfDigits = sumOfDigits + Integer.parseInt("" + c);
		}
		System.out.println("Sum of Digits is: " + sumOfDigits);
	}
		
		
//	Solution 2		
		
	/*	int input=35, original, remainder, sumOfDigits;		// Declare your input number (int)
														// Initialize an integer variable by name: sum
				original=input;while(original>0)		// Use loop to calculate the sum: which loop to use until the number goes greater than 0??
	{													
					remainder = original % 10;				// Within loop: get the remainder when done by 10 -> Tip: use mod
					int sumOfDigits = sumOfDigits + remainder;
					original = original / 10;
	}
	System.out.println("Sum of Digits is "+sumOfDigits);*/
}

	// Within loop: add that remainder to the sum

	// Print the sum to confirm

	// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)

	// Print the quotient to confirm

// Outside the loop: print the final sum


