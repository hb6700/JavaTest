/*
20. 날짜 시간 : 백일 첫돌
요구사항 : 오늘 태어난 아이의 백일과 첫돌을 출력하시오.
*/
package com.test.question;

import java.util.Calendar;

public class Q020 {
	
	public static void main(String[] args) {
		born();
	}//main

	private static void born() {
		
		Calendar now = Calendar.getInstance();
		//백일 계산
		now.add(Calendar.DATE, 100);
		System.out.printf("백일 : %tF\n", now);
		//now 초기화(오늘 날짜로)
		now = Calendar.getInstance();
		//첫 돌 계산
		now.add(Calendar.YEAR, 1);
		System.out.printf("첫돌 : %tF\n", now);
		
	}
	
}
