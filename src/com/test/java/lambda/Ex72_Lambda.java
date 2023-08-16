//Ex72_Lambda.java
/*
람다식 (Lambda Expression)
- 함수형 프로그래밍 > 지원
- 자바 > 람다식 > 컬렉션 조작(= 스트림)
- 람다식을 사용하면 코드가 간결해진다
- 자바 메소드의 다른(간결한) 표현
- 람다식은 매개변수를 가지는 코드블럭이다. = 메소드임.
- 자바의 람다식은 인터페이스를 사용해서 만든다. 자바만의 특징!

람다식 형식
- 인터페이스 변수 : 람다식;
- ex) MyInterface m1 = () -> {};
- (매개변수) -> {실행코드}
- 자바의 메소드의 다른 표현
	a. (매개변수) : 메소드의 매개변수 리스트와 동일
	b. -> : 화살표(Arrow), 코드블럭 호출 역할
	c. {실행코드} : 메소드의 구현부와 동일
- 
*/
package com.test.java.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Ex72_Lambda {

	public static void main(String[] args) {

		//m1();
		//m2();
		m3();

	}// main

	//성적.day
	private static void m3() {
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\성적.dat"));
			
			ArrayList<Student> list = new ArrayList<Student>();
			
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
				//어떻게 배열에 옮겨담을까? : 객체로 담는것이 제일 무난햄,,
				String[] temp = line.split(",");
				Student s = new Student(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), Integer.parseInt(temp[3]));
				list.add(s);
			}
			
			//성적순 > 정렬
//			list.sort(new Comparator<Student>() {
//				@Override
//				public int compare(Student o1, Student o2) {
//					return o2.getTotal() - o1.getTotal();
//				}
//			});
			
			list.sort((o1, o2) -> o2.getTotal() - o1.getTotal());
			
			for(Student s : list) {
				System.out.println(s.getName() + " : " + s.getTotal());	
			}
			
			reader.close();
			
		}catch(Exception e){
			System.out.println("오류");
			e.printStackTrace();
		}
		
	}

	//람다식 활용 == 익명 클래스(객체) 활용
	private static void m2() {
		//Math.random();								//0~1의 실수난수
		//System.out.println(rnd.nextInt());			//int의 전체 범위중 random
		//System.out.println(rnd.nextInt(10));			//0~9까지의 정수랜덤 범위지정

		Random rnd = new Random();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i=0 ; i<10 ; i++) {
			nums.add(rnd.nextInt(10)+1);
		}
		System.out.println(nums);
		
		//1. 
		nums.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		System.out.println(nums);
		
		//2.
		nums.sort((Integer o1, Integer o2) -> {
			return o1 - o2;
		});
		
		//3.
		nums.sort((o1, o2) -> o2 - o1);
		System.out.println(nums);
	}

	// 요구사항 : MyInterface를 구현한 객체를 1개 만드시오.
	private static void m1() {
		MyInterface m1 = new MyClass();
		m1.test();

		MyInterface m2 = new MyInterface() {
			@Override
			public void test() {
				System.out.println("익명클래스에서 구현한 메소드");
			}
		};
		m2.test();

		MyInterface m3 = () -> {
			System.out.println("람다식에서 구현한 메소드");
		};
		m3.test();

		// NoParameterNoReturn
		NoParameterNoReturn pr1 = new NoParameterNoReturn() {
			@Override
			public void call() {
				System.out.println("pr1");
			}
		};
		pr1.call();

		NoParameterNoReturn pr2 = () -> {
			System.out.println("pr2");
		};
		pr2.call();

		// ****실행블럭에 문장이 하나이면 {중괄호} 생략 가능
		NoParameterNoReturn pr3 = () -> System.out.println("pr3");

		// 반복문안에서! 실행문이 하나일때! 중괄호 생략 가능 > 근데 이렇게 쓰지마라 니 나중에 조땜
		if (true)
			System.out.println("참");
		else
			System.out.println("거짓");

		// ParameterNoReturn
		ParameterNoReturn pr4 = (int num) -> {
			System.out.println(num);
		};
		pr4.call(100);
		pr4.call(200);
		pr4.call(300);

		// ****매개변수의 자료형을 생략할 수 있다.
		ParameterNoReturn pr5 = (num) -> System.out.println(num);
		pr5.call(400);
		pr5.call(500);

		// ****매개변수의 (소괄호)를 생략할 수 있다
		ParameterNoReturn pr6 = num -> System.out.println(num);
		pr6.call(600);
		pr6.call(700);

		// MultiParameterNoReturn
		MultiParameterNoReturn pr7 = (String name, int age) -> {
			System.out.println(name + "," + age);
		};
		pr7.call("홍길동", 20); // 홍길동,20

		// ****매개변수의 소괄호는 매개변수가 하나일때만 생략이 가능하다. 그래서 밑 문장은 생략 불가 > 생략시 오류발생
		MultiParameterNoReturn pr8 = (name, age) -> System.out.println(name + "," + age);
		pr8.call("아무개", 25); // 아무개,25

		// NoParameterReturn
		NoParameterReturn pr9 = () -> {
			return 100;
		};
		System.out.println(pr9.call()); // 100

		// ****return문을 생략할때는 return문까지 생략해야함 > return은 중괄호가 기본값?인듯
		NoParameterReturn pr10 = () -> 100;
		System.out.println(pr10.call()); // 100

		ParameterReturn pr11 = name -> name.length();
		System.out.println(pr11.call("홍길동")); // 문자열 길이 반환 : 3

	}

}// class

interface MyInterface {
	void test();
}

class MyClass implements MyInterface {
	@Override
	public void test() {
		System.out.println("실명클래스에서 구현한 메소드");
	}
}

interface NoParameterNoReturn {
	void call();
}

interface ParameterNoReturn {
	void call(int num);
}

interface MultiParameterNoReturn {
	void call(String name, int age);
}

interface NoParameterReturn {
	int call();
}

interface ParameterReturn {
	int call(String name);
}


//m3
class Student{
	//홍길동, 47, 61, 73
	private String name;
	private int kor, eng, math;

	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return this.kor + this.eng + this.math;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}

	
	
	
}