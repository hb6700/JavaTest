package com.test.question;

import java.util.Scanner;

public class Q001 {

	public static void main(String[] args) {
		
		/*
		1. 연산자 : 나이
		요구사항 : 태어난 년도를 입력받아 나이를 출력하시오. 
		조건
		- 우리나라 나이로 출력하시오.
		*/
		
		Scanner scan = new Scanner(System.in); 
		System.out.print("태어난 년도 : "); 
		int year = scan.nextInt(); 
		System.out.printf("나이 : %d세", 2023-year);	
		
	}//main
	
}
