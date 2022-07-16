package week1.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		
		int [] nums = {1,2,3,1,2,3,4,5,6};
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i]== nums[i+1]) {
				System.out.println("Dups: "+nums[i]);
			}
		}

	}

}
