package week1.day1;

public class ConditionalStatement {

	public static void main(String[] args) {
		String category="";
		int age = 65;
		
		if(age<17)
		{
			category="minor";
		    //System.out.println("it's for true condition");
		}
		else if(age > 17 && age < 60)
			{
			category="adult";
	}
		else 
		{
			category="senior citizen";
		}
System.out.println(category);
}
}