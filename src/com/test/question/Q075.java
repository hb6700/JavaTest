//75. 배열 : 숫자출력
package com.test.question;

public class Q075 {

	public static void main(String[] args) {
		
		//변수 생성
		int[][] nums = new int[5][5];
		int n = 1;
		int sum = 0;
		
		//입력
		for(int i=0 ; i<nums.length-1 ; i++) {
			for(int j=0 ; j<nums.length-1 ; j++) {
				nums[i][j] = n;
				nums[i][4] += n;		//가로의 합
				nums[4][j] += n;		//세로의 합
				nums[4][4] += n;		//[4][4] -> 1~16까지의 총합
				
				n++;					//1~16
			}
		}
		
		//출력
		for(int i=0 ; i<nums.length ; i++) {
			for(int j=0 ; j<nums.length ; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
					
	}
	
}
