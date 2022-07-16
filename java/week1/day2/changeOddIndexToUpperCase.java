package week1.day2;

public class changeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		/*
		 * Declare String Input as Follow

		 * String test = "changeme";

		 * a) Convert the String to character array

		 * b) Traverse through each character (using loop)

		 * c)find the odd index within the loop (use mod operator)

		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		 * 
		 */
		String test = "changeme";
		int length;
		char[] chars=test.toCharArray();
		length = chars.length;
		System.out.println("The String is "+ test);
		System.out.println("Converting oddIndex number to upperCase: ");
		for (int i = 0; i < length; i++) 
			 {
			if (i%2>0) {
				chars[i]=Character.toUpperCase(chars[i]);
			}  {

			}
				System.out.print(chars[i]); 	
				 { 
			}	
			 }
		}
	}


