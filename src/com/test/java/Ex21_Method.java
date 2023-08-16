package com.test.java;

public class Ex21_Method {

	public static void main(String[] args) {
		
		//Ex21_Method.java
		/*
		//public static void hello(String name){}
		메소드 반환값(리턴값) : void
		- 메소드가 실행 후 호출한 곳으로 돌려주는 값
		*/
		
		getNum();
		System.out.println(getNum());
		String result = getName("홍길동");
		System.out.println(result);
		
	}//main
	
	public static int getNum() {
		//void 대신 다른 자료형을 쓰면 -> //This method must return a result of type int 에러
		//int <-> return값 자료형 일치해야함 
		//int 값 우선
		/*
		***return문의 역할***
		- 메소드 종료
		- 값을 반환
		*/
		return 100; 
		//Unreachable code, return문 다음에는 문장이 올 수 없음.
		//System.out.println("테스트");
	}
	
	public static String getName(String name) {
		
		return "고객명 : " + name;
		
	}
	
}
