/*
34. 조건문 : 날짜 계산
요구사항 : 날짜를 입력받아 아래의 조건에 맞게 결과를 출력하시오.
조건 
입력받은 날짜가 평일이면 해당 주의 토요일을 알아낸다.
입력받은 날짜가 토/일요일이면 아무것도 안한다.
*/
package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q034 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("년 : ");
		int year = scan.nextInt();
		System.out.print("월 : ");
		int month = scan.nextInt();
		System.out.print("일 : ");
		int day = scan.nextInt();
		
		Calendar date = Calendar.getInstance();
		date.set(date.YEAR, year);
		date.set(date.MONTH, month-1);
		date.set(date.DATE, day);
		
		//test
		//System.out.printf("%tF\n", date);
		//System.out.println(date.get(Calendar.DAY_OF_WEEK));
		
		//DAY_OF_WEEK : 1~7(일~토)
		//date.get(Calendar.DAY_OF_WEEK >=2 && date.get(Calendar.DAY_OF_WEEK <=6
		//평일입니다, 토요일로 이동합니다, data.set(DAY_OF_WEEK, 6)
		//%tF\n, date
		
		if(date.get(Calendar.DAY_OF_WEEK) >=2 && date.get(Calendar.DAY_OF_WEEK) <=6) {
			System.out.println("입력하신 날짜는 '평일'입니다.");
			System.out.println("해당 주의 토요일로 이동합니다.");
			if(date.get(Calendar.DAY_OF_WEEK) == 2) {
				date.set(date.DATE, day+5);
				System.out.printf("이동한 날짜는 '%tF'입니다.\n", date);
			} else if(date.get(Calendar.DAY_OF_WEEK) == 3) {
				date.set(date.DATE, day+4);
				System.out.printf("이동한 날짜는 '%tF'입니다.\n", date);				
			} else if(date.get(Calendar.DAY_OF_WEEK) == 4) {
				date.set(date.DATE, day+3);
				System.out.printf("이동한 날짜는 '%tF'입니다.\n", date);								
			} else if(date.get(Calendar.DAY_OF_WEEK) == 5) {
				date.set(date.DATE, day+2);
				System.out.printf("이동한 날짜는 '%tF'입니다.\n", date);												
			} else if(date.get(Calendar.DAY_OF_WEEK) == 6) {
				date.set(date.DATE, day+1);
				System.out.printf("이동한 날짜는 '%tF'입니다.\n", date);																
			}
		}else {
			System.out.println("입력하신 날짜는 '휴일(토/일)'입니다.");
			System.out.println("결과가 없습니다.");			
		}
		
	}//main
	
}
