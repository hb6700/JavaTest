/*
30. 조건문 : 대소문자
요구사항 : 영문자 1개를 입력받아 대/소문자 변환을 한 뒤 출력하시오.
조건 : 유효성 검사를 하시오.(영문자만 입력 가능)
*/
package com.test.question;

import java.util.Scanner;

public class Q030 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자 : ");
		//String msg = scan.nextLine();
		//char msg = scan.nextLine().charAt(0);
		
		int changeMsg = scan.nextLine().charAt(0);
		
		//65~90 A~Z
		//97~122 a~z
		
		if((changeMsg>=65 && changeMsg <=90)||(changeMsg>=97 && changeMsg <=122)) {
			if(changeMsg>=65 && changeMsg <=90) {
				int lowerCase = changeMsg + 32;
				System.out.printf("'%c'의 소문자는 '%c'입니다", changeMsg, (char)lowerCase);
			} else if (changeMsg>=97 && changeMsg <=122) {
				int upperCase = changeMsg - 32;
				System.out.printf("'%c'의 대문자는 '%c'입니다", changeMsg, (char)upperCase);				
			}
		} else {
			System.out.println("영문자만 입력하시오.");
		}
		
	}
	
}
