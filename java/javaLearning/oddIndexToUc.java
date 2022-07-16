package javaLearning;

public class oddIndexToUc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strChange="changeme";
		int length;
		char[] charChange=strChange.toCharArray();
		length=strChange.length();
		System.out.println("The string is: "+strChange);
		System.out.println("After convertion of odd index number to UC: ");
		for(int i=0;i<length;i++) {
			if(i%2>0) {
				//convert odd index characters from the array to uppercase
				charChange[i]=Character.toUpperCase(charChange[i]);

			}
			System.out.print(charChange[i]);
		}
	}

}
