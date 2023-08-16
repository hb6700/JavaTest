package com.test.question;

import java.util.Scanner;

public class Q002 {

	public static void main(String[] args) {
		
		/*
		2. 연산자 : 연산식
		요구사항 : 숫자 2개를 입력받아 아래의 연산식을 출력하시오.
		조건
		- 출력 숫자에 천단위 표기 하시오.
		- 결과값은 소수 이하 1자리까지 표기 하시오.
		*/	
		
		Scanner scan = new Scanner(System.in); 
		System.out.print("첫번째 숫자 : "); 
		double count1 = scan.nextDouble(); 
		System.out.print("두번째 숫자 : "); 
		double count2 = scan.nextDouble();
				 
		System.out.printf("%f + %f = %.1f\n", count1, count2, count1 + count2);
		System.out.printf("%f - %f = %.1f\n", count1, count2, count1 - count2);
		System.out.printf("%f * %f = %.1f\n", count1, count2, count1 * count2);
		System.out.printf("%f / %f = %.1f\n", count1, count2, count1 / count2);
		System.out.printf("%f %% %f = %.1f\n", count1, count2, count1 % count2);

	}
	
}
