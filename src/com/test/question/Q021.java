/*
21. 날짜 시간 : 나이
요구사항 : 태어난 년도를 입력하면 나이를 출력하시오.
조건 
올해를 기준으로 나이를 계산하시오.
내년, 내후년에 실행해도 그때에 맞는 나이를 출력한다.
우리나라 나이로 출력하시오.
*/
package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q021 {

	public static void main(String[] args) {
		//스캐너 태어난 년도 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("태어난 년도 : ");
		int born = scan.nextInt();
		scan.close();
		
		//현재 시간 불러오기
		Calendar now = Calendar.getInstance();
		
		//올해년도 - 태어난 년도 -> 나이 계싼
		int age = (now.get(Calendar.YEAR)) - born;
		System.out.printf("나이 = %d세\n", age);
		
		//ageCalculate();
		
	}//main

	private static void ageCalculate() {
		//나이 계산
		//올해 나이 - 태어난 년도 > 입력(born)
		
//		Calendar now = Calendar.getInstance();
//		int age = (now.get(Calendar.YEAR)) - born;
//		System.out.printf("나이 =  %d", age);
		
	}
	
}
