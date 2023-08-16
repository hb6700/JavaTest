package com.test.java;

public class Ex10_Input {

	public static void main(String[] args) throws Exception {
		//Ex10_Input.java
		/*
		콘솔출력 : 모니터
		1. System.out.print();
		2. System.out.println();
		3. System.out.printf();
		
		콘솔입력 : 키보드
		1. System.in.read();	//불편함
		2. BufferedReader 클래스
		3. Scanner 클래스
		*/
		
		//요구사항) 사용자에게 문자 1개를 입력받아 화면에 출력하시오.
		//1. 안내메시지 출력
		//2. 키 입력
		//3. 키를 화면에 출력
		
		System.out.print("문자입력 : ");
		//입력 대기상태 -> 블럭 걸렸다. / 사용자의 키 입력을 기다리고 있는 중.
		//콘솔 특성 - 키 입력완료로 엔터(enter)사용
		//read()메소드 1회에 문자1개만 입력
		int code = System.in.read();				//문자코드로 입력
		System.out.println("출력 : " + code);		//문자코드 그대로 출력
		System.out.printf("출력 : %c\n", code);		//사용자가 알아볼 수 있는 원래 글자로 출력
		
		code = System.in.read();					//문자코드로 입력
		System.out.println("출력 : " + code);		//문자코드 그대로 출력
		System.out.printf("출력 : %c\n", code);		//사용자가 알아볼 수 있는 원래 글자로 출력
		
		code = System.in.read();					//문자코드로 입력
		System.out.println("출력 : " + code);		//문자코드 그대로 출력
		System.out.printf("출력 : %c\n", code);		//사용자가 알아볼 수 있는 원래 글자로 출력

		code = System.in.read();					//문자코드로 입력
		System.out.println("출력 : " + code);		//문자코드 그대로 출력
		System.out.printf("출력 : %c\n", code);		//사용자가 알아볼 수 있는 원래 글자로 출력
		
		System.out.println("프로그램 종료!");
		
		
		
	}
	
}
