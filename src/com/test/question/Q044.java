/*
44. 반복문 : 숫자 합
요구사항 : 숫자를 N개 입력받아 아래와 같이 출력하시오.
조건
누적값이 100을 넘어가는 순간 루프를 종료하시오.
짝수는 더하고 홀수는 빼시오.
*/
package com.test.question;

import java.util.Scanner;

public class Q044 {

	public static void main(String[] args) {
		
		int total = 0;
		String txt = "";
		
		for(int i = 1 ; total<100 ; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("숫자 : ");
			int num = scan.nextInt();
			if(num % 2 != 0) {		//홀수
				txt = txt +  " - " + num;
				total = total - num;
			} else {				//짝수
				txt = txt + " + " + num;				
				total = total + num;
			}
			
//			if(total < 100) {
//			
//			}	
//			else {
//				break;				
//			}
			
		}//for		
		System.out.println(txt + " = " + total);
	
	}
	
}
