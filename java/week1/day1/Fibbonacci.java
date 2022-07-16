package week1.day1;

public class Fibbonacci {

	public static void main(String[] args) {
		
		/*
		 * firstNum=0
		 * secNum=1
		 * thirdNum=firstNum+secNum
		 * n=11
		 * i=1
		 */
		int firstNum=0;
		System.out.println(firstNum);
		int secNum=1;
		System.out.println(secNum);
		int thirdNum=0;
		int n=11;
		for (int i = 1; i <=n ; i++) {
		thirdNum=firstNum+secNum;
		System.out.println(thirdNum);
		firstNum=secNum;
		secNum=thirdNum;
		}
				
		
		

	}

}
