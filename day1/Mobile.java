package week1.day1;

public class Mobile {
	
	public void makeCall() {
			System.out.println("Calling...");
		}
	
	public void sendMessage() {
			System.out.println("Sending Message...");
		}
	
	public void takePicture() {
			System.out.println("Taking picture...");
		}
	
	public static void main(String[] args) {
		Mobile callMobile = new Mobile();
		callMobile.makeCall();
		
		Mobile textMobile = new Mobile();
		textMobile.sendMessage();
		
		Mobile clickPicture = new Mobile();
		clickPicture.takePicture();
	}
}