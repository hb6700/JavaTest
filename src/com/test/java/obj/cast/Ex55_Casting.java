//Ex55_Casting.java
package com.test.java.obj.cast;

public class Ex55_Casting {

	public static void main(String[] args) {
		
		Parent p1;
		Child c1;
		
		c1 = new Child();
		
		//복사
		//Parent = Child
		//암시적 형변환 : 업캐스팅(***)
		//100% 안전함
		p1 = c1;
		p1 = (Parent)c1;	//원형
		
		//복사후 검증방법 : 복사된 참조변수(p1) > 모든 멤버의 접근테스트 실행
		p1.a = 10;
		p1.b = 20;
		
		System.out.println(p1.a);
		System.out.println(p1.b);
		
//================================================================================================================
		
		Parent p2;
		Child c2;
		
		p2 = new Parent();		//원본
		
		//Child = Parent
		//명시적 형변환
		//자식크래스 = 부모크래스
		//다운캐스팅
		c2 = (Child)p2;
		
		c2.a = 10;
		c2.b = 20;
		c2.c = 30;
		c2.d = 40;
		
		System.out.println(c2.a);
		System.out.println(c2.b);
		System.out.println(c2.c);
		System.out.println(c2.d);
		
//================================================================================================================
		
		Parent p3;
		Child c3;
		
		c3 = new Child();		//원본
		
		p3 = c3;
		
//================================================================================================================
		
		Child c4;
		//다운캐스팅
		c4 = (Child)p3;
		
		c4.a = 10;
		c4.b = 20;
		c4.c = 30;
		c4.d = 40;
		
		System.out.println(c4.a);
		System.out.println(c4.b);
		System.out.println(c4.c);
		System.out.println(c4.d);
	}
	
}

class Parent{
	public int a;
	public int b;
}

class Child extends Parent{
	public int c;
	public int d;
}
