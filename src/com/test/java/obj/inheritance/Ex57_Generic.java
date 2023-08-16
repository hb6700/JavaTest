//Ex57_Generic.java
package com.test.java.obj.inheritance;

import java.util.Scanner;

public class Ex57_Generic {

	public static void main(String[] args) {
		
		//요구사항) 클래스 설계
		//1. 멤버변수 선언(int)
		//2. 멤버변수를 중심으로 여러가지 행동을 하는 메소드 선언
		
		WrapperInt n1 = new WrapperInt(100);
		System.out.println(n1.toString());
		System.out.println(n1.getData()*2);
		System.out.println();
		
		//추가 : String을 중심으로 하는 클래스 설계, 나머지 업무는 동일
		WrapperString s1 = new WrapperString("tom");
		System.out.println(s1.toString());
		System.out.println(s1.getData().length());
		System.out.println();

		//추가 : Boolean을 중심으로 하는 클래스 설계, 나머지 업무는 동일
		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1.toString());
		System.out.println(b1.getData() ? "참" : "거짓" );
		System.out.println();
		
		//추가 : double를 중심으로 하는 클래스 설계, 나머지 업무는 동일
		//추가 : byte를 중심으로 하는 클래스 설계, 나머지 업무는 동일
		//추가 : Calendar를 중심으로 하는 클래스 설계, 나머지 업무는 동일
		//...
		//무한대로 확장하는 소스의 문제점을 해결하는 방안 ▼
		
		//1. Object 클래스 : 가장 오래된 방식으로 현재까지도 잘 쓰임
		//Integer
		WrapperObject n2 = new WrapperObject(200);
		System.out.println(n2.toString());
		System.out.println((int)n2.getData()*2);
		System.out.println();
		//String
		WrapperObject s2 = new WrapperObject("James");
		System.out.println(s2.toString());
		System.out.println(((String)s2.getData()).length());
		System.out.println();
		//boolean
		WrapperObject b2 = new WrapperObject(false);
		System.out.println(b2.toString());
		System.out.println(((boolean)b2.getData()) ? "참" : "거짓");
		System.out.println();

		//2. 제네릭 클래스 : 비교적 최신 방식이며 현재에도 잘 쓰임 > 현재 좀 더 많이 쓰긴 함
		//Integer
		Wrapper<Integer> n3 = new Wrapper<Integer>(300);
		System.out.println(n3.toString());
		System.out.println(n3.getData());
		System.out.println();
		//String
		Wrapper<String> s3 = new Wrapper<String>("Rose");
		System.out.println(s3.toString());
		System.out.println(s3.getData());
		System.out.println();
		//Boolean
		Wrapper<Boolean> b3 = new Wrapper<Boolean>(true);
		System.out.println(b3.toString());
		System.out.println(b3.getData() ? "참" : "거짓");
		System.out.println();
				
		
		//Object변수 : 만능주머니(모든 자료형을 담을 수 있는 변수)
		Object o1 = new Object();
		Object o2 = new Hong();					//업캐스팅
		
		Object o3 = new Scanner(System.in);		
		((Scanner)o3).nextLine();
		
		Object o4 = new WrapperInt(100);		
		//((Scanner)o4).nextLine();				//다운캐스팅시 오류발생률이 높음 > 단점 무슨 값을 넣었는지를 확인할 줄 알아야 함

		Object o5 = "홍길동";		
		//===================================================
		//********* 절대적으로 값형과 참조형간의 형변환이 불가능하다...근데 왜댐?
		//메모리 주소값 : int(4byte 정수형)
		//박싱(boxing = 오토박싱) : 무언가를 상자에 담는 행위
		Object o6 = 10;			// = new Integer(10);
		Object o7 = true;		
		
		
//		System.out.println(o6 * 2); 	//현재 o6에는 주소값이 들어가있으므로 곱연산 불가
		System.out.println((Integer)o6);	//다운캐스팅 > 언박싱 : 원래 숫자로 돌려놓는 행위
		System.out.println((int)o6*2);
		
		
//		Integer num = new Integer(10);
//		System.out.println(num);
//		System.out.println(num+100);
				
		
	}//main
	
}//class

class WrapperInt{
	
	//1.클래스 중심
	private int data;		
	
	//2. data중심 행동
	public WrapperInt(int data) {
		this.setData(data);
		//this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
}

class WrapperString{
	
	//1.클래스 중심
	private String data;		
	
	//2. data중심 행동
	public WrapperString(String data) {
		this.setData(data);
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
}


class WrapperBoolean{
	
	//1.클래스 중심
	private Boolean data;		
	
	//2. data중심 행동
	public WrapperBoolean(Boolean data) {
		this.setData(data);
	}
	public Boolean getData() {
		return data;
	}
	public void setData(Boolean data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
}



class WrapperObject{
	private Object data;	//***모든 자료형을 삽입 가능 : object의 가장 큰 장점
	
	public WrapperObject(Object data) {
		this.setData(data);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "WrapperObject [data=" + data + "]";
	}
	
}



class Wrapper<T>{
	private T data;
	
	//생성자
	public Wrapper(T data) {
		this.setData(data);
	}

	//getter&setter
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Wrapper [data=" + data + "]";
	}	
}


