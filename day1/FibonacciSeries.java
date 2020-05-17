package week1.day1;

public class FibonacciSeries {

		/*
		 * Goal: To find Fibonacci Series for a given range
		 * A series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers.
		 * The simplest is the series 1, 1, 2, 3, 5, 8, etc.
		 * input(range): 8
		 * output: 0, 1, 1, 2, 3, 5, 8, 13
		 *    
		 */

		public static void main(String[] args) {
			int n1=1, n2=1, n3=0, range=8; 			// initialize 3 int variables (Tip: range & firstNum, secNum in the series)
						
			for (int i = 1; i < range; i++) {							// Iterate from 1 to the range
				n1=n2;
				n2=n3;
				n3=n1+n2;										
				System.out.println(n3);
		}
		}
}
