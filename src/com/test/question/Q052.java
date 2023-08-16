/*
52. 반복문 : 영문자
    aa
   abba
  abccba
 abcddbca
abcdeedcba
*/
package com.test.question;

import java.util.Scanner;

public class Q052 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("행 : ");
		int line = scan.nextInt();
		
		for(int i=1 ; i<=line ; i++) {
			//공백
			for(int j=1 ; j<=line-i ; j++) {
				System.out.print(" ");
			}
			
			//알파벳 기준점 기준 왼쪽
			//i*2/2 -> 1, 2, 3, 4
			char msg = 'a';
			for(int j=1 ; j<=i*2/2 ; j++) {
				System.out.print(msg);
				msg++;
			}
			//알파벳 기준점 기준 오른쪽
			for(int j=1 ; j<=i*2/2 ; j++) {
				msg--;
				System.out.print(msg);
			}
			System.out.println();
		}
		System.out.println();
	}
	
}