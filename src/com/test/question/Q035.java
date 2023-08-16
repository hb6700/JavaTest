/*
35. 반복문 : 반복인사
요구사항 : 사용자의 이름과 인사할 횟수를 입력받아 출력하시오
*/
package com.test.question;

import java.util.Scanner;

public class Q035 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("횟수 : ");
		int count = scan.nextInt();
		
		for(count = 1 ; count <=3 ; count++) {
			System.out.printf("%s님 안녕하세요~\n", name);
		}
		
	}
	
}
