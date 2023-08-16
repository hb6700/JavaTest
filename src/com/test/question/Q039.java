/*
39. 반복문 : 숫자 합
*/
package com.test.question;

import java.util.Scanner;

public class Q039 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int start = scan.nextInt();
		System.out.print("종료 숫자 : ");
		int end = scan.nextInt();
		
		int total = 0;
		
		for(int i=start ; i<=end ; i++) {
			total += i;
			if(i == end) {
				System.out.printf("%d = ", end);
			}else {
				System.out.printf("%d + ", i);				
			}
		}//for
		System.out.println(total);
		
	}
	
}
