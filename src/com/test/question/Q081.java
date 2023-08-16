//81. 문자열 : 이메일
/*
확장자에서 이름때고 뭐 때고 했던거처럼 하면댐
- 골뱅이 기점으로 양옆 분리
- @을 구분자로 앞뒤 잘라내고 출력
*/
package com.test.question;

import java.util.Scanner;

public class Q081 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이메일 : ");
		String email = scan.nextLine();

		int index = email.indexOf("@");
		String id = email.substring(0, index);
		String domain = email.substring(index+1);
		
		System.out.printf("이메일 : %s\n", id);
		System.out.printf("도메인 : %s\n", domain);
		
	}
	 
}
