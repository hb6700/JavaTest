//Ex63_HashSet.java
package com.test.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex63_HashSet {

	public static void main(String[] args) {
		
		//m1();
		//m2();
		m3();
		
		
		
	}//main

	private static void m3() {
		
		HashSet<String> name = new HashSet<String>();
		name.add("홍길동");
		name.add("홍길동");
		System.out.println(name);
		System.out.println();
		
		HashSet<Person> set = new HashSet<Person>();
		set.add(new Person("홍길동", 20));
		set.add(new Person("아무개", 25));
		set.add(new Person("이순신", 30));
		System.out.println(set);
		
		set.add(new Person("홍길동", 20));		//set 중복값 배제
		System.out.println(set);
		System.out.println();
		
		//p1과 p2를 같은 사람이라고 인식할 수 있도록 수정
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길동", 20);
		
		System.out.println(p1.equals(p2));			//주소값 비교 : false
		
		System.out.println("p1 : " + p1.hashCode());	//메모리 주소
		System.out.println("p2 : " + p2.hashCode());	//메모리 주소
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍";
		s3 = s3 + "길동";
		
		System.out.println(s1.equals(s2));		//true
		System.out.println(s1 == s3);			//false
		System.out.println(s1.equals(s3));		//true
		
		System.out.println(s1.hashCode());		
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
	}

	private static void m2() {
		//중복값제거 : 로또번호 난수발생 중복값ㄴㄴ
		//case1 : ArrayList
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		for(int i=0 ; i<6 ; i++) {
			int n = (int)(Math.random()*45)+1;
			//중복 검사
			boolean flag = false;
			for(int j=0 ; j<i ; j++) {
				if(lotto.get(j) == n) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				lotto.add(n);				
			}else {
				i--;
			}				
		}
		System.out.println(lotto);
		
		//case2 : SetList
		HashSet<Integer> lotto2 = new HashSet<Integer>();
		while(lotto2.size() < 6){
			int n = (int)(Math.random()*45)+1;
			//중복값ㄴㄴ라 다른 소스는 필요 없음
			lotto2.add(n);				
		}
		System.out.println(lotto2);
		
		
		//set의 탐색 : 1.향상된 for문
		for(int num : lotto2) {
			System.out.println(num);
		}
		System.out.println();
		
		//*** list, set다 지원되는 탐색기능 : Iterator(지원 - 탐색도구)
		Iterator<Integer> iter = lotto2.iterator();
		while(iter.hasNext()) {
//			int n = iter.next();
			System.out.println(iter.next());
		}
		
//		System.out.println(iter.hasNext());		//true , 요소 존재의 유무를 반환
//		System.out.println(iter.next());		//첫번째 방의 값을 반환, 요소 가져오기
//		System.out.println(iter.hasNext());		//true , 요소 존재의 유무를 반환
//		System.out.println(iter.next());		//두번째 방의 값을 반환, 요소 가져오기
//		System.out.println(iter.hasNext());		//true , 요소 존재의 유무를 반환
//		System.out.println(iter.next());		//세번째 방의 값을 반환, 요소 가져오기
//		System.out.println(iter.hasNext());		//true , 요소 존재의 유무를 반환
//		System.out.println(iter.next());		//네번째 방의 값을 반환, 요소 가져오기
//		System.out.println(iter.hasNext());		//true , 요소 존재의 유무를 반환
//		System.out.println(iter.next());		//다섯번째 방의 값을 반환, 요소 가져오기
//		System.out.println(iter.hasNext());		//true , 요소 존재의 유무를 반환
//		System.out.println(iter.next());		//여섯번째 방의 값을 반환, 요소 가져오기
	}

	private static void m1() {
		
		ArrayList<String> list = new ArrayList<String>();
		HashSet<String> set = new HashSet<String>();
		
		//추가
		list.add("강아지");
		list.add("고양이");
		list.add("거북이");
		
		set.add("강아지");
		set.add("고양이");
		set.add("거북이");
		
		System.out.println(list.size());				//3
		System.out.println(set.size());					//3
		
		System.out.println(list);						//[강아지, 고양이, 거북이]
		System.out.println(set);						//[고양이, 거북이, 강아지]
		
		list.add("고양이");								//중복값 허용
		System.out.println(list);						//[강아지, 고양이, 거북이, 고양이]
		
		//set.add("고양이");							//중복값을 가질 수 없음
		System.out.println(set.add("고양이"));			//false
		System.out.println(set);						//[고양이, 거북이, 강아지]
		
		//삭제
		list.remove(1);									//방번호로 지우기
		list.remove("거북이");							//값으로 지우기
		System.out.println(list);
		
		set.remove("거북이");							//삭제할때는 값으로만 지워짐
		System.out.println(set);
		
		System.out.println(set.contains("고양이"));		//true
	}
	
}//class

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

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

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}
	
	//값이 동일하면 객체가 동일하게 처리
	//1. hashCode() 오버라이드
	//2. equals() 오버라이드
	
	@Override
	public int hashCode() {
		//원래 : 자신의 메모리 주소값 반환
		//p1 : "홍길동", 20 > "홍길동20" > 100번지
		//p2 : "아무개", 25 > "아무개25" > 200번지
		//p3 : "홍길동", 20 > "홍길동20" > 100번지
		
		return (this.name + this.age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		//p1.equals(p2);
		//주소값비교 > 멤버변수비교
		return this.hashCode() == obj.hashCode();
	}
	
}
