package com.test.question;

import java.util.Scanner;

public class Q015 {

	public static void main(String[] args) {
		
		/*
		15. 메소드 : 사과나무
		요구사항 : 사과 나무가 있다. 사과 나무 씨앗을 심을 날로부터 특정 시간이 흘렀을 때 사과 총 몇개가 열리는지 구하는 메소드를 선언하시오.
		조건
		int getApple(int sunny, int foggy)
		사과 나무를 처음 심었을 때 나무의 길이: 0m
		맑은 날 사과 나무의 성장률: 5㎝
		흐린 날 사과 나무의 성잘률: 2㎝
		사과 나무는 길이가 1m 넘는 시점부터 사과가 열린다.
		1m 넘는 시점부터 10㎝ 자랄 때마다 사과가 1개씩 열린다.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("맑은 날 : ");
		int sunny = scan.nextInt();
		System.out.print("흐린 날 : ");
		int foggy = scan.nextInt();
		
		int treeCount = getApple(sunny, foggy);

		System.out.printf("사과가 총 %d개 열렸습니다", treeCount);
		
	}//main
	
	public static int getApple(int sunny, int foggy) {
		
		int treeLength = sunny * 5 + foggy * 2;
		int treeCount = treeLength>=100 ? treeLength : 0;
		treeCount = (treeCount-100)/10;
		treeCount = treeCount>=0 ? treeCount : 0;
		return treeCount;
	
	}
	
}
