//Ex44_Static.java
/*
1. 클래스 로딩(Class Loading)
 - 프로그램을 실행하기 전에 클래스의 정의를 미리 읽는 작업
 - 클래스의 정의를 메모리에 얹는 작업
 - 클래스 로딩 과정에서 모든 static 키워드로 인식 -> 메모리의 실체화(구현)
2. Main()실행

static 키워드
- 클래스 or 클래스 멤버에 붙이는 키워드

지역변수ㄴㄴ
*/
package com.test.java.obj;

public class Ex44_Static {

	public static void main(String[] args) {
		
		//상황) 학생 3명 : 역삼중학교
		Student s1 = new Student();
		s1.setName("홍길동");				//객체변수
		s1.setAge(15);
		
		Student s2 = new Student();
		s2.setName("가나다");
		s2.setAge(15);
		
		Student s3 = new Student();
		s3.setName("흐흐흐");
		s3.setAge(15);

		//s1.setSchool("역삼 중학교");		//static 멤버를 객체 참조 변수를 통해서 접근하려고 시도 > 불가능!
		//s2.setSchool("역삼 중학교");
		//s3.setSchool("역삼 중학교");
		Student.setSchool("역삼중학교");	//정적 변수 > 공용 데이터(***)
		
		System.out.println(s1.info());
		System.out.println(s2.info());
		System.out.println(s3.info());
		
		
//		Util util = new Util();
//		int result = util.add(10, 20);
//		System.out.println(result);
//		result = util.add(30, 40);
//		System.out.println(result);
//		
//		Util util2 = new Util();
//		result = util2.add(50, 60);
//		System.out.println(result);	
		
		int result = Util.add(10, 20);
		System.out.println(result);
	}
	
}

class Student{
	
	//객체 변수 > 사람마다 다른 값을 가져야 할 때
	private String name;
	private int age;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
//	private String school;		//역삼중학교
//	public String getSchool() {
//		return school;
//	}
//	public void setSchool(String school) {
//		this.school = school;
//	}
	
	//정적 변수(클래스 변수), 공용변수
	private static String school;
	
	public static String getSchool() {
		return school;
	}
	public static void setSchool(String school) {
		Student.school = school;
	}
	
	public String info() {
		return String.format("%s, %d, %s", this.name, this.age, Student.school);
	}
	
	
	
	
	public void aaa() {
		//객체메소드
		//개인과 관련된 작업, 집합과 관련된 직업 모두 사용가능
		System.out.println(this.name);			//객체 변수
		System.out.println(Student.school);		//정적 변수
		this.setAge(15);						//객체 메소드
		Student.setSchool("역삼중학교");		//정적 메소드
	}
	
	public static void bbb() {
		//정적메소드
		//집합과 관련된 직업 사용가능
		System.out.println(Student.school); 	//정적 변수
		Student.setSchool("역삼중학교");		//정적 메소드

		//개인과 관련된 작업 사용 불가
		//System.out.println(name);				//객체 변수(X)
		//this.setAge(15);						//객체 메소드
		
	}
	
}



class Util{
	public static int add(int a, int b) {
		return a+b;
	}
}


class Phone{
	//객체멤버변수
	private String color, number;
	public int size;
	
	//정적멤버변수
	private static int weight;
	public static int battery;
	
	public Phone() {

	}
	
	public Phone(String color, String battery) {
		
	}

	private String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public static int getWeight() {
		return weight;
	}

	public static void setWeight(int weight) {
		Phone.weight = weight;
	}

	public static int getBattery() {
		return battery;
	}

	public static void setBattery(int battery) {
		Phone.battery = battery;
	}
	
	
}























