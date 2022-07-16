package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		
		int[] firstArray= {3,2,11,4,6,7};
		int[] secondArray= {1,2,8,4,9,7};
		int length1 =firstArray.length;
		int length2 =secondArray.length;
		int i;
		//for loop to iterate through first array
		for( i=0;i<length1;i++) {
			//for loop to iterate through second array{
			for(int j=0;j<length2;j++) {
				if(firstArray[i]==secondArray[j]) {
					System.out.println("The common number from both the index is: "+i);				
					System.out.println(firstArray[i]);
				}
			}
		}

	}

}
