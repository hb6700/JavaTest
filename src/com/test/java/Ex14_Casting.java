package com.test.java;

public class Ex14_Casting {
	
	public static void main(String[] args) {
		
		//Ex14_Casting.java
		
		//정수형 리터럴은 int이다
		//실수형 리터럴은 double이다
		
		//byte = int
		//작은형(1) = 큰형(4)
		byte b1 = 10;		//서비스문법
		
		//short = int
		//작은형(2) = 큰형(4)
		short s1 = 10;		//서비스문법...?
		
		//int = int
		int n1 = 10;
		
		//int = long
		//큰형(8) = 작은형(4)
		long l1 = 10;	//long l1 = (long)10;
		
		//float = double
		//작은형(4) = 큰 형(8)
		//float f1 = 3.14;
		float f1 = 3.14F;
		//float f1 = (float)3.14;
		
		//double = double
		double f2 = 3.14D;
		
		
		//==============================================================
		
		int n2 = 100;		//원본 4byte
		float n3;			//복사본 4byte
		
		//(암시적)형변환 발생 -> 안전함
		n3 = n2;
		System.out.println(n3);		//100.0
		
		int n4;				//복사본
		float n5 = 100;		//원본
		
		//형변환 
		//int = float
		//명시적 형변환
		n4 = (int)n5;
		System.out.println(n4);
		
		//*** 정수와 실수간의 크기 비교는 단순하게 byte로 하는게 아니라 실제 표현 가능한 숫자의 범위로 비교해야 한다.
		//int(4) < float(4)		//long(8) < double(8)
		//크기 정리
		//byte(1) < short(2) < int(4) < long(8) <<<<<<< float(4) < double(8)
		
		//char : 겉 보기에는 문자이나, 속으론 숫자 -> 프로그램 실행시 숫자 취급 
		char m1;		//2byte
		short m2;		//2byte
		
		m1 = '가';		//44032
		
		//형변환
		//short = char
		//2byte = 2byte
		m2 = (short)m1;
		
		System.out.println(m2);
		
		char m3;
		short m4;
		
		m4 = 65;		//44032

		//서로 자료형이 다르니 형변환 발생
		//char = short
		//2byte = 2byte
		m3 = (char)m4;
		System.out.println(m3);
		
		//short와 char
		
		int m5;
		char m6;
		
		m5 = 44032;
		System.out.println((char)m5);
		int m7;
		char m8;
		
		m8 = '가';
		System.out.println((int)m8);
		
		
		//***값형끼리 형 변환
		//***값형과 참조형끼리는 형변환이 절대 불가능
		//***boolean은 형변환 불가능
		//정수 > 정수
		//실수 > 정수
		//정수 > 실수
		//실수 > 정수
		//문자 > 정수
		//정수 > 문자
		
		//값형 <- (형변환O) -> 값형
		//값형 <- (형변환X) -> 참조형
		
		String a1 = "100";
		int a2;
		
		//"100" -> 100
		a2 = Integer.parseInt(a1);		//형변환(X)
		System.out.println(a2);

		//값형과 참조형은 이론상 불가능하지만 할 수는 있음.......ㅎㅎ....?
		
		//100 -> "100"
		String a3;
		int a4;
		
		a4 = 100;
		//	 String.valueOf(값형 데이터)
		a3 = String.valueOf(a4);		//100 > "100"
		a3 = a4 + ""; 					//100 + "" -> "100"
		
		
		
		
	}//main
	
}
