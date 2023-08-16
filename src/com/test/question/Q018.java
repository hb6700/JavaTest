/*
18. 메소드 오버로딩 : 양수 개수
요구사항 : 인자로 받은 숫자들 중 양수의 갯수를 반환하는 메소드를 선언하시오.
조건
int positive(int)
int positive(int, int)
int positive(int, int, int)
int positive(int, int, int, int)
int positive(int, int, int, int, int)
*/
package com.test.question;

//import java.util.Scanner;

public class Q018 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		int a = scan.nextInt();
//		System.out.print("숫자를 입력하세요 : ");
//		int b = scan.nextInt();
//		System.out.print("숫자를 입력하세요 : ");
//		int c = scan.nextInt();
//		System.out.print("숫자를 입력하세요 : ");
//		int d = scan.nextInt();
//		System.out.print("숫자를 입력하세요 : ");
//		int e = scan.nextInt();
		
		int count;
		count = positive(10);
		System.out.printf("양수 : %d\n", count);
		count = positive(10, 20);
		System.out.printf("양수 : %d\n", count);
		count = positive(10, 20, -30);
		System.out.printf("양수 : %d\n", count);
		count = positive(10, 20, -30, 40);
		System.out.printf("양수 : %d\n", count);
		count = positive(10, 20, -30, 40, 50);
		System.out.printf("양수 : %d\n", count);
				
	}//main
	
	public static int positive(int a) {
		int count = 0;
		count = a>0 ? count + 1 : count;
		return count;
	}
	public static int positive(int a, int b) {
		int count = 0;
		count = a>0 ? count + 1 : count;
		count = b>0 ? count + 1 : count;
		return count;
	}
	public static int positive(int a, int b, int c) {
		int count = 0;
		count = a>0 ? count + 1 : count;
		count = b>0 ? count + 1 : count;
		count = c>0 ? count + 1 : count;
		return count;
	}
	public static int positive(int a, int b, int c, int d) {
		int count = 0;
		count = a>0 ? count + 1 : count;
		count = b>0 ? count + 1 : count;
		count = c>0 ? count + 1 : count;
		count = d>0 ? count + 1 : count;
		return count;
	}
	public static int positive(int a, int b, int c, int d, int e) {
		int count = 0;
		count = a>0 ? count + 1 : count;
		count = b>0 ? count + 1 : count;
		count = c>0 ? count + 1 : count;
		count = d>0 ? count + 1 : count;
		count = e>0 ? count + 1 : count;
		return count;
	}
	
}
