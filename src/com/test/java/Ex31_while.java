/*
Ex31_while.java
반복문 
1. for문
2. while문
3. do while문
4. for문(기존과는 다른)

- while문
while(조건식){
	문장;
}
-> 조건식을 실행하고 조건식이 참일 경우 안의 문장을 실행하고 다시 조건식으로 돌아가서 동작을 반복하는 제어문
vs
if(조건식){
	문장;
}
-> 조건식이 참일경우 실행하고 종료(while문과의 차이점)

- do while문
do
{
	문장;
}
while(조건식);
-> 무조건 조건실행, 그 이후 조건식을 만나서 반복 / 문장시작 전에 do, while문 마지막에 문장종결자(세미콜론) 필수
*/
package com.test.java;

import java.util.Scanner;

public class Ex31_while {

	public static void main(String[] args) {
		
		//m1();
		//m2();
		//m3();
		m4();
		
	}//main

	//콘솔 -> UI : 자판기
	private static void m4() {
		//1. 메뉴 출력
		//2. 사용자 선택
		//3. 결과출력
		//4. 반복
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : \n");
		int sel = 0;					//사용자 선택 메뉴 변호
		boolean loop = true;			//반복 조건 > 루프 번호
		
		while(loop) {
			menu();
			
			sel = scan.nextInt();
			scan.skip("\r\n");
			
			if(sel == 1) {
				m1(scan);
			}else if(sel == 2) {
				m2(scan);
			}else if(sel == 3) {
				m3(scan);
			}else {
				//루프 종료
				loop = false;
			}
		}//while
	}

	private static void m3(Scanner scan) {
		System.out.println("커피");
		pause(scan);
	}

	private static void m2(Scanner scan) {
		System.out.println("사이다");
		pause(scan);
	}

	private static void m1(Scanner scan) {
		System.out.println("콜라");
		pause(scan);
	}
	
	//자판기 디자인
	private static void menu() {
		System.out.println("======================");
		System.out.println("========자판기========");
		System.out.println("======================");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 커피");
		System.out.println("4. 종료");
		System.out.println("======================");
		System.out.print("선택(번호) : ");
	}
	
	//프로그램 입력후 대기
	private static void pause(Scanner scan) {
		//프로그램을 잠시 중단(콘솔 버전) > 블럭
		System.out.println("계속하려면 엔터를 입력하세요.");
		scan.nextLine();
	}
	
	

	//m3 : 1부터 100까지 누적하시오(for vs while)
	private static void m3() {
		
		//for문으로 실행
		int sum = 0;
		for(int i=1 ; i<=10 ; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//while 문으로 실행
		sum = 0;
		int num = 1;
		while(num <=10) {
			sum += num;
			num++;
		}
		System.out.println(sum);
	}

	//while vs do while
	private static void m2() {
		//변수 초기화
		int num = 1;
		
		//while문
		while(num<=10) {
			System.out.println(num);
			num++;
		}
		System.out.println();
		
		//do while문
		num = 1;
		do {
			System.out.println(num);
			num++;
		}while(num<=10);
	}

	//요구사항1) 1~10까지 출력하시오
	private static void m1() {
		for(int i=1 ; i<=10 ; i++) {		//초기식;조건식;증감식
			System.out.println(i);
		}
		System.out.println();
		
		int num = 1;						//초기식
		while(num<=10) {					//조건식
			System.out.println(num);
			num++;							//증감식
		}
	}//m1
}
