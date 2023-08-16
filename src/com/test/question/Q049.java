/*
49. 반복문 : 별찍기
조건 :  행의 갯수를 입력받으시오
*****
 ****
  ***
   **
    *
*/
package com.test.question;

import java.util.Scanner;

public class Q049 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("행 : ");
		int line = scan.nextInt();
		
		for (int i=1 ; i<=line ; i++) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print(" ");
			}
			for(int j=i ; j<=line ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
