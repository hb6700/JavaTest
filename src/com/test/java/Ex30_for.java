/*
Ex30_for.java
ctrl + shift + f(포멧 맞추는 기능)
*/
package com.test.java;

import java.util.Scanner;

public class Ex30_for {

	public static void main(String[] args) {
		
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
		
		//Q039();
		//Q041();
		//Q042();
		//Q043();
	}

	private static void m5() {
		//별찍기
		for(int i=0 ; i<5 ; i++){			//형만들기
			for (int j=0 ; j<5 ; j++){		//열만들기
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0 ; i<5 ; i++){			//형만들기
			for (int j=i ; j<5 ; j++){		//열만들기
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();		

		for(int i=0 ; i<5 ; i++){			//형만들기
			for (int j=0 ; j<i ; j++){		//열만들기
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();		
	}
	

	private static void Q043() {
		Scanner scan = new Scanner(System.in);
		//System.out.print("숫자 입력 : ");
		//int num = scan.nextInt();
		int sum = 0;
		int oddSum = 0, evenSum = 0;
		int num = 273645281;

		for (;;) {
//			System.out.println(num % 10);
			if (num % 10 % 2 == 0) {
				evenSum += num % 10;
			} else {
				oddSum += num % 10;
			}
			sum += num % 10;
			num = num / 10;
			
			if(num == 0) {
				break;
			} 
		}
		System.out.println(oddSum);
		System.out.println(evenSum);
		System.out.println(sum);
		
	}

	private static void Q042() {
		// TODO Auto-generated method stub
		int year = 2023;
		int month = 7;
		int date = 25;
		
		int sum = 0;		//누적변수(총 일수)
		String day = "";	//요일
		
		//1. 서기 1년 1월 1일 ~ 2022년 12월 31일까지
		for(int i=1 ; i<year ; i++) {
			sum += 365;
			if(isLeafYear(i)) {			//윤년인 경우에만 1을 더해주는 작업을 하는 부분
				sum++; //
			}
		}
		
		//2. 2023년 1월 1일부터 지난달(6월 30일)까지
		for (int i=1 ; i<month ; i++) {
			sum += getMaxDate(year, i);
		}
		
		//3. 2023년 7월 1일부터 오늘(25일)까지의 일수 계산
		sum += date;
		
		//4. 요일 구하는 법
		//원하는 날짜의 요일 
		//기준일, 1970년 1월 1일, 서기 1년 1월 1일  : 월요일 > 기준점이 필요
		day = getDay(sum);
		
		System.out.printf("%d년 %d월 %d일은 %,d일째 되는 날이고 %s요일입니다 \n", year, month, date, sum, day);
	}

	// 요일 계산 메소드
	private static String getDay(int sum) {
		if (sum % 7 == 1) {
			return "월";
		}else if(sum % 7 == 2) {
			return "화";
		}else if(sum % 7 == 3) {
			return "수";
		}else if(sum % 7 == 4) {
			return "목";
		}else if(sum % 7 == 5) {
			return "금";
		}else if(sum % 7 == 6) {
			return "토";
		}else if(sum % 7 == 0) {
			return "일";
		}
		return null;
	}

	//올해 년도 계산
	private static int getMaxDate(int year, int month) {
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				return 31;
			case 4: case 6: case 9: case 11:
				return 30;
			case 2:
				return isLeafYear(year) ? 29 : 28;
				
		}
		return 0;
	}
	
	//메소드 패턴 
	//1. setXXXX : 
	//2. getXXXX : 
	//3. isXXXXX : 값을 boolean값으로
	private static boolean isLeafYear(int year) {
		if (year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			}else {
				return true;
			}
		}else {
			return false;
		}
	}

	
	
	
	//Q041
	private static void Q041() {
		int sum = 0;
		for (int i=1 ;  ; i++) {
			sum += i;
			System.out.printf("%d + ", i);
			if(sum > 1000) {
				break;
			}
		}
		System.out.println();
		
	}

	//Q039
	private static void Q039() {
		Scanner scan = new Scanner(System.in);
		int begin = 0 , end = 0;
		int sum = 0;		//누적변수
		System.out.print("시작숫자 : ");
		begin = scan.nextInt();
		System.out.print("종료숫자 : ");
		end = scan.nextInt();
		
		for(int i=begin ; i<=end ; i++) {
			sum += i;
			System.out.printf("%d + ", i);
		}
		//1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + =55
		System.out.println("\b\b=" + sum);
	}

	private static void m4() {
		//루프 분기문 개입 (break, continue)
		for(int i=10 ; i<30 ; i++) {
			for (int j=0 ; j<10 ; j++) {
				//if(i == 5) {
				if(j == 5) {	
					break;			//자신이 포함된 모든 제어문을 탈출하다
				}
				System.out.printf("%d x %d \n", i, j);
			}
		}
		
	}

	private static void m3() {
		//강의실 6개
		//학생수 30명
		for(int i=1 ; i<=6 ; i++) {					//강의실
			for(int j=0 ; j<=30 ; j++) {			//학생
				System.out.printf("%d강의실 %d번 학생\n", i, j);
			}
		}
		
	}

	private static void m2() {
		//구구단 2단 ~ 9단
		for(int j=2 ; j<=9 ; j++) {
			for(int i=1 ; i<=9 ; i++) {
				System.out.printf("%d x %d = %2d\n",j, i, j*i);
			}
			System.out.println();
		}
		
	}

	private static void m1() {
		//중첩된 반복문
		//모든 제어문끼리는 중첩이 가능함
		
		//3중 for문
		for(int i= 1; i<10 ; i++) {
			for(int j=1; j<10 ; j++) {
				for(int k= 8; k<10 ; k++) {
					//실행믄
					System.out.printf("i : %d, j : %d\n", i, j, k);
				}
			}
		}
		
		//2중 for문
		for(int i=0 ; i<10 ; i++) {
			for(int j=0 ; j<10 ; j++) {
				//System.out.println("실행문");	//10번
				System.out.printf("i : %d, j : %d\n", i, j);
			}//for			
		}//for
		
	}
	
	//K&R >eclipse
	public static void test() {
		
	}
	
	//Allman
	public static void test2() 
	{
		
	}
	
}
