//Ex45_Inheritance.java
/*
상속(inheritance) : 부모가 가지는 재산을 자식에세 물려주는 행동
- 부모클래스가 가지는 재산(변수, 메소드)을 자식클래스에게 물려주는 행동

- 자식클래스가 코드를 구현하지 않아도 부모클래스로부터 구현된 코드를 물려받는 행동
근데 왜써?
- 비용절감(코드 재사용) ************

상속 관계에 있는 클래스 호칭
- 부모 클랴스<- 자식ㅋ클래스
- 슈퍼 클래스 <- 서브 클래스
- 기본 클래스 <- 확장 크래스
- 기본 클래스 <- 파상 클래스
*/

package com.test.java.obj.inheritance;

public class Ex45_Inheritance {

	public static void main(String[] args) {
	
		Parent p = new Parent();
		
		p.a=10;
		p.b=20;
		
		Child c = new Child();
		c.a=10;		//부모클래스가 자식클래스에게 물려준 멤버
		c.b=20;
		c.aaa();
		c.c=30;
		c.d=40;
		c.ccc();
		
	}
}//class

//부모클래스
class Parent{
	public int a, b;
	public void aaa() {
		System.out.println("aaa");
	}
}

//자식클래스
class Child extends Parent{
	//부모클래스안에 있는 모든 것(100%)을 상속
	public int c, d;
	public void ccc() {
		System.out.println("ccc");
	}
}



/*
회원)
1. 일반 이름 : 이름 아이디 암호 이메일
2. 관리자 회원 : 이름 아이디 암호 등급
*/

//부모클래스
class Member {
	public String name, id, pw;
}

//일반 회원
class Usern extends Member{
	public String email;
}
//관리자 회원
class Administrator extends Member{
	public String lv;
}






class AAA{
	public int a = 10;
}

class BBB extends AAA{
	public int b = 20;
}

class CCC extends BBB{
	public int c = 30;
}

class DDD extends CCC{
	public int d = 40;
}










