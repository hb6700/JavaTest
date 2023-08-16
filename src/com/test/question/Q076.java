/*
76. 배열 : 성적그래프
*/
package com.test.question;

import java.util.Scanner;

public class Q076 {

	public static void main(String[] args) {
		
		//시험점수 입력(scan)
		String[][] score = new String[10][3];
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int korScore = scan.nextInt();
		System.out.print("영어 점수 : ");
		int engScore = scan.nextInt();
		System.out.print("수학 점수 : ");
		int mathScore = scan.nextInt();
				
		//■ 출력
		//i가 증가하면서 10점 단위로 점수 비교
		for(int i=0 ; i<10 ; i++) {
			if(korScore>=(i+1)*10) {
				score[i][0] = "■";
			}else {
				score[i][0] = " ";				
			}
			if(engScore>=(i+1)*10) {
				score[i][1] = "■";
			}else {
				score[i][1] = " ";				
			}
			if(mathScore>=(i+1)*10) {
				score[i][2] = "■";
			}else {
				score[i][2] = " ";				
			}
		}
		
		//출력
		//네모 출력시에 i값에 비례해서 ■를 배열에 저장했으므로 출력시에는 반대
		for(int i=9 ; i>=0 ; i--) {
			for(int j=0 ; j<3 ; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("=======================");
		System.out.println("국어\t영어\t수학");
		
		
	}
	
}
