/*
50. 반복문 : 별찍기
조건 :  행의 개수 입력 받기
    *
   **
  ***
 ****
*****
*/
package com.test.question;

import java.util.Scanner;

public class Q050 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("행 : ");
		int line = scan.nextInt();
		
		for (int i=1 ; i <= line ; i++) {
			for(int j=1 ; j <= line-i ; j++) {
				System.out.printf(" ");
			}
			for(int j=1 ; j <= i ; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		System.out.println();		
	}
	
}
