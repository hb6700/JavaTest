package com.test.question;

import java.util.Scanner;

public class Q003 {

	public static void main(String[] args) {
		
		/*
		3. 연산자 : 사각형
		요구사항 : 사각형의 너비와 높이를 입력받아 넓이와 둘레를 출력하시오
		조건
		- 사각형 넓이 = 너비 * 높이
		- 사각형 둘레 = 너비 * 2 + 높이 * 2
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("너비(cm) : ");
		double rectangleWeight = scan.nextDouble();
		System.out.print("높이(cm) : ");
		double rectangleHeight = scan.nextDouble();
		
		double rectangleArea = rectangleHeight * rectangleWeight;
		double rectangleRound = rectangleHeight * 2 + rectangleWeight * 2;
		
		System.out.printf("사각형의 넓이는 %.1f(㎠)입니다.\n", rectangleArea);
		System.out.printf("사각형의 넓이는 %.1f(㎝)입니다.", rectangleRound);
		
	}
	
}
