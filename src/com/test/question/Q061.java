/*
61. 배열 : 역순
*/
package com.test.question;

import java.util.Scanner;

public class Q061 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num1 = scan.nextInt();
		System.out.print("숫자 : ");
		int num2 = scan.nextInt();
		System.out.print("숫자 : ");
		int num3 = scan.nextInt();
		System.out.print("숫자 : ");
		int num4 = scan.nextInt();
		System.out.print("숫자 : ");
		int num5 = scan.nextInt();
		
		int[] nums = new int[] {num1, num2, num3, num4, num5};
		
		for(int i=4 ; i>=0 ; i--) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}
		
	}
	
}
