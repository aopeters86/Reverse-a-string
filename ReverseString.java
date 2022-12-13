import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a word to reverse (This calls the method): ");
		String userIn = keyboard.nextLine();
		
		
		//with method
		//Cant concatenate string?
		//System.out.print(reverseString(userIn)  + "(This calls the method)");
		reverseString(userIn);
		
		//without method 
		System.out.println("\nEnter another word (this doesnt call the method)");
		String userIn2 = keyboard.nextLine();
		
		for(int i = userIn2.length() -1; i >= 0; i--) {
			System.out.print(userIn2.charAt(i));
		}
	}
	
	public static void reverseString(String x) {
		
		for(int i = x.length()-1 ; i >= 0; i--) {
//			have to do the following step?	works without it as shown below
//			char reverse = x.charAt(i);
			System.out.print(x.charAt(i));
		
	}
		


}
}