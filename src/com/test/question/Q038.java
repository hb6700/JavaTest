/*
38. 반복문 : 짝수 홀수 합
요구사항 : 입력 횟수(N)와 숫자 N개를 입력받아 짝수의 합과 홀수의 합을 각각 출력하시오.
*/
package com.test.question;

import java.util.Scanner;

public class Q038 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력횟수 : ");
		int count = scan.nextInt();
		
		int oddSum = 0;
		int evenSum = 0;
		int oddCount = 0;
		int evenCount = 0;
		
		for(int i = 1;i<=count;i++) {
			System.out.print("숫자 : ");
			int num = scan.nextInt();
			if (num % 2 == 0) {
				evenCount++;
				evenSum += num;
			} else {
				oddCount++;
				oddSum += num;
			}
		}//for
		System.out.printf("짝수 %d개의 합 : %d\n", evenCount, evenSum);
		System.out.printf("홀수 %d개의 합 : %d\n", oddCount, oddSum);
		
	}
	
}
