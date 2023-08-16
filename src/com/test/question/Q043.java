/*
43. 반복문 : 숫자게임
요구사항 : 컴퓨터가 1~10 사이의 숫자 1개를 생각하면 사용자가 맞추는 프로그램을 구현하시오.
조건 : 시도 횟수가 10회가 넘어가면 프로그램을 종료하시오.
*/
package com.test.question;

import java.util.Scanner;

public class Q043 {

	public static void main(String[] args) {
		
		int random = (int)(Math.random()*10);
		
		for(int i=1 ; i<=10 ; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("숫자 : ");
			int input = scan.nextInt();
			if(random == input) {
				System.out.println("맞았습니다.\n");
				System.out.printf("정답을 맞추는 데 시도한 횟수는 %d회입니다.\n", i);
				break;
			}else {
				System.out.println("틀렸습니다.\n");					
				if(i == 10) {
					System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", random);
					System.out.println("모든 기회를 실패했습니다.");					
				}else {

				}
			}
 			
		}//for
		
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
		
	}
	
}
