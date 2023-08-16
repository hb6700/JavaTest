
// 주석(Comment) : 컴파일 작업할 때 제외하는 영역
// 단일 라인 주석 : 엔터까지 주석 영역, (블럭지정) ctrl + /
// 다중 라인 주석 : 구역지정 주석, ctrl + shift + /(\)

//패키지 선언 : 현재 자바파일이 어떤 패키지 내에 위치하는지 표현
package com.test.java;

//클래스(Class) : 코드의 집합
//public class Ex01 : 클래스 선언부(Header)
//{} : 클래스 구현부(body)
//"Ex01이라는 클래스입니다."
public class Ex01 {
	
	//메소드(Method) : 코드의 집합
	public static void main(String[] args) {
		
		//명령어 > 문장 단위 구성 , 문장 마지막 세미콜론(;)
		//System : 또다른 클래스
		//. : ,멤버접근연산자(Member Access Operator) : 부모.자식
		//out : 필드(field)
		//println() : 메소드 호출
		//"문장~~" : 문자열 리터럴
		System.out.println("문장입니다.");
		
		/*
			특수문자(영문표현)
			~,!,@,#,$,%,^(caret, xor),&,*,-,_,+,=
			;,:,",',?,/,\,`(역따옴표, back quote, back tick),|(pipe, vertical bar, or)
			()소괄호,{}중괄호,[]대괄호,<>화살표괄호
			
			폰트 > 프로그래밍 폰트 추천
			1,l,I,|,i
			0,o,O,D
			",''
			
			이클립스 > 코드 자동완성 > ctrl + space
			: 현재 상태에서 사용가능한 문법만 보여준다(*****)
			
		*/
		//[단축키] : ctrl + shift + l
		//복붙 : ctrl + alt + 방향키(위/아래)
		//옮겨붙이기 : alt + 방향키(위/아래)
		//범위지정 : shift + 방향키(위,아래,좌,우,home,end)
		//shift + ctrl + 방향키
		//ctrl + D(delete)
		//ctrl + F6 > ctrl + tab(탭전환) / 단축키 바꿀때 windows > preference > keys
		System.out.println(100);
		System.out.println(100);
						
	}
	
}
