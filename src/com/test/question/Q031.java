/*
31. 조건문 : 짝수 홀수
요구사항 : 숫자 5개를 입력받아 짝수와 홀수의 개수를 출력하시오.
*/
package com.test.question;

import java.util.Scanner;

public class Q031 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int firstNum = scan.nextInt();
		System.out.print("숫자입력 : ");
		int secondNum = scan.nextInt();
		System.out.print("숫자입력 : ");
		int thirdNum = scan.nextInt();
		System.out.print("숫자입력 : ");
		int fourthNum = scan.nextInt();
		System.out.print("숫자입력 : ");
		int fifthNum = scan.nextInt();
		
		//홀짝 개수 수량체크
		//홀수가 많을때, 짝수가 많을때
		//홀수(odd) 짝수(even)변수 생성하고 값 입력
		//출력
		
		int odd = 0;		//홀수 개수
		int even = 0;		//짝수 개수

		if(firstNum % 2 == 1) {
			++odd;
		} else {
			++even;
		}
		if(secondNum % 2 == 1) {
			++odd;
		} else {
			++even;
		}
		if(thirdNum % 2 == 1) {
			++odd;
		} else {
			++even;
		}
		if(fourthNum % 2 == 1) {
			++odd;
		} else {
			++even;
		}
		if(fifthNum % 2 == 1) {
			++odd;
		} else {
			++even;
		}
		
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n", even, odd);
		
		if(odd > even) {
			System.out.printf("홀수가 짝수보다 %d개 더 많습니다.\n", odd-even);
		} else if(even < odd) {
			System.out.printf("홀수가 짝수보다 %d개 더 많습니다.\n", even-odd);			
		}
		
		
		
	}//main
	
}
