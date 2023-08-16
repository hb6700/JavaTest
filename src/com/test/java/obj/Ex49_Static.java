//Ex49_Static.java
package com.test.java.obj;

public class Ex49_Static {

	public static void main(String[] args) {
		
		//요구사항)
		//1. 펜을 생산
		//2. 생산된 펜의 개수 count
		
		//case1
		//Pen 객체(클래스)와 count 간의 관계가 약함
		//오차발생(count++의 누락)
//		int count = 0;
//		Pen p1 = new Pen("MonAmi", "black");
//		count++;
//		Pen p2 = new Pen("MonAmi", "black");
//		count++;
//		Pen p3 = new Pen("MonAmi", "black");
//		count++;
//		System.out.println("펜 개수 : " + count);

		
		//case2
		//Pen과 count간의 결합을 강하게
		//객체변수 > 여러개 발생
		//그 중 1개 사용 > 왜 그 객체의 count를 사용하는지 ? : 당위성X
//		Pen p1 = new Pen("MonAmi", "black");
//		p1.count++;
//		Pen p2 = new Pen("MonAmi", "black");
//		p1.count++;
//		Pen p3 = new Pen("MonAmi", "black");
//		p1.count++;
//		System.out.println("펜 개수 : " + p1.count);
		
		
		//case3
		//Pen과 count간의 관계를 강하게
		//count 변수를 딱 1개만 만들기
//		Pen p1 = new Pen("MonAmi", "black");
//		Pen.count++;
//		Pen p2 = new Pen("MonAmi", "black");
//		Pen.count++;
//		Pen p3 = new Pen("MonAmi", "black");
//		Pen.count++;
//		System.out.println("펜 개수 : " + Pen.count);
		
		
		//case4
		Pen p1 = new Pen("MonAmi", "black");
		Pen p2 = new Pen("MonAmi", "black");
		Pen p3 = new Pen("MonAmi", "black");
		System.out.println("펜 개수 : " + Pen.count);
		
		
	}//main
	
}//class

class Pen{
	
//	public int count = 0;
	public static int count = 0;
	
	private String model, color;
	
	public Pen(String model, String color) {
		this.model = model;
		this.color = color;
		//펜이 생성될 때 펜의 개수를 count(1증가)
		Pen.count++;
	}

	//확인?
	@Override
	public String toString() {
		return "Pen [model=" + model + ", color=" + color + "]";
	}
	
}