/*
72. 배열 : 숫자문제
*/
package com.test.question;

public class Q072 {

	public static void main(String[] args) {
		
		//변수 생성
		int[][] nums = new int[5][5];
		
		//데이터 입력
		int n = 1;
		
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				nums[j][i] = n;
				n++;
			}
		}
		
		//출력 : 수정없이 그대로 사용
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
		
	}
	
}
