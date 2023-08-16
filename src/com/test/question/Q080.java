//80. 문자열 : 역순 출력
package com.test.question;

import java.util.Scanner;

public class Q080 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문장입력 : ");
		String txt = scan.nextLine();
		
		char c = ' ';
		
		for(int i=0 ; i<txt.length() ; i++){
			c = (char)txt.charAt(i);	
		}
		
		System.out.print("역순결과 : ");
		for (int i=txt.length()-1 ; i>=0 ; i--){
			c = (char)txt.charAt(i);	
			System.out.printf("%c", c);
		}

	}

}
