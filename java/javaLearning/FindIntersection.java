package javaLearning;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] firstArray= {3,2,11,4,6,7};
		int[] secondArray= {1,2,8,4,9,7};
		int lengthOfFirstArray =firstArray.length;
		int lengthOfSecondArray =secondArray.length;
		int i;
		//for loop to iterate through first array
		for( i=0;i<lengthOfFirstArray;i++) {
			//for loop to iterate through second array{
			for(int j=0;j<lengthOfSecondArray;j++) {
				if(firstArray[i]==secondArray[j]) {
					System.out.println("The value at index position: "+i +" matches in both arrays");				
					System.out.println(firstArray[i]);	
				}
			}
		}

	}

}
