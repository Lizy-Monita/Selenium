package week1.day1;

public class LearnLoop {

	public static void main(String[] args) {
		
		int input = 5;
		
		while(input>0) {
			
			System.out.println(input);

			input = input-1; //to stop printing the result have to decrement the value (since 0 is always lesser than 5)
			input--;
		}
	}
}