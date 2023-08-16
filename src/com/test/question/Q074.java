//74. 배열 : 숫자출력
package com.test.question;

public class Q074 {

	public static void main(String[] args) {
		
		int[][] nums = new int[5][5];
		
		int n = 1;
		
		
		//입력
		for(int i=0 ; i<3 ; i++) {
			for(int j=2-i ; j<=2+i ; j++) {
				nums[i][j] = n;
				n++;
			}
		}
		for(int i=3 ; i<5 ; i++) {
			for(int j=i-2 ; j<7-i ; j++) {
				nums[i][j] = n;
				n++;
			}
		}
		
		
		//출력
		for(int i=0 ; i<5 ; i++) {
			for(int j=1 ; j<3-i ; j++) {
				System.out.printf("%5d", 0);				
			}	
			for(int j=1 ; j<2*i-1 ; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
			
	}
	
}
