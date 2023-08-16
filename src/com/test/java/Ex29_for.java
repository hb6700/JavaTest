/*
Ex29_for.java
제어문 > 조건문 
제어문 > 반복문

반복문 : 특정 코드를 개발자가 원하는 횟수만큼 반복 제어
- 생산성 향상 + 유지보수성 향상

for문 : 
for(초기식; 조건식; 증감식){
	문장;
}

//		for(int i=1 ; i<=5; i++) {			
//			//1. int i = 1
//			//2. i<=5
//			//3. 블럭(문장) 실행
//			//4. }를 만나면 다시 증감식으로 돌아감
//			//5. i <=5
//			//6. 블럭문장 실행
//			//7. 
//			//8. 
//			//9. 블럭 문장 종료
//					
//			//System.out.println("안녕하세요");			
//		}

*/
package com.test.java;

import java.util.Scanner;

public class Ex29_for {
	
	public static void main(String[] args) {
		//m1();
		//hello();

		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		//m13();
		//m14();
		m15();
				
	}//main

	private static void m15() {
		//난수 만들기 : 임의의 수(random)
		//1. math 클래스 : 대중화 방법(다른언어에서도 사용)
		//2. random 클래스 : 자바에서만 사용가능함
		System.out.println(3.14);
		System.out.println(Math.PI);
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		System.out.println();
		
		//returns a double value with a positive sign, greaterthan or equal to 0.0 and less than 1.0
		//0.0~0.999999999999
		
		for(int i=0; i<10 ; i++) {
			//System.out.println(Math.random());		
			//0~9사이 난수
			//System.out.println((int)(Math.random()*10));
			//1~10사이 난수
			//System.out.println((int)(Math.random()*10)+1);
			//0~3사이 난수 + 4 = 4~7사이 난수
			System.out.println((int)(Math.random()*4)+4);
		}
	}

	private static void m14() {
		//빈 리턴문
		//값을 반환하는 목적이 아니라 메소드를 중단하는 역할만 한다.
		return;
	}

	public static int m13() {
		//This method must return a result of type int
		//모든 경우의 수 반드시 return문이 존재
		int num = 10;
		if (num % 2 == 0){
		return 10;
		} else {
			return 0;
		}
	}
	
	public static int m12() {
		return 10;
	}
	
	private static void m11() {
		//사용자 숫자 입력 > 입력받은 숫자 누적 : 입력횟수? , m6()
		//추가사항ㅣ, 올수만 입력
		
		int sum = 0;
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		
		//회전수를 예측하기 힘들 때 : 무한루프 사요
		for(;;) {
			System.out.print("숫자");
			num = scan.nextInt();
			
			if(num % 2 == 0) {
				break;
				//return;
			}
			
			sum += num;
		}
		System.out.println(num);
		
	}//m11

	private static void m10() {
		//학교 담임 선생님의 학생 상담, 1~30번
		for(int i = 1 ; i<=30; i++) {
			
			//i번 부터 all stop
//			if(i == 16) {
//				break;
//			}
			
			//i번만 제외
			if(i == 10 || i == 15) {
				continue;
			}
			System.out.printf("%d번 학생 상담증..\n", i);
		}
		
	}

	private static void m9() {
		//break, continue > 독립적 사용 불가 > 다른 제어문과 함께 사용
		//break : 자신이 속한 제어문을 탈출(if문 예외, 인식 불가)
		//continue : 실행시 제어문의 시작으로 이동(처음으로 돌아가세요)
		for(int i=1 ; i<= 10 ; i++) {
			if(i == 5) {
				//break;
				continue;
			}
			System.out.println(i);
		}
		
	}

	private static void m8() {
		//무한루프
		//1. 사용자 실수 : 수정
		//2. 사용자 의도  : 어떻게?
		//for(초기식 ; 조건식(true) ; 증감식) > 무한루프
		
//		for (int i = 0 ;  ; i++) {
//			System.out.println(i);
//		}
//		for (;;) {
//			System.out.println("반복문");
//		}
		
	}

	private static void m7() {
		//요구사항)구구단 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("단 : ");
		int dan = scan.nextInt();
		
		for (int i = 1 ; i <= 9 ; i++) {
			System.out.printf("%d + %d = %2d\n", dan, i, dan*i);
		}
	}

	private static void m6() {
		//요구사항) 사용자로부터 숫자 10개를 입력해 누적
		Scanner scan = new Scanner(System.in);
		int sum= 0;
		for (int i = 0 ; i <= 10 ; i++) {
			
			System.out.print("숫자 : ");
			int num = scan.nextInt();
			sum = sum + num;
		}
		
	}

	private static void m5() {
		//요구사항) 1~사용자가 원하는 숫자까지의 합
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = scan.nextInt();
		int sum = 0;	//누적변수
		
		//몇회전 : 컴파일X, 런타입O
		for (int i = 1 ; i<=num ; i++) {
			sum += i;
		}
		System.out.printf("1 ~ %d = %d\n", num, sum);
		
	}

	private static void m4() {
		//요구사항) 1~10까지의 합
		int sum = 0;
		for (int i = 1 ; i <= 10 ; i++) {
			//누적하기  : 누적변수, 초기화 필수
			sum = sum+i;
		}
		System.out.println(sum);
		
	}//m4

	private static void m3() {
		//반복문 : 루프변수
		//2. 루프변수의 역할 : 회전수 or 값
		
		//요구사항) 숫자 1~10까지 출력
		for(int i = 1 ; i <=10 ; i++) {
			System.out.println(i);
		}
		int num = 1;
		for (int i=0 ; i<10 ; i++) {
			System.out.println(num);
			num++;
		}
		
		
	}

	private static void m2() {
		//반복문 : 회전수
		//1. 반복문의 실행 횟수를 내가 제어할 수 있는지
		
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println("실행문");
		}System.out.println();
		for(int i = 5 ; i <= 9 ; i++) {
			System.out.println("실행문");
		}System.out.println();
		for(int i = 1 ; i <= 5 ; i = i+2) {
			System.out.println("실행문");
		}System.out.println();
		for(int i = 5 ; i > 0 ; i--) {
			System.out.println("실행문");
		}System.out.println();
	}

	private static void m1() {
		//요구사항) "안녕하세요" * 5회 출력
		//case1.
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");

	}//m1
	
	public static void hello() {
		System.out.println("안녕하세요.");
	}//hello
	
	
	
	
}
