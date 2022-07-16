package week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		int[]minMax = {22,11,88,99,66,33,0,-1,9,10};
		Arrays.sort(minMax);
		System.out.println(minMax[0]);
		int len=minMax.length;
		System.out.println(minMax[len-1]);
		
	}

}
