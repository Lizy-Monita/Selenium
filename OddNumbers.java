package week1.day1;

public class OddNumbers {

	public static void main(String[] args) {

	// Input: range of numbers (starting to end) [1 to 20]
		
		System.out.println("Printing only the odd numbers from 1 to 20:");		// Output: Printing only odd numbers [1,3,5,7,9...,19]
		
		for(int i=1; i<20; i++) {					//		Iterate from 1 to 20 (tip: using loop concept)
			if (i%2!=0) {							//	Within loop -> check whether the integer is odd (tip: use mod operator)
			System.out.println(i);					//	Within loop -> print the odd integer
					}
		}
	}
}