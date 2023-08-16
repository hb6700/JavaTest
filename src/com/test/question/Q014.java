package com.test.question;

import java.util.Scanner;

public class Q014 {

	public static void main(String[] args) {
		
		/*
		14. 메소드 : 지하철
		요구사항 : 지하철 탑승 소요 시간을 구하시오. 지나가는 역의 개수, 환승역의 횟수, 시간대를 전달 받아 총 걸리는 시간을 반환하는 메소드를 선언하시오.
		조건 
		int getTime(int station, int change, int time)
		각 역간 소요 시간: 2분 소요
		환승 소요 시간: N분 소요
		시간대에 따라 환승 소요 시간이 다르다.
			평상시: 3분
			출근시: 4분
			퇴근시: 5분
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("역의 개수 : ");
		int station = scan.nextInt();
		System.out.print("환승 횟수 : ");
		int change = scan.nextInt();
		System.out.print("시간대(1. 평상시, 2. 출근길, 3. 퇴근길) : ");
		int time = scan.nextInt();
		
		int result = getTime(station, change, time);
		
		System.out.printf("총 소요시간은 %d분 입니다", result);
		
		
	}//main
	
	public static int getTime(int station, int change, int time) {
		
		int result = 2 * station + change * (time == 1 ? 3 : (time == 2 ? 4 :5));
		
		return result;
		
	}
	
}
