package com.test.java.obj;

public class Book {

		/*
		접근지정자 : 가이드라인
		1. 멤버 변수는 무조건 private를 사용한다
		2. getter/setter 를 구현한다
		*/
		
//		public String title, author, publisher;
//		public int price, page;
		private String title, author, publisher;
		private int price, page;

		public void aaa(String a) {
			title = a;
		}
		
		public void bbb(int b) {
			if(b>=0 && b<=100000) {
				price = b;
			} else {
				System.out.println("올바른 책 가격이 아닙니다.");
			}
		}
		
		public int ccc() {
			return price;				//읽기 > 데이터 손상 X
		}
		
		//책제목-setter
		//1. set멤버 변수명
		//2. 변수명
		public void setTitle(String title) {
			//멤버변수 = 매개변수
			//this 연산자 : 객체접근 연사나
			//나 : 객체 자기자신을 가리키는 표현(예약어)
			this.title = title;
			
			//title : 무조건 누군가를 가리킨다(이미 정해져있음)
			//********** 영역이 큰 요소와 작은요소가 충돌하면, 반드시 작은 영역의 요소를 우선한다. : 대부분의 프로그래밍 환경에서 젹용
			//멤버변수 : title : class전역
			//지역변수 : title : method전역
			//class > method : title(지역변수)
			
		}
		
		//getter
		//1. get멤버 변수명
		//2. return
		public String getTitle() {
			return this.title;
		}
		
		
		
		//자동생성부분
		//generator getter and setter
		//변수클릭(f2) - 세번째 getter and setter
		//화면 우클릭 - source(alt+shift+s) - generator getter and setter
		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getPublisher() {
			return publisher;
		}

		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getPage() {
			return page;
		}

		public void setPage(int page) {
			this.page = page;
		}
		
		
		
}
/*
[setter/getter]
객체 내외부를 연결하는 통로
인터페이스 역할
프로퍼티(Property)
*/