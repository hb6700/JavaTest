/*
5. 연산자 : 자전거
요구사항 : 
자전거가 있다. 자전거의 바퀴는 지름(직경)이 26인치이다. 
사용자가 페달을 밟은 횟수를 입력하면 자전거가 총 몇 m를 달렸는지 출력하시오.
조건 : 
기어비 1:1 → 페달 1회전 == 자전거 바퀴 1회전
모든 출력 숫자는 천단위 표기하시오.
*/

package com.test.question;

import java.util.Scanner;

public class Q005 {
	
	public static void main(String[] args) {
		
		//입력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("사용자가 페달을 밟은 횟수 : ");
		int pedal = scan.nextInt();
		System.out.print("자전거 지름(inch) : ");
		int bicycleDiameter = scan.nextInt();
		//지름 26인치 > 반지름 13인치 > 반지름*2*3.14 > 지름 * 3.14 > 원의 둘레 > 한바퀴동안 가는 거리
		//1인치(inch) = 2.54센티미터(cm), inch * 2.54 = cm
		
		//한바퀴의 둘레 계산
		double bicycleWheelRound = bicycleDiameter * 2.54 * 3.14;
		
		//bicycleDiameter(cm) -> 미터(m)로 변환 -> (/100)
		System.out.printf("사용자가 총 %d회 페달을 밟아 자전거가 총 %,.3f(m)를 달렸습니다.", pedal, bicycleWheelRound*pedal/100);
		
	}
	
}
