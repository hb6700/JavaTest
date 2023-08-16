//Ex39_Access.java
/*
접근지정자(제어자) : Access Modifier
- 주로 클래스 멤버에 붙여서 사용한다 : 멤버변수, 멤버메소드
- 클래스 자체에 붙여서도 사용한다
- 지역변수에는 사용이 불가능하다.
- 클래스(객체)의 영역을 기준으로, 외부에 해당 멤버를 어떻게 노출할지 통제하는 역할 : 보안수준 제어	

1. public
2. private
------------------
3. protected : 상속
4. default : 패키지


*/
package com.test.java.obj;

import java.util.Calendar;

public class Ex39_Access {
	
	public static void main(String[] args) {
		
		Box box = new Box();
		box.color = "갈색";		//public
		//box.size = 100;		//private
		box.aaa();
		//box.bbb();
		
		
		//접근지정자 > 가이드라인
		Book book = new Book();
		
//		book.title = "자바의정석";
//		book.author = "홍길동";
//		book.publisher = "도우출판";
//		book.price = 30000;
//		book.page = 1000;
		
		
//		int temp = 30000;					//책가격
//		
//		if(temp>=0 && temp<=100000) {		//유효성 검사
//			book.price = temp;
//		}else {
//			
//		}
		
//		System.out.println(book.price);
		
		book.aaa("자바의 정석");
		book.bbb(30000);									//쓰기 작업 : setter
		
		System.out.println("책 가격 : " + book.ccc());		//읽기 작업 : getter
		
		book.setTitle("자바의 정석");
		System.out.println(book.getTitle());
		System.out.println();
		
		//class Mouth
		Mouse m1 = new Mouse();
		
		m1.setModel("M901");
		System.out.println(m1.getModel());
		
		//쓰기전용
		m1.setPrice(50000);
		//System.out.println(m1.getPrice);
		
		//읽기전용
		//m1.setColor();
		System.out.println(m1.getColor());
		
		
		/*
		최종 요약
		getter/setter역할
		1. private멤버 > 인터페이스 역할
		2. 읽기 전용 멤버, 쓰기 전용 멤버
		*/
		
//		Calendar date = Calendar.getInstance();
//		date.add(Calendar.YEAR, -3);
//		m1.setDate(date);
//		System.out.printf("마우스 제조년월일 : %tF\n", m1.getDate());
		
		//m1.getState > private String state;
		System.out.println(m1.getState());

		//(객체)사용자 편의성 향상
		m1.setDate(2020, 7, 31);
		System.out.println(m1.getDate());
		
		
		//m1의 현재 모든 상태를 확인
//		System.out.println(m1.getModel());
//		System.out.println(m1.getPrice());
//		System.out.println(m1.getColor());
		System.out.println(m1.info());
		
		
	}//main

}//class