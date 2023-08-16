//Ex36_Class.java
/*
언어의 성향
1. 절차 지향 프로그래밍
2. 함수 지향 프로그래밍
3. 객체 지향 프로그래밍

자바
- 객체 지향 프로그래밍 언어(Object Oriented Programming)
- 객체를 선호하는 프로그래밍 방식

클래스(Class)
1. 객체(Object)
	- 사전적인 정의로 실제 존재하는 것을 말한다
	- 객체지향 이론에서는 사물과 같은 유형적인 것뿐만 아니라. 개념이나 논리와 같은 무형적인 것들도 객체로 간주한다.
	- 맥날 > 모든 주문 > 키오스크/직원
	
2. 클래스(Class)
	- 객체를 분류하는 단위
	- 객체를 생성하는 단위
	
	ex)붕어빵, 붕어빵틀
	a. 붕어빵 틀을 만든다 : 클래스
	b. a를 사용해서 붕어방을 만든다	: 객체
	c. 붕어빵을 먹는다
	
	ex) 핸드폰
	a. 설계도를 만든다 > 핸드폰 틀을 만든다
	b. a를 사용해서 핸드폰을 만든다
	c. 핸드폰을 사용한다.
	
3. 인스턴스(Instance)
	- 객체
	- 객체 == 인스턴스
	: 메모리에 실체화된 객체
	- 객체 != 인스턴스

4. 캡슐화, 정보은닉
	- 객체 내부를 외부로부터 보호하기 위한 장치(수단) 
	
5. 인터페이스
	- 캡슐화된 내부와 외부간의 최소한의 연결이 가능 통로 역할
	ex)게임 인터페이스

	객체 = 데이터 + 행동의 집합
	리모콘 = 데이터(회색, 100g, 8cm x 17cm) + 행동(전원on, 전원off, 배터리를 넣는다. 배터리를 뺀다.)
	홍길동 = 데이터(나이, 몸무게, 피부색깔, 머리색..) + 행동(말한다. 먹는다. 잔다. 달린다. 생각한다..)

6. 프로퍼티(Property)
	- 객체가 가지는 정보(데이터)
	
7. 행동
	- 객체가 가지는 행동
	
8. 상속
	- 부모가 가지는 재산을 자식이 물려받는 행동
	
	
클래스 선언 방법
-클래스를 선언한다 -> 붕어빵 틀 만들기
class 클래스명{			//클래스 명 : 파스칼표기법

}
*/
package com.test.java.obj;

public class Ex36_Class {

	public static void main(String[] args) {
	
		//요구사항) 지도 > 우리집 > 좌표 > 저장
		//case1 - 가장 간단한 방법
		/*
		식별자 문제
		- 같은 성질의 식별자가 서로 다른 이름을 사용 > 그럭저럭
		- 한쌍의 집합 > 물리적 관리 불가능 > 치명적
		- 구조(X) 규칙(애매) > 조작 불편 그래도 단순함
		 */
		
		//우리집 좌표
		int x = 100, y = 200;
		System.out.printf("우리집은 [%d,%d]에 위치합니다.\n", x, y);
		
		//마트좌표
		int x2 = 300, y2 = 400;
		System.out.printf("마트는 [%d,%d]에 위치합니다.\n", x2, y2);
		
		
		
		//case2 - 배열 사용
		//데이터 저장 구조 생성>그룹 > 관리 수월
		//배열 단점 > 요소간의 성질을 구분하기 어렵다 > 첨자 사용 > 첨자는의미를 가지지 못한다
		//몇번째 방에 어떤 데이터를 넣었는지 관리가 힘들다. > 배열은 같은 타입의 같은 성질의 데이터 집합
		
		//우리집
		int[] a1 = {100, 200};
		System.out.printf("우리집은 [%d,%d]에 위치합니다.\n", a1[0], a1[1]);
		
		//마트
		int[] a2 = {300, 400};
		System.out.printf("마트는 [%d,%d]에 위치합니다.\n", a2[0], a2[1]);

		
		//case3 - 클래스 사용
		//클래스 사용> 데이터집합 역할				//※
		//클래스명 변수명 = new 생성자();
		/*
		데이터 저장 구조 생성 >관리 수월
		같은 클래스의 객채 > 멤버 이름이 동일> 데이터 의미 명확
		//멤버 변수의 이름이 존재 > x,y > 배열과 달리 멤버의 의미 명확
		// 클래스 선언 비용 발생(고가) : 개발자의 할 일 증가 
		*/
		
		//우리집
		Point p1 = new Point();		//new Point() : 객체 생성
		p1.x = 100;
		p1.y = 200;
		System.out.printf("우리집은 [%d,%d]에 위치합니다.\n", p1.x, p1.y);

		//마트
		Point p2 = new Point();
		p2.x = 300;
		p2.y = 400;
		System.out.printf("마트는 [%d,%d]에 위치합니다.\n", p2.x, p2.y);
		
		
		
		//요구사항) 크기 저장 > 너비, 높이, 이름
		Size s1 = new Size();
		
		s1.name = "모니터";
		s1.width = 100;
		s1.height = 150;
		
		System.out.println(s1.name);
		System.out.println(s1.width);
		System.out.println(s1.height);
		
		
		
		//학생 성적 > 이름, 국어, 영어, 수학 > 집합(=1명 생성)
		
		Score hong = new Score();
		hong.name = "홍길동";
		hong.kor = 100;
		hong.eng = 100;
		hong.math = 100;
		
		//이클립스 > 확장프로그램
		//1. 직접설치
		//2. 마켓플레이스
		
		//Objectaid > UML확장 프로그램
		//class diagram
		
		//UML(Unified Modeling Language)
		//프로그램의 설계도를 만드는 언어
		//수많은 종류의 설계도
		//a. Class Diagram
		//b. Package Diagram
		//c. Object Diagram
		//d. Component Diagram
		//e. Sequence Diagram
		//f. UseCase Diagram
		//g. Activity
		//h. State Diagram...?등등
		
		
		
		
	
	}//main
	
}//class

class Score{
	public String name;
	public int kor;
	public int eng;
	public int math;
}

class Size{
	public String name;
	public int width;
	public int height;
}

//클래스 선언 > 붕어빵틀 만들기
class Point{
	//클래스 멤버 선어하기 > 변수 or 메소드
	//클래스 멤버 변수
	public int x;
	public int y;
}
