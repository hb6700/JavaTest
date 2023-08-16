/*
48. 반복문 : 숫자 합
요구사항 : 최대 9자리 정수를 입력받아 각자리의 홀수 숫자합과 짝수 숫자합을 구하시오.
조건 : int 양수만 입력하시오.
*/
package com.test.question;

import java.util.Scanner;

public class Q048 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = scan.nextInt();
		
		int oneNum = 0;
		int oddNum = 0;
		int evenNum = 0;
		
		for(int i = 1; i <=9 ; i++) {
			oneNum = num%10;
			if (oneNum % 2 != 0) {
				oddNum += oneNum;
				num = num/10;
			}else {
				evenNum += oneNum;
				num = num/10;
			}
		}
		System.out.printf("짝수의 합 : %d\n", evenNum);
		System.out.printf("홀수의 합 : %d\n", oddNum);
//		if (num>=0 && num < 1000000000) {
//					
//		} else {
//			
//		}
		
	}
	
}
