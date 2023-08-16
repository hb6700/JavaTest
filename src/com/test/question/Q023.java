/*
23. 날짜 시간 : 아빠와 딸
요구사항 : 아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력하시오.
*/
package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {
	
	public static void main(String[] args) {
		
		//입력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아빠 생일(년) : ");
		int fatherYear = scan.nextInt();
		System.out.print("아빠 생일(월) : ");
		int fatherMonth = scan.nextInt();
		System.out.print("아빠 생일(일) : ");
		int fatherDay = scan.nextInt();
		System.out.print("딸 생일(년) : ");
		int daughterYear = scan.nextInt();
		System.out.print("딸 생일(월) : ");
		int daughterMonth = scan.nextInt();
		System.out.print("딸 생일(일) : ");
		int daughterDay = scan.nextInt();
		
		scan.close();
		
		Calendar dad = Calendar.getInstance();
		dad.set(fatherYear, fatherMonth, fatherDay);
		long dadTick = dad.getTimeInMillis();

		Calendar daughter = Calendar.getInstance();
		daughter.set(daughterYear, daughterMonth, daughterDay);
		long daughterTick = daughter.getTimeInMillis();
		
		long gap = daughterTick - dadTick;
		
		System.out.printf("아빠는 딸보다 총 %d일 더 살았습니다.\n", (gap / 1000 / 60 / 60 / 24));
				
	}//main
	
}
