/*
16. 메소드 오버로딩 : 숫자 합
요구사항 : 인자로 받은 숫자들의 합을 구하는 메소드를 선언하시오.
조건
void sum(int)
void sum(int, int)
void sum(int, int, int)
void sum(int, int, int, int)
void sum(int, int, int, int, int)
*/
package com.test.question;

import java.util.Scanner;

public class Q016 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("첫번째 값 : ");
		int a = scan.nextInt();
		System.out.printf("두번째 값 : ");
		int b = scan.nextInt();
		System.out.printf("세번째 값 : ");
		int c = scan.nextInt();
		System.out.printf("네번째 값 : ");
		int d = scan.nextInt();
		System.out.printf("다섯번째 값 : ");
		int e = scan.nextInt();
		
		sum(a);
		sum(a, b);
		sum(a, b, c);
		sum(a, b, c, d);
		sum(a, b, c, d, e);
		
	}//main
	
	public static void sum(int a) {
		System.out.printf("%d = %d\n", a, a);
	}
	public static void sum(int a, int b) {
		System.out.printf("%d + %d = %d\n", a, b, a + b);		
	}
	public static void sum(int a, int b, int c) {
		System.out.printf("%d + %d + %d = %d\n", a, b, c, a + b + c);		
	}
	public static void sum(int a, int b, int c, int d) {
		System.out.printf("%d + %d + %d + %d = %d\n", a, b, c, d, a + b + c + d);		
	}
	public static void sum(int a, int b, int c, int d, int e) {
		System.out.printf("%d + %d + %d + %d + %d = %d\n", a, b, c, d, e, a + b + c + d + e);		
	}
	
}
