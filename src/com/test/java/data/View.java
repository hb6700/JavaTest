package com.test.java.data;

import java.util.Scanner;

public class View {

	//초기 출력부분
	public static void subTitle(String title) {
		System.out.println();
		System.out.println();
		
		System.out.println("-------------------");
		System.out.println("   " + title);
		System.out.println("-------------------");
	}
	
	//일시정지
	public static void pause() {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("계속하려면 엔터를 입력하십시오.");
		scan.nextLine();
	}
	
	//메인메뉴 출력부분
	public static void mainMenu() {
		System.out.println("===================");
		System.out.println("[학생 관리하기]");
		System.out.println("-------------------");
		System.out.println("1. 학생 추가하기");
		System.out.println("2. 학생 목록보기");
		System.out.println("3. 학생 삭제하기");
		System.out.println("4. 종료");
		System.out.println("-------------------");
		System.out.print("선택(번호) : ");
	}
	
}
