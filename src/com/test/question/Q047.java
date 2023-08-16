//47. 반복문 : 자판기
package com.test.question;

import java.util.Scanner;

public class Q047 {

	public static void main(String[] args) {
		
		for(;;) {
			System.out.println("=======================");
			System.out.println("=========자판기========");
			System.out.println("=======================");
			System.out.println("1. 콜라 : 700원");
			System.out.println("2. 사이다 : 600원");
			System.out.println("3. 비타500 : 500원");
			System.out.println("-----------------------");
			
			Scanner scan = new Scanner(System.in);
			System.out.print("투입 금액 : ");
			int money = scan.nextInt();
			
			if(money>=700) {
				System.out.println("-----------------------");
				System.out.print("음료 선택 : ");
				int choose = scan.nextInt();
				
				if(choose == 1) {
					System.out.println("+ 콜라를 제공합니다.");
					System.out.printf("+ 잔돈 %d원을 제공합니다.\n", money-700);
				}else if(choose == 2) {
					System.out.println("+ 사이다를 제공합니다.");
					System.out.printf("+ 잔돈 %d원을 제공합니다.\n", money-600);			
				}else if(choose == 3) {
					System.out.println("+ 비타500을 제공합니다.");
					System.out.printf("+ 잔돈 %d원을 제공합니다.\n", money-500);			
				}else {
					System.out.println("다시 입력하세요.");
				}
			} else {
				System.out.println("다시 입력하세요.");
			}
			
			scan = new Scanner(System.in);
			System.out.print("계속 하시려면 엔터를 입력하세요.");
			String enter = scan.nextLine();
		}//for
		
	}
	
}
