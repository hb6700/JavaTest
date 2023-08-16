package com.test.java;

public class Ex13_Casting {

	public static void main(String[] args) {
		
		//Ex13_Casting.java
		/*
		형 변환, (자료)형 변환
		- casting, DataType Casting
		- 하나의 자료형을 또 다른 자료형으로 변환하는 작업
		- int -> double / float -> short 등등...
		- 하는 이유 : 코드 작성을 유연하게 하기 위해서 사용 -> 소스를 더 편안하게 짤 수 있음
		
		1. 암시적 형변환(자동 타입 변환)
		- 큰형(복사본) = 작은형(원본)
		- 100% 안전한 작업 : 복사를 했을 때 원본과 항상 동일한 값 복사
		2. 명시적 형변환(강제 타입 변환)
		- 작은형(복사본) = 큰형(원본)
		- 경우에 따라 다름 -> 늘 신경써서 관리해야 할 필요성
		
		명시적 형변환 시 발생하는 데이터가 넘치는 현상 :  오버플로우(Overflow)
		1. 위로 넘치는 현상 > Overflow
		2. 아래로 넘치는 현상 > Underflow
		
		*** 오버플로우가 발생할 만한 상황을 미리 예측해서 관리가 필요함
		
		*/
		
		//1
		byte a;		//원본
		short b;	//복사본
		
		//a = 10;
		//a= Byte.MAX_VALUE;
		a= Byte.MIN_VALUE;
		//short(2) = byte(1) -> 암시적 형변환
		//(자료형) :  형변환 연산자
		//b = a;		//복사		
		b = (short)a;	//원래 형태, (short)안써도 되지만 안써도 java가 알아서 써서 동작실행
		System.out.println(b);
		
		
		byte c = 10;
		long d;
		//암시적 형변환
		//큰형(8) = 작은형(1)
		d = c;		//d = (long)c;
		System.out.println(d);
		
		
		short e;		//원본
		byte f;			//복사본
		
		e = 1000;
		//명시적 형변환
		//작은형(1) <- 큰형(2)
		f = (byte)e;		//(byte)필수
		
		System.out.println(f);
		
		//은행계좌
		int g;		//복사본
		long h;		//원본
		
		h = 3000000000L;
		//복사(계좌이체)
		g = (int)h;
		
		System.out.println("이체 결과 : " + g);
		
		
		
		
		
		
	}//main
	
}
