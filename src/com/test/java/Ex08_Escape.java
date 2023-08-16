package com.test.java;

public class Ex08_Escape {
	
	public static void main(String[] args) {
		//Ex08_Escape.java
		
		//특수문자 : Escape Sequence
		//컴파일러가 번역을 할 때, 소스 상에 있는 문자를 그대로 출력하지 않고, 미리 약속된 표현으로 바꿔서 출력하는 요소
		
		//1. \n : new line, line feed, 개행문자(enter)
		char c1 = '\n';
		String s1 = "\n";
		
		//요구사항 : "안녕하세요. 홍길동입니다."를 출력해주세요
		System.out.println("안녕하세요. 홍길동입니다.");
		
		String msg = "안녕하세요. 홍길동입니다.";
		System.out.println(msg);
		
		//수정사항 : "안녕하세요." 와 "홍길동입니다."를 각각 다른줄에 출력
		String msg2 = "안녕하세요. \n홍길동입니다.";
		System.out.println(msg2);
		
		//2. \r : carriage return : 캐럿의 위치를 현재 라인의 맨 앞으로 이동 -> 키보드 home키 역할
		//이클립스에서는 정상 동작 X
		msg = "안녕하세요. \r홍길동님";
		System.out.println(msg);		//원래 콘솔에서는 * 홍길동님요. *라고 출력 
		
		/*
		운영체제의 엔터(enter)
		1. 윈도우 : \r\n
		2. 맥os : \r
		3. 리눅스 :\n
		*/
		System.out.println("하나\r\n둘");
		System.out.println("하나\n둘");
		
		//3. \t : tab문자
		//서식작업 -> 열맞추기 
		msg = "하나\t둘\t셋";
		System.out.println(msg);		
		msg = "하나	둘	셋";		//그냥 탭 써도 됨, 다만 추천 ㄴㄴ
		System.out.println(msg);		
		
		//4. \b(backspace)
		//이클립스 콘솔에서는 동작하지 않음
		
		msg = "홍길동\b입니다.";
		System.out.println(msg);
		
		//5. \', \", \\
		//요구사항) 홍길동 "안녕하세요."
		msg = "홍길동 : \"안녕하세요\"";
		System.out.println(msg);
		
		//요구사항) 수업 폴다ㅓ의경로를 지정
		System.out.println("C:\\class\\code\\java");
	}

}