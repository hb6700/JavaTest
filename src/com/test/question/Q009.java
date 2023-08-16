package com.test.question;

public class Q009 {
//20
	public static void main(String[] args) {
		
		/*
		9. 메소드 : 고객명
		요구사항 : 이름을 전달하면 이름뒤에 '님'을 붙여서 반환하는 메소드를 선언하시오.
		조건
		String getName(String name)
		name: OOO(이름)
		return: OOO(이름)님
		*/
		
		String result1 = getName("홍길동");
		System.out.println(result1);
		String result2 = getName("아무개");
		System.out.println(result2);
	}
	
	public static String getName(String name) {
		return "고객 : " + name + "님";
	}
	
}
