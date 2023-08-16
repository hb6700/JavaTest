/*
17. 메소드 오버로딩 : 직급
요구사항 : 인자로 받은 이름들을 직급 순으로 출력하는 메소드를 선언하시오.
조건 
사원 → 대리 → 과장 → 부장
void position(String)
void position(String, String)
void position(String, String, String)
void position(String, String, String, String)
*/
package com.test.question;

import java.util.Scanner;

public class Q017 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("사원 성함 : ");
		String a = scan.nextLine();
		System.out.printf("대리 성함 : ");
		String b = scan.nextLine();
		System.out.printf("과장 성함 : ");
		String c = scan.nextLine();
		System.out.printf("부장 성함 : ");
		String d = scan.nextLine();
		
		position(a);
		position(a, b);
		position(a, b, c);
		position(a, b, c, d);
		
	}//main
	
	public static void position(String a) {
		System.out.printf("\n사원 : %s\n", a);
		System.out.println();
	}
	public static void position(String a, String b) {
		System.out.printf("사원 : %s\n", a);
		System.out.printf("대리 : %s\n", b);
		System.out.println();
	}
	public static void position(String a, String b, String c) {
		System.out.printf("사원 : %s\n", a);
		System.out.printf("대리 : %s\n", b);
		System.out.printf("과장 : %s\n", c);
		System.out.println();
	}
	public static void position(String a, String b, String c, String d) {
		System.out.printf("사원 : %s\n", a);
		System.out.printf("대리 : %s\n", b);
		System.out.printf("과장 : %s\n", c);
		System.out.printf("부장 : %s\n", d);
		System.out.println();
	}
	
}
