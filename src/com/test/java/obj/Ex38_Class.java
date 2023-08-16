//Ex38_class.java
/*
반드시 지킬 규칙
- 파일의 이름과 클래스의 이름이 반드시 동일해야 한다.
- 컴파일 에러

클래스 선언시 권장사항
- 클래스 1개당 물리적인 파일 1개를 만든다
- 하나의 *.java 안에 여러 개의 클래스를 선언하지 말 것

한 파일 내애서 2개의 클래스를 만들 때
- 파일 내의 모든 클래스 중 public 키워드를 가지는 클래스는 반드시 딱 1개(유일)
- public클래스가 대표클래스 역할 : 대표클래스의 이름이 파일명이 되기 때문.

클래스는 같은 패키지 내에 동일한 이름을 2개 이상 가질 수 없다.
- 클래스의 영역은 패키지이다.
- 클래스의 영역은 물리적인 파일이 아니다.(***)
*/
package com.test.java.obj;

public class Ex38_Class {		//대표클래스 

	public static void main(String[] args) {
		
		//학생 클래스(이름, 나이, 국어, 영어, 수학점수)
		
	}//main
	
}//class

//class Student{
//	public String name;
//	public int age, kor, eng, math;
//}
