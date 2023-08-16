//73. 배열 : 숫자 출력
package com.test.question;

public class Q073 {

	public static void main(String[] args) {
		
		//변수 입력
		int[][] nums = new int[5][5];
		
		//데이터 입력
		int n = 1;
		
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<5-i ; j++) {
				nums[i][j] = n;
				n++;
			}
		}
		
		//출력
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<5-i ; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			for(int j=1 ; j<=i ; j++) {
				System.out.printf("%5d", 0);
			}
			System.out.println();
		}
		
	}
	
}
