//Ex69_LinkedList
/*
물리구조 + 인터페이스(사용법)
- Array + List
- Linked + List
- Hash + Map
- Tree + Map
- Hash + Set
- Tree + Set

***** list/map/set의 차이가 뭔지? *****

ArrayList
- 모든 컬렉션 중에서 요소에 접근하는 속도가 가장 빠르다
- 요소 삽입/삭제에 대한 비용이 많이 든다 > shift(O)

LinkedList
- 요소에 접근 속도가 상대적으로 느리다
- 요소 삽입/삭제에 대한 비용이 거의 없다 > shift(X)

*/
package com.test.java.obj.inheritance;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex69_LinkedList {

	public static void main(String[] args) {
		
		//m1();
		m2();
		
		
	}//main

	private static void m2() {
		long begin = 0, end = 0;
		ArrayList<Integer>list1 = new ArrayList<Integer>();
		LinkedList<Integer>list2 = new LinkedList<Integer>();

		
		//Append : 순차적으로 데이터 추가하기
		System.out.println("[Append : 순차적으로 데이터 추가하기] - ArrayList");
		begin = System.currentTimeMillis();
		for(int i=0 ; i<1000000 ; i++) {
			list1.add(i);
		}
		end = System.currentTimeMillis();
		System.out.printf("ArrayList 작업시간 : %,dms\n", end - begin);
		
		
		//Append : 순차적으로 데이터 추가하기
		System.out.println("[Append : 순차적으로 데이터 추가하기] - LinkedList");
		begin = System.currentTimeMillis();
		for(int i=0 ; i<1000000 ; i++) {
			list2.add(i);
		}
		end = System.currentTimeMillis();
		System.out.printf("LinkedList 작업시간 : %,dms\n", end - begin);
		
		
		System.out.println();
		
		
		//Insert : 중간에 데이터 삽입하기
		System.out.println("[Insert : 중간에 데이터 삽입하기] - ArrayList");
		begin = System.currentTimeMillis();
		for(int i=0 ; i<10000 ; i++) {
			list1.add(0, i);			//삽입하기
		}
		end = System.currentTimeMillis();
		System.out.printf("ArrayList 작업시간 : %,dms\n", end - begin);
		
		
		//Insert : 중간에 데이터 삽입하기
		System.out.println("[Insert : 중간에 데이터 삽입하기] - LinkedList");
		begin = System.currentTimeMillis();
		for(int i=0 ; i<10000 ; i++) {
			list2.add(0, i);			//삽입하기
		}
		end = System.currentTimeMillis();
		System.out.printf("[LinkedList 작업시간 : %,dms]\n", end - begin);

		
		System.out.println();
		
		
		//Delete : 중간에 데이터 삽입하기
		System.out.println("[Delete : 중간에 데이터 삭제하기] - ArrayList");
		begin = System.currentTimeMillis();
		for(int i=0 ; i<10000 ; i++) {
			list1.remove(0);			//삭제하기
		}
		end = System.currentTimeMillis();
		System.out.printf("ArrayList 작업시간 : %,dms\n", end - begin);
		
		
		//Delete : 중간에 데이터 삽입하기
		System.out.println("[Delete : 중간에 데이터 삭제하기] - LinkedList");
		begin = System.currentTimeMillis();
		for(int i=0 ; i<10000 ; i++) {
			list2.remove(0);			//삭제하기
		}
		end = System.currentTimeMillis();
		System.out.printf("[LinkedList 작업시간 : %,dms]\n", end - begin);

		
		System.out.println();

		
		//Delete : 마지막부터 순차적으로 데이터 삭제하기
		System.out.println("[Delete : 끝부터 데이터 삭제하기] - ArrayList");
		begin = System.currentTimeMillis();
		for(int i=list2.size()-1 ; i>=0 ; i--) {
			list1.remove(i);			//삭제하기
		}
		end = System.currentTimeMillis();
		System.out.printf("ArrayList 작업시간 : %,dms\n", end - begin);
		
		
		//Delete : 마지막부터 순차적으로 데이터 삭제하기
		System.out.println("[Delete : 끝부터 데이터 삭제하기] - LinkedList");
		begin = System.currentTimeMillis();
		for(int i=list2.size()-1 ; i>=0 ; i--) {
			list2.remove(i);			//삭제하기
		}
		end = System.currentTimeMillis();
		System.out.printf("[LinkedList 작업시간 : %,dms]\n", end - begin);
		
	}

	private static void m1() {
		//Collection(I) > List(I) > ArrayList(C) ,linkedList(C)
		//ArrayList vs LinkedList
		//List > 구현 > 사용법이 아주 유사 > 개발자경험
		//내부구조가 다르다 > 사용용도가 다르다
		
		//LinkedList 종류
		//1. linkged List :일방통행
		//2. Doublie LinkedList :양방향 통행
		//3. Doublud circle Linked list : 양방향 + 처음부터 끝까지(자음 끝 연결),
		//
		
		ArrayList<Integer>list1 = new ArrayList<Integer>();
		LinkedList<Integer>list2 = new LinkedList<Integer>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list2.add(10);
		list2.add(20);
		list2.add(30);

		System.out.println(list1.size());
		System.out.println(list2.size());
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));

		
		
		
	
	}//m1
	
}//class
