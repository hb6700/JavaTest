/*
36. 반복문 : 숫자범위
요구사항 : 시작숫자, 종료숫자, 증감치를 입력받아 숫자를 차례대로 입력하시오
*/
package com.test.question;

import java.util.Scanner;

public class Q036 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("시작숫자 : ");
		int start = scan.nextInt();
		System.out.print("종료숫자 : ");
		int end = scan.nextInt();
		System.out.print("증감치 : ");
		int add = scan.nextInt();
		
		for(int i = start ; i<=end ; i = i+add) {
			System.out.println(i);
		}
	}
}
