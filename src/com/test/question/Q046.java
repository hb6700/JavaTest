/*
46. 반복문 : 한글 숫자
요구사항 : 숫자 10개를 입력받아 한글로 변환 후 출력하시오
조건 : 1~9만 입력하시오
*/
package com.test.question;

import java.util.Scanner;

public class Q046 {

	public static void main(String[] args) {
		
		String output = "";

		for(int i = 1 ; i <= 10 ; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("숫자 : ");
			int num = scan.nextInt();
			
			
			if(num == 1) {
				char name = '일';
				output += name;
			} else if(num == 2) {
				char name = '이';
				output += name;
			} else if(num == 3) {
				char name = '삼';
				output += name;
			} else if(num == 4) {
				char name = '사';
				output += name;
			} else if(num == 5) {
				char name = '오';
				output += name;
			} else if(num == 6) {
				char name = '육';
				output += name;
			} else if(num == 7) {
				char name = '칠';
				output += name;
			} else if(num == 8) {
				char name = '팔';
				output += name;
			} else if(num == 9) {
				char name = '구';
				output += name;
			} else {
				System.out.println("다시 입력하세요.");
			}
			
		}//for
		System.out.println(output);
			
	}
	
}
