//Ex66_Anonymous.java

package com.test.java.collection;

public class Ex66_Anonymous {

	public static void main(String[] args) {
		
		//요구사항) 인터페이스를 구현한 클래스 선언 > 객체 선언
		//1. 본인 타입으로 참조변수 만들기
		BBB b1 = new BBB();
		b1.aaa();
		System.out.println();
		
		//2. 부모 타입(인터페이스)으로 참조 변수 만들기
		AAA b2 = new BBB();
		b2.aaa();
		System.out.println();
		
		//3. 구현부가 없는 메소드 : 실행 안댐 
		//Cannot instantiate the type AAA
		//AAA b3 = new AAA();
		//b3.aaa();
		
		
		//The type new AAA(){} must implement the inherited abstract method AAA.aaa()
		//익명개체 생성
		AAA b3 = new AAA() {
			@Override
			public void aaa() {
				System.out.println("aaa");
			}
		};
		
		/*
		b2 vs b3
		b2
		- AAA인터페이스 선언
		- BBB클래스 구현
		
		b3
		-AAA 인터페이스 선언
		실명클래스 구현(X) 익명 클래스 구현 (o)
		익명 클래스 구현, 클래스의 재사용성 때문
		익명클래스 재사용 의 사없ㅇ므
		명ㅋ늘래스 재사용 의사 있음  이 단게 지나면 거의 결홈?		
		*/
		
		//클래스 사용목적 : 객체 생성
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		//익명클래스 >  붕어빵틀  > 붕어당을 딱 1개만 만들기 위한 틀
		AAA t4 = new AAA() {
			@Override
			public void aaa() {
				
			}	
		};
		
		//t4와 t5는 전혀 다른 클래스		
		AAA t5 = new AAA() {
			@Override
			public void aaa() {
				
			}	
		};
	
		
		
	}//main
	
}//class

class Test{
//	public int a;
//	public int b;
//	public void ccc();
	
}

interface AAA{
	void aaa();
}//interface


//The type BBB must implement the inherited abstract method AAA.aaa()
class BBB implements AAA{

	@Override	//추상메소드
	public void aaa() {
		System.out.println("aaa");
	}
	
}
