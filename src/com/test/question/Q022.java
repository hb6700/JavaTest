/*
22. 날짜 시간 : 커플 기념일
요구사항 : 남녀 커플의 이름과 만난날을 입력받아 기념일을 출력하시오.
*/
package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q022 {

	public static void main(String[] args) {
		
		//스캐너 이용해서 입력 받음(5개 항목)
		Scanner scan = new Scanner(System.in);
		System.out.print("남자 이름 : ");
		String manName = scan.nextLine();
		System.out.print("여자 이름 : ");
		String womanName = scan.nextLine();
		System.out.print("만난 날(년) : ");
		int meetYear = scan.nextInt();
		System.out.print("만난 날(월) : ");
		int meetMonth = scan.nextInt();
		System.out.print("만난 날(일) : ");
		int meetDay = scan.nextInt();
		scan.close();
				
		Calendar start = Calendar.getInstance();
		start.set(meetYear, meetMonth-1, meetDay);
		System.out.printf("%s님과 %s님은 %tF %tA 처음 만났습니다.\n", manName, womanName, start, start);		
		
		//100일
		start.add(Calendar.DATE, 100);
		System.out.printf("100일 : %tF\n", start);
		//200일
		start.set(meetYear, meetMonth-1, meetDay);
		start.add(Calendar.DATE, 200);
		System.out.printf("200일 : %tF\n", start);
		//300일
		start.set(meetYear, meetMonth-1, meetDay);
		start.add(Calendar.DATE, 300);
		System.out.printf("300일 : %tF\n", start);
		//500일
		start.set(meetYear, meetMonth-1, meetDay);
		start.add(Calendar.DATE, 500);
		System.out.printf("500일 : %tF\n", start);
		//1000일
		start.set(meetYear, meetMonth-1, meetDay);
		start.add(Calendar.DATE, 1000);
		System.out.printf("1000일 : %tF\n", start);
		
	}//main

}
