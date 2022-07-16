package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		String str="madam";
		String rev ="";
		int length;
		length=str.length();
		char[] charArray=str.toCharArray();
		for(int j=length-1;j>=0;j--) {
				rev=rev+ charArray[j];
			}
			if(str.equals(rev)) {
				System.out.println("The string: " + str + " is a palindrome");	
			}
			else {
				System.out.println("The string: " + str + " is not a palindrome");	
			}
		//}

	}

}
