/*
6. 연산자 : 세금계산
요구사항
- 사용자의 한달 수입을 입력받아 세후 금액을 출력하시오
조건
- 세금: 수입의 3.3%
*/
package com.test.question;

import java.util.Scanner;

public class Q006 {

	public static void main(String[] args) {
		
		//입력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("한달 수입 금액(원) : ");
		int salary = scan.nextInt();
		
		//세금 계산(3.3% -> 실수 계산)
		double tax;
		double afterTax;
		
		//세금 계산
		tax = salary * 3.3 / 100;
		
		//세후금액 계산(수입금액 - 세금)
		afterTax = salary - tax;
		
		System.out.printf("세금(원) : %,.0f(원)\n", tax);
		System.out.printf("세후 금액(원) : %,.0f(원)\n", afterTax);
	
	}
	
}
