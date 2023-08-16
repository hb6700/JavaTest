/*
29. 조건문 : 연산식
요구사항 : 숫자 2개와 연산자 1개를 입력받아 연산 과정과 결과를 출력하시오.
조건
정수만 입력하시오.(유효성 검사 필요없음)
나머지 연산 결과는 소수이하 첫째자리까지 출력 하시오.
연산자는 산술 연산자(+, -, *, /, %)만 입력하시오.
*/
package com.test.question;

import java.util.Scanner;

public class Q029 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int firstNum = scan.nextInt();
		System.out.print("두번째 숫자 : ");
		int secondNum = scan.nextInt();
		
		scan.skip("\r\n");
		
		System.out.print("연산자 : ");
		String operator = scan.nextLine();
		
		//System.out.println(operator);
		
		int changeOperator = (int)operator.charAt(0);
		
		if(changeOperator == 43) {
			//+ 43
			System.out.printf("%d + %d = %d", firstNum, secondNum, firstNum + secondNum);
		} else if(changeOperator == 45) {
			//- 45
			System.out.printf("%d - %d = %d", firstNum, secondNum, firstNum - secondNum);
		} else if(changeOperator == 42) {
			//* 42
			System.out.printf("%d * %d = %d", firstNum, secondNum, firstNum * secondNum);
		} else if(changeOperator == 47) {
			/// 47
			System.out.printf("%d / %d = %.1f", firstNum, secondNum, (double)firstNum / secondNum);
		} else if(changeOperator == 37) {
			//% 37
			System.out.printf("%d %% %d = %d", firstNum, secondNum, firstNum % secondNum);
		} else {
			System.out.println("연산이 불가능합니다.");
		}
		
	}
	
}
