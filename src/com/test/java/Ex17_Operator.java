package com.test.java;

import java.util.Scanner;

public class Ex17_Operator {

	public static void main(String[] args) {
		
		//Ex17_Operator.java
		/*
		논리 연산자 : 피연산자를 대상으로 정해진 규칙에 따라 연산 결과를 반환
		&&(and) ||(or) !(not) ^(xor)
		2항연산자 : && || ^
		1항연산자 : !
		- 피연산자의 자료형이 boolean이다.
		- 연산의 결과가 boolean이다
		
		예시)
		소개팅 : 남자 소개 - 조건
		1. 키 180cm 이상
		2. 잘생김
		
		//논리곱
		A && B = ? -> A(T/F), B(T/F)
		T && T = T
		T && F = F
		F && T = F
		F && F = F
				
		//논리합
		A || B = ? -> A(T/F), B(T/F)
		T || T = T
		T || F = T
		F || T = T
		F || F = F
		
		//부정 : 논리를 반대로 뒤집기
		!A = ?
		!T = F
		!F = T
		
		//XOR(베타적논리합) 
		A ^ B = ?
		T ^ T = F
		T ^ F = T
		F ^ T = T
		F ^ F = F		
		*/
		
		//사용X
		System.out.println(true && true);
		
		//사용 예시
		int age = 20;
		System.out.println((age > 19) && (age < 60));
		
		/*
		대입 연산자
		= 
		+= -= *= /= %= : 복합 대입 연산자
		- LValue(변수) = RValue(상수, 변수)
		- LValue와 RValue의 자료형은 반드시 동일해야한다. 일치하지 않으면 형변환 필요
		- 대입연산자는 모든 연산자들 중 우선순위가 가장 낮음
		
		
		연산자 우선순위
		산술연산자((* /) -> (+ -)) -> 비교 -> 논리 -> 대입 
		
		연산자 연산 방향
		대입, 증감 : 오른쪽 -> 왼쪽
		나머지 : 왼쪽 -> 오른쪽
		*/
		
		int sum = 10 + 20 * 3;
		System.out.println(sum);
		
		int a1 = 10;
		int a2;
		int a3;
		
		a3 = a2 = a1;
		
		
		//복합대입연산자
		int n = 10;
		
		//요구사항) 기존 n에 1을 추가하기 : 누적(***)
		n = n + 1;
		System.out.println(n);		//11
		
		n += 1;
		System.out.println(n);		//12
		
		n += 5;
		System.out.println(n);		//17
		
		n = n - 2;
		System.out.println(n);		//15
		
		n -= 2;
		System.out.println(n);		//13
		
		n = n * 2;
		System.out.println(n);		//26
		
		n *= 2;
		System.out.println(n);		//52

		n = n / 5;
		System.out.println(n);		//10
		
		n /= 5;
		System.out.println(n);		//2
		
		n = n * 5;
		n = n % 3;
		System.out.println(n);		//1
		
		n %= 3;
		System.out.println(n);		//1
		
		/*
		증감연산자
		++(증가), --(감소)
		1항연산자
		피연산자는 숫자형을 가진다.
		누적연산을 함.(기존의 값에 1을 더하거나 1을 빼는 작업만 가능)
		
		*** 연산자의 위치를 바꿀 수 있다.
		1. ++n, --n : 전위 배치(전치) : 연산자 우선순위가 제일 높음(괄호 바로 다음으로 실행)
		2. n++, n-- : 후위 배치(후치) : 연산자 우선순위가 제일 낮음(대입연산자 다음에 실행)
		
		*** 증감연산자를 다른 연산자와 한 문장에서 사용하지 말 것.
		
		*/
		
		n = 10;
		n = n + 1;					//11
		n += 1;						//12
		++n;						//13
		System.out.println(n);		//13
		n = n - 1;					//12
		n -= 1;						//11
		--n;						//10
		System.out.println(n);		//10
		
		n = 10;
		
		//전치
		++n;
		System.out.println(n);		//11
		//후치
		n++;
		System.out.println(n);		//12
		System.out.println();
		
		
		n = 10;
		int result = 0;
		result = 10 + ++n;
		System.out.println(result);		//21
		
		n = 10;
		result = 0;
		result = 10 + n++;
		System.out.println(result);		//20
		System.out.println(n);			//11
		
		n = 10;
		result = 0;
		++n;
		result = 10 + n;
		
		n = 10;
		result = 0;
		result = 10 + n;
		n++;
		
		int o = 10;
		System.out.println(--o-o--);		//0
		System.out.println();
		
		
		/*
		조건연산자 
		?:
		A ? B : C
		(유일한)3항 연산자
		A : boolean
		B, C : 상수, 변수 -> 데이터
		A조건이 참이면 B를 돌려주고, A조건이 거짓이면 C를 돌려줌
		*/
		
		boolean flag = true;		//or false
		String m1 = "참";
		String m2 = "거짓";
		
		String result2 = flag ? m1 : m2;
		System.out.println(result2);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("나이 : ");
		age = scan.nextInt();
		
		//19세 이상 60세 미만 -> 통과 or 거절
		result2 = (age >= 19 && age <= 60) ? "통과" : "거절";
		System.out.printf("입력한 나이(%d세)는 %s입니다. \n", age, result2);
		
		//3항연산자 -> if문 사용

		//비트 연산자
		int a = 10;		//1010
		int b = 3;		//0011
		//각 비트단위로 연산
		System.out.println(a & b);	//and, 2
		System.out.println(a | b);	//or, 11
		
		
	}//main
	
}
