package week1.day2;

public class FindCharCount {

	public static void main(String[] args) {
		
		/*
		 * to find number of occurrences of a given character
		 * companyName = SocieteGenerale
		 * convert them into charArray
		 * define a character to identify
		 * loop through characters to identify the numbers
		 * if matches add to count
		 * print the number
		 * 
		 */
		
		String companyName = "SocieteGenerale";
		char word = 'e';
		int count =0;
		char[]ch = companyName.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (word == ch[i]) {
				count=count+1;
			} 
		}
		System.out.println(count);

	}

}
