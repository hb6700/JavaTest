/*
27. 조건문 : 문자 조건
요구사항 : 문자 1개를 입력받아 아래와 같이 출력하시오.
조건
f, F → Father
m, M → Mother
s, S → Sister
b, B → Brother
유효성 검사를 하시오.(위의 문자가 아닌 문자는 예외 처리)
*/
package com.test.question;

import java.util.Scanner;

public class Q027 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자 : ");
		String msg = scan.nextLine();
		
		int changeMsg = (int)msg.charAt(0);
		
		if(changeMsg == 70 ||changeMsg == 102) {
			//f, F > 70, 102
			System.out.println("Father");
		} else if(changeMsg == 77 ||changeMsg == 109){
			//m, M > 77, 109
			System.out.println("Mother");
		} else if(changeMsg == 83 ||changeMsg == 115){
			//s, S > 83, 115
			System.out.println("Sister");
		} else if(changeMsg == 66 ||changeMsg == 98){
			//b, B > 66, 98
			System.out.println("Brother");
		} else {
			System.out.println("입력한 문자가 올바르지 않습니다.");
		}
	}
	
}
