//51. 반복문 : 별찍기
/*
    *
   ***
  *****
 *******
*********
*/

package com.test.question;

import java.util.Scanner;

public class Q051 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("행 : ");
		int line = scan.nextInt();
		
		for(int i=1 ; i<=line ; i++) {
			for(int j=1 ; j<=line-i ; j++) {
				System.out.print(" ");
			}
			for(int j=1 ; j<=i*2-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
