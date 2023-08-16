//Ex56_Casting.java
package com.test.java.obj.cast;

public class Ex56_Casting {

	public static void main(String[] args) {
	
		LG500 lg = new LG500();
		HP600 hp = new HP600();
		
//		lg.on();
//		hp.powerOn();
//		
//		lg.print();
//		hp.printing();
//		
//		lg.off();
//		hp.powerOff();
		
		lg.powerOn();
		hp.powerOn();
		
		lg.print();
		hp.print();
		
		lg.powerOff();
		hp.powerOff();
		
		Printer p1;
		LG500 lg2 = new LG500();
		
		//업캐스팅 : printer(부모) = LG500(자식)
		p1 = lg2;
		
		Printer p2 = (Printer)new HP600();
		
		Object o1 = new LG500();
		
		//상황) 프린터 판매 대리점 운영
		//재고 lg x 5, hp x 3
		//매일 업무 :  프린터가 제대로 동작 > 기능확인
		m1();
		
		//추가업무 : lg x 500, hp x 300
		m2();
		
		//추가 : 브랜드 확장 > benq, epson
		m3();
		
		//추가 : 브랜드마다의 특별한 기능 추가
		//lg : selfTest(), hp : clean()
		
		
	}//main

	private static void m3() {
		//printer타입을 넣을수있는 배열?을 8개 만듦
		Printer[] ps = new Printer[8];
		
		//*** 서로 다른 클래스의 객체를 하나의 배열에 넣기
		ps[0] = new LG500();
		ps[1] = new HP600();
		
		for(int i=0 ; i<ps.length ; i++) {
			if(i<5) {
				ps[i] = new LG500();
			}else {
				ps[i] = new HP600();				
			}
		}
		
//		System.out.println(ps[i] instanceof LG500);
		for(int i=0 ; i<ps.length ; i++) {
			if(ps[i] instanceof LG500) {
				((LG500)ps[i]).selfTest();
			}else if(ps[i] instanceof HP600) {
				((HP600)ps[i]).clean();				
			}
		}
		
		
		//업무
//		for(int i=0 ; i<ps.length ; i++) {
//			if(i<5) {
//				ps[i].print();
//				
//				//추가 : 브랜드마다의 특별한 기능 추가
//				//다운캐스팅 > LG500으로 형변환을 먼저 해줘야 함, 그래서 괄호 필수. 안하면 '.' 먼저 실행
//				((LG500)ps[i]).selfTest();				
//			}else {
//				ps[i].print();
//				//배열의 i번째 값을 갖고와서 HP600으로 형변환, 그 안에 들어있던 clean기능을 실행
//				((HP600)ps[i]).clean();				
//			}
//		}
	}

	//브랜드 확장에 있어 단점 발견
	private static void m2() {
		LG500[] lg = new LG500[5];
		for(int i=0 ; i<lg.length ; i++) {
			lg[i] = new LG500();
		}
		
		HP600[] hp = new HP600[3];
		for(int i=0 ; i<hp.length ; i++) {
			hp[i] = new HP600();
		}
		
		//일일업무
		for(int i=0 ; i<lg.length ; i++) {
			lg[i].print();
		}
		for(int i=0 ; i<hp.length ; i++) {
			hp[i].print();
		}
		
	}
	

	//가장 단순하지만 비효율적인 방법
	private static void m1() {
		LG500 lg1 = new LG500();
		LG500 lg2 = new LG500();
		LG500 lg3 = new LG500();
		LG500 lg4 = new LG500();
		LG500 lg5 = new LG500();
		
		HP600 hp1 = new HP600();
		HP600 hp2 = new HP600();
		HP600 hp3 = new HP600();
		
		//일일업무
		lg1.print();
		lg2.print();
		lg3.print();
		lg4.print();
		lg5.print();
		
		hp1.print();
		hp2.print();
		hp3.print();
	}
	
}//class


interface Printer{
	void print();
	void powerOn();
	void powerOff();
}


class LG500 implements Printer{
	private String type;
	private int price;
	
	public void print() {
		System.out.printf("%s 방식으로 출력합니다.\n", this.type);
	}
//	public void on() {
//		System.out.println("printer on");
//	}
//	public void off() {
//		System.out.println("printer off");
//	}
	public void selfTest() {
		System.out.println("self check");
	}
	
	@Override
	public void powerOn() {
		System.out.println("printer on");		
	}
	@Override
	public void powerOff() {
		System.out.println("printer off");				
	}
}


class HP600 implements Printer{
	private String color;
	private int price;
	
//	public void printing() {
//		System.out.println("출력");
//	}
	public void powerOn() {
		System.out.println("power on");
	}
	public void powerOff() {
		System.out.println("power off");
	}
	public void clean() {
		System.out.println("self clean");
	}
	
	@Override
	public void print() {
		System.out.println("출력");
	}
}
