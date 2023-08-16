/*
7. 연산자 : 대소문자 반환
요구사항 : 영문 소문자를 1글자 입력받은 후 대문자로 변환해서 출력하시오.
조건
- 대문자와 소문자의 문자 코드값의 관계
*/
//System.out.println(changeAlphabet);		//97

package com.test.question;

import java.util.Scanner;

public class Q007 {

	public static void main(String[] args) {

		//입력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		String input = scan.nextLine();
				
		//입력받은 값 -> char -> int로 변환
		int changeAlphabet = ((int)input.charAt(0));
		
		//a = 97, A = 67 -> 차이 32
		int upperCase = changeAlphabet - 32;
		
		char upperCaseAlphabet = (char)upperCase;
		//upperCase = (char)upperCase;
		
		//String upperCase = String.valueOf(changeAlphabet - 32);
		//System.out.println(upperCase);
		
		//input -> String, upperCaseAlphabet -> char
		System.out.printf("소문자 '%s'의 대문자는 '%c'입니다. \n", input, upperCaseAlphabet);
		
	}
	
}
