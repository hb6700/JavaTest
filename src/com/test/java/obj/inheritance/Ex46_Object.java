//Ex46_Object.java
/*
Object 클래스
- JDK에서 제공되는 클래스
- 모든 클래스의 근원 클래스  > Root Class
- 9개 메소드 > 모든 클래스들에게 공통으로 필요하다고 생각하는 기능을 구현
- Class Object is the root of the class hierarchy.
- Every class has Object as a superclass. 
- All objects,including arrays, implement the methods of this class.
*/

package com.test.java.obj.inheritance;

public class Ex46_Object {

	public static void main(String[] args) {

		Object o1 = new Object();
		TestChild c = new TestChild();
		
		c.a=10;
		c.b=20;
		c.c=30;
		c.d=40;
		
	}//main
	
}//class

//개발자가 만드는 모든 클래스는 명시적으로 상속을 구현하지 않으면 자동으로 Object클래스의 자식 클래스가 된다
class TestParent{	//extends Object
	public int a, b;
}

class TestChild extends TestParent{
	public int c, d;
}
