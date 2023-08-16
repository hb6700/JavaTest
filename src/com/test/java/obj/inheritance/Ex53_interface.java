//Ex53_interface.java
/*

*/
package com.test.java.obj.inheritance;

public class Ex53_interface {
	public static void main(String[] args) {
		MxKeys keyboard = new MxKeys();
		keyboard.powerOn();
		keyboard.keyDown('a');
		System.out.println(keyboard.checkBattery());
		keyboard.powerOff();
	}
}


//****Keyboard는 객체를 생성할 수 없다 > 실체화 할 수 없다 > 
interface Keyboard{
	//키보드로써 갖추어야 할? 행동들의 정의(선언부(O), 구현부(X)) : 사용법
	void keyDown(char c);	//public(생략 가능)
	void powerOn();			//public(생략 가능)
	void powerOff();		//public(생략 가능)
	int checkBattery();		//public(생략 가능)
	//static void aaa();
}

class MxKeys implements Keyboard{

	@Override
	public void keyDown(char c) {
		System.out.println(c + "눌렀음");
	}

	@Override
	public void powerOn() {
		System.out.println("전원꺼짐");
	}

	@Override
	public void powerOff() {
		System.out.println("전원꺼짐");
	}

	@Override
	public int checkBattery() {
		return 80;
	}
	
}
