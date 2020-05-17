package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		
		/*A prime number is a whole number greater than 1 whose only factors are 1 and itself.
		A factor is a whole number that can be divided evenly into another number.
		The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29.
		Numbers that have more than two factors are called composite numbers.
		*/	
			int a = 3; 				// Declare an int Input and assign a value
			
			boolean flag = true;			// Declare a boolean input as flag

			for (int i = 1; i < a/2; i++)
			{		// Iterate from 1 to half of the input
											// Divide the input with each for loop variable and check the remainder
				if (a%i==0)
				{
					System.out.println(a%i);
					flag = false;
					break;
				}
			}
				if(flag==true)
					System.out.println(a+" is a Prime Number");			// Set the flag as true when there is no remainder
				else
				System.out.println(a+" is not a Prime Number");
	}
					

}