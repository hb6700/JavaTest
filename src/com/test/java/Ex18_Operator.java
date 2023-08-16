package com.test.java;

import java.util.Scanner;

public class Ex18_Operator {

	public static void main(String[] args) {
		
		//Ex18_Operator.java
		//요구사항 ) 사용자로부터 문자 1개를 입력 > 영어의 소문자인지 검사
		//회원가입, 본인인증 등에서 사용 : 유효성검사(Validation)
		
		//1. 스캐너 생성하기
		//2. 안내메시지 출력
		//3. 문자 입력
		//4. 영어 소문자인지 검사(문자 코드값 비교)
		//5. 결과값 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자 : ");
		
		String input = scan.nextLine();
		
		//입력한 문자의 문자코드값 (A : 65)
		//System.out.println((int)input);		//참조형 <-> 값형
		
		System.out.println((int)input.charAt(0));	//"ABC" -> 'A'
		
		//A(65) B(66) C(67) ~~ Z(90)
		//a(97) b(98) c(99) ~~ z(122)
		//0(48) 1(49) 2(50) ~~ 9(57)
		//가(44032)~ 힣(55203) : 11172개
		
		//한글
		//1. 완성형 한글 : 가, 강, 곽, 갑, ...
		//2. 조합형 한글 : ㄱ, ㄴ, 초, 중, ...
		
		
		int code = (int)input.charAt(0);
		System.out.println(code >=97 && code <=122);
		System.out.printf("입력한 문자(%c)는 소문자가 %s.", code, (code >=97 && code <=122)? "맞습니다" : "아닙니다");
		
		
		System.out.println(code >=97 && code <=122);
		System.out.println(code >=(int)'a' && code <=(int)'z');
		//int >= char
		System.out.println(code >='a' && code <='z');
		
			
		
		
	}
	
}
