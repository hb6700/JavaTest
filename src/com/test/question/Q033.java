/*
33. 조건문 : 윤년 검사
요구사항 : 년도를 입력받아 해당 년도가 '평년' 인지 '윤년' 인지 출력하시오.
조건
a. 년도를 4로 나눈다. 떨어지면 b 검사, 떨어지지 않으면 "평년"
b. 년도를 100으로 나눈다. 떨어지면 c 검사, 떨어지지 않으면 "윤년"
c. 년도를 400으로 나눈다. 떨어지면 "윤년", 떨어지지 않으면 "평년"

평년 vs 윤년
2월 29일

양력 : 364.75일
4년마다 +1일
100년마다 -1일
400년마다 +1일

윤달 : 음력

윤초 : 
*/
package com.test.question;

import java.util.Scanner;

public class Q033 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = scan.nextInt();
		
		//a. 년도를 4로 나눈다
		if(year % 4 == 0) {
			//b. 년도를 100으로 나눈다
			if(year % 100 == 0) {
				//c. 년도를 400으로 나눈다
				if (year % 400 == 0) {
					System.out.printf("%d년은 '윤년'입니다.", year);
				} else {
					System.out.printf("%d년은 '평년'입니다.", year);					
				}
			}else {
				System.out.printf("%d년은 '윤년'입니다.", year);				
			}
		}else {
			System.out.printf("%d년은 '평년'입니다.", year);								
		}
		
	}//main
	
}
