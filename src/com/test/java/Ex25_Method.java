//Ex25_Method.java
/*
재귀 메소드(Recursive Method)
메소드 구현부에서 자기 자신을 호출하는 메소드
구조가 햇갈림ㅜㅜ
파일 디렉토리 구조에서 사용됨

예제)
팩토리얼
4! = 4 * 3 * 2 * 1 = 24
*/

package com.test.java;

public class Ex25_Method {

	public static void main(String[] args) {
		
		//m1();
		
		int n = 4;
		int result = m2(n);
		System.out.println(result);
		
		//팩토리얼 메인
		n = 4;
		result = factorial(n);
		System.out.printf("%d! = %d\n", n, result);
		
	}//main
	
	//재귀 메소드
	public static void m1() {
		System.out.println("m1");
		m1();			//자기자신 -> 재귀호출(Recursive Call)
	}
	
	public static int m2(int n) {
		System.out.println("n : "+ n);
		int result = (n == 1) ? 1 : m2(n - 1);
		return result;
	}
	
	//팩토리얼 예제
	private static int factorial(int n) {	
		return (n == 1) ? 1 : n * factorial(n-1);
	}	
	
}
