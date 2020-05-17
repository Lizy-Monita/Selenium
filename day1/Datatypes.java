package week1.day1;

public class Datatypes {
	//Create 4 global variables with different datatypes
	String mobileBrand = "Samsung";
	double mobilePriceInRupees = 14.88;
	int noContacts = 250;
	long imeaNumber = 1234567890;
	
	//Print the values in console using local variable
	public void mobileBrand(String brand) {
	System.out.println(brand);
	}
	
	public void mobilePriceInRupees(double Price) {
	System.out.println(Price);
	}
	
	public void noContacts(int noContacts) {
	System.out.println(noContacts);
	}
	
	public void imeaNumber(long imeaNumber) {
	System.out.println(imeaNumber);
	}
	
	public static void main(String[] args) {
		Datatypes myMobile = new Datatypes();
				
		//Call those variables in main method using object
		myMobile.mobileBrand("Samsung");
		myMobile.mobilePriceInRupees(14880);
		myMobile.noContacts(250);
		myMobile.imeaNumber(1234567890);
	}

		
}