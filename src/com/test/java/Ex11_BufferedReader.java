package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ex11_BufferedReader {

	public static void main(String[] args) throws Exception {
		
		//Ex11_BurfferedReader.java
		//BufferedReader 클래스
		//int a
		//ctrl + shift + O ;
		//reader : 콘솔 입력 도구
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//System.out.println("문자 입력 : ");
		//int code = reader.read();
		//System.out.println(code);
		
		//String line = reader.readLine();
		//System.out.println(line);
				
		//readLine() : 입력버퍼에서 처음부터 ~ 엔터(\r\n)를 만나기 전까지 모두 읽어오는 메소드
		//엔터는 자동으로 삭제
//		System.out.print("이름 입력 : ");
//		String name = reader.readLine();
//		System.out.printf("안녕하세요 . %s님\n", name);
		
		/*
		 *  Wrapper Class(Utility Class)
		 *  원시형 데이터를 도와주는 기능을 제공하는 클래스
		byte -> Byte 클래스
	 	short -> Short 클래스
		***int -> Integer 클래스***
		***long -> Long 클래스***
		float -> Float 클래스
		***double -> Double 클래스***
		boolean -> Boolean 클래스
		char -> Character 클래스
		*/
		
//		System.out.print("숫자 입력 : ");
//		String num = reader.readLine();			//100 -> "100"
		
		//int num2 = Integer.parseInt(num);		//"100" -> 100
		//System.out.println(num2);				//100
		
//		double num3 = Double.parseDouble(num);
//		System.out.println(num3 * 2);				//100
		
		//System.out.println(num * 2);				//"홍길동" * 2 
		//System.out.printf("안녕하세요 . %s님\n", num);
		
		
		//요구사항) 숫자 2개 입력 -> 연산 + 연산 과정과 결과 모두 출력
		// 숫자1 : 5
		// 숫자2 : 3
		//-> 5 + 3 = 8  <<<으로 출력

//		System.out.print("첫번째 숫자 : ");
//		String input1 = reader.readLine();		//입력받은 값 -> 문자열 형태로 구성
//		System.out.print("두번째 숫자 : ");
//		String input2 = reader.readLine();		//입력받은 값 -> 문자열 형태로 구성
//		
//		int n1 = Integer.parseInt(input1);		//문자열값 -> 정수형으로 변경
//		int n2 = Integer.parseInt(input2);		//문자열값 -> 정수형으로 변경
//		System.out.printf("%d + %d = %d\n", n1, n2, n1+n2);
//		//System.out.println(input1 + "+" + input2 + "=" + (n1+n2));
		
		
		System.out.print("숫자 : ");
		String input = reader.readLine();
		int num = Integer.parseInt(input);
		//java.lang.ArithmeticException: / by zero
		//피제수/제수 -> 제수는 0이 될수 없다
		System.out.println(100 / num);	
		
		/*
		에러(Error) :  오류 버그(Bug), 예외(Exception) 등
		1. 컴파일에러
			- 컴파일 작업중에 발생하는 에러 : 컴파일러(javac.exe)가 알아냄 -> 문법이 틀려서
			- 에러 발생시 컴파일 작업 중단 -> 프로그램 생성 불가 -> 반드시 해결해야만 하는 오류
			- 이클립스 연동으로 빨간 밑줄이 발생
			- 에러 해결 난이도가 낮은 편 -> 오류 발견이 쉬움(컴파일러가 알려줌), 그만큼 고치기도 쉬움
			- 대부분 오타 때문에 발생
		2. 런타임에러
			- 런타임(Runtime) : 프로그램 실행중 -> 프로그램 동작중 발생하는 에러
			- 컴파일 작업중에는 에러가 발생하지 않음, 실행중에 발생하는 오류
			- 문법에는 오류가 없으나, 다른 여러가지 오류로 발생하는 에러
			- 예외(Exception)
			- 난이도 중간 -> 발견을 할수도 있고 못할수도 있음 -> 발견 못하면 조땜,
			- 충분히 사전에 테스트를 해야 오류를 방지할 수 있음
			- 게임 출시 -> 클로즈드알파, 클로즈드베타, 오픈알파, 오픈베타테스트
		3. 논리에러(Logical Error)
			- 컴파일도 성공하고 실행에도 오류는 없으나 결과가 이상함
			- 난이도 최상 : 발견하기도 어려우며 수정에서도 난항을 겪음
		*/
		
		
	}//main
	
}