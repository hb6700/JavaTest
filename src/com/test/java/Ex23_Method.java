//Ex23_Method.java
/*
***메소드 오버로딩(Method Overloading)***
같은 이름의 메소드를 여러개 만드는 기술
메소드의 인자 리스트를 다양한 형태로 구성해서, 같은 이름의 메소드를 여러 개 만드는 기술

메소드 오버로딩 구현 조건 가능
1. 매개변수의 개수
2. 매개변수의 자료형

메소드 오버로딩 구현 조건 불가능
1. 매개변수의 이름
2. 반환값의 자료형

메소드 오버로딩을 하는 이유
성능향상? X
개발자에게 도움 O 
메소드 이름을 여러개 외우지 않아도 된다는 장점

메소드를 여러개 선언할 예정...
1. public static void test() {}					//O
2. public static void test() {}					//X
3. public static void test(int n) {}			//O
4. public static void test(int m) {}			//X
5. public static void test(String s) {}			//O
6. public static void test(int n, int m) {}		//O
7. public static int test() {}					//X
	-> 호출) int result = test();
	-> 호출 시 test();먼저 실행하므로 1번과 구분 불가 -> error


메소드 호출하고 검증
test();			//1번메소드 호출
test(3);		//3번메소드 호출
test("5번");	//5번메소드 호출
test(6, 6);		//6번메소드 호출


*/

package com.test.java;

public class Ex23_Method {

	public static void main(String[] args) {
	
		drawLine();
		drawLine("*********************");
		
		System.out.println(100);
		System.out.println("문자열");
		
		
	}//main
	
	public static void println(int num) {
		
	}
	public static void println(String txt) {
		
	}
	
	
	//요구사항) 선을 그리는 메소드를 선언하시오
	public static void drawLine() {
		System.out.println("=====================");
	}
	
//	public static void drawLine() {
//		System.out.println("*********************");
//	}
	
	//메소드 오버로딩 : 같은 이름의 메소드 작성 후 인자생성(>..?)
	public static void drawLine(String s) {
		System.out.print(s);
		System.out.print(s);
		System.out.println();
	}
	
	public static void test() {
		
	}
	
	public static void test(int n) {
		
	}
	public static void test(String n) {
		
	}

	
}
