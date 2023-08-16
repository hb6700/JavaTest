/*
42. 반복문 : 날짜
요구사항 : 서기 1년 1월 1일부터 오늘까지 며칠째인지 합을 구하시오.
조건 : Calendar 클래스 사용 금지
*/
package com.test.question;

public class Q042 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=1;i<=2022;i++){
			sum += 365;
			
//			if(i == ?){
//				sum++; //366일
			
/*
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
*/			
		}
		
	}
	
}
