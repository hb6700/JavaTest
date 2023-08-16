package com.test.question;

import java.util.Scanner;

public class Q013 {

	public static void main(String[] args) {
		
		/*
		13. 메소드 : 성적 처리
		요구사항 : 국어, 영어, 수학 점수를 전달하면 '합격' 혹은 '불합격'이라는 단어를 반환하는 메소드를 선언하시오.
		조건
		String test(int kor, int eng, int math)
		평균 점수 60점 이상은 '합격'이다.
		평균 점수 60점 미만은 '불합격'이다.
		과락: 한 과목 이상 40점 미만이면 불합격이다.
		*/
		//예제 참고
		//3항연산자 써봐 -  과락있을때
		
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		System.out.print("수학 : ");
		int math = scan.nextInt();
		
		String result = test(kor, eng, math);
		System.out.println(result);
	}
	
	public static String test(int kor, int eng, int math) {
		//60점 이상(>=) 합격, 미만(<) 불합격 ((kor || eng || math) < 40 ? "불합격" : 
		int total = 0;
		total = kor + eng + math;
		int average = total / 3;
		String result = (average < 60 ||(kor<40 || eng<40 || math<40))? "불합격" : "합격";
		
		return result;
	}
	
}
