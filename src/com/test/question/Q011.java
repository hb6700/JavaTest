package com.test.question;

import java.util.Scanner;

public class Q011 {

	public static void main(String[] args) {
		/*
		11. 메소드 : 연산식
		요구사항 : 숫자를 2개 입력받아 연산식을 반환하는 메소드를 선언하시오.
		조건
		String add(int, int)
		String subtract(int, int)
		String multiply(int, int)
		String divide(int, int)
		String mod(int, int)
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int n1 = scan.nextInt();
		System.out.print("두번째 숫자 : ");
		int n2 = scan.nextInt();
				
		String add = add(n1, n2);
		String subtract = subtract(n1, n2);
		String multiply = multiply(n1, n2);
		String divide = divide(n1, n2);
		String mod = mod(n1, n2);
		System.out.printf("%d + %d = %s\n", n1, n2, add);
		System.out.printf("%d - %d = %s\n", n1, n2, subtract);
		System.out.printf("%d * %d = %s\n", n1, n2, multiply);
		System.out.printf("%d / %d = %s\n", n1, n2, divide);
		System.out.printf("%d %% %d = %s\n", n1, n2, mod);
		
	}//main
	
	public static String add(int n1, int n2) {
		int n3 = n1 + n2;
		String add = String.valueOf(n3);
		return add;
	}
	public static String subtract(int n1, int n2) {
		int n3 = n1 - n2;
		String subtract = String.valueOf(n3);
		return subtract;
	}
	public static String multiply(int n1, int n2) {
		int n3 = n1 * n2;
		String multiply = String.valueOf(n3);
		return multiply;
	}
	public static String divide(int n1, int n2) {
		double n3 = n1 / n2;
		String divide = String.valueOf(n3);
		return divide;
	}
	public static String mod(int n1, int n2) {
		int n3 = n1 % n2;
		String mod = String.valueOf(n3);
		return mod;
	}
}
