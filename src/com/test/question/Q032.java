/*
32. 조건문 : 주차 요금
요구 사항 : 주차요금을 계산하시오.
조건
무료 주차: 30분
초과 10분당: 2,000원

		//들어온 시간을 시간 형태로 바꿔
		//거기서 30분 더한 시간까지는 0원
		//거기에 +10분당 2000원 추가
		//나간시간과 들어온시간의 갭차이 계산
		//그 값을 이용해 if문 입성
		//-30분 <= 0  : 무료
		//0 < -30분 :  if (/10 =  변수 지정 )
		//그 변수*2000원 > 주차요금
*/
package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q032 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("[들어온 시간]");
		System.out.print("시 : ");
		int inHour = scan.nextInt();
		System.out.print("분 : ");
		int inMinute = scan.nextInt();
		
		System.out.println("[나간 시간]");
		System.out.print("시 : ");
		int outHour = scan.nextInt();
		System.out.print("분 : ");
		int outMinute = scan.nextInt();
		
		
		Calendar enterTime = Calendar.getInstance();
		//enterTime.set(inHour, inMinute);
		enterTime.set(Calendar.HOUR_OF_DAY, inHour);
		enterTime.set(Calendar.MINUTE, inMinute);
		System.out.printf("%tT\n", enterTime);		//시:분:초
		//System.out.println(enterTime.getTimeInMillis());
		long enterTick = enterTime.getTimeInMillis();
		//System.out.println(enterTick);
		
		Calendar outTime = Calendar.getInstance();
		//outTime.set(outHour, outMinute);
		outTime.set(Calendar.HOUR_OF_DAY, outHour);
		outTime.set(Calendar.MINUTE, outMinute);
		System.out.printf("%tT\n", outTime);		//시:분:초
		//System.out.println(outTime.getTimeInMillis());
		long outTick = outTime.getTimeInMillis();
		//System.out.println(outTick);
		
		long stayTick = outTick - enterTick;
		int stayTime = (int)stayTick/1000/60;
		System.out.printf("머문시간 : %d분\n", stayTime);
		
		if(stayTime<=30) {
			System.out.println("무료입니다");
		} else if(stayTime > 30) {
			int price = ((stayTime-30)/10)*2000;
			System.out.printf("주차 요금은 %d원 입니다.", price);
		}
				
	}
	
}
