/*
37. 반복문 : 범위 합
요구사항 : 숫자 1개를 입력받아 1부터 입력한 숫자들까지의 합을 출력하시오
*/
package com.test.question;

import java.util.Scanner;

public class Q037 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = scan.nextInt();
		
		int add = 0;
		for(int i = 1 ; i <=num ; i++) {
			add += i;
			//System.out.println(add);
		}
		System.out.printf("1 ~ %d = %d\n", num, add);
		
	}

}
