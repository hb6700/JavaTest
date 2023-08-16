//Ex71_TreeMap
/*
Tree + Map
Tree
- 이진 탐색 트리
- 자동 정렬
Map
- 키 + 값
- 연관 배열

List
- ArrayList : 배열이 필요할 때, 삽입,삭제(X)		**
- LinkdeList : ArrayList대체제로 사용, 삽입과 삭제(O)
- Stack : 스택구조 필요할때 무조건 쓸수밖에... > 후입선출
- Queue : 큐구조가 필요할 때 무조건 쓸수밖에...> 선입선출
- Vector

Set
- HashSet : 중복값 배제, 유일한 집합				**
- TreeSet : HashSet에 정렬기능이 필요할 경우 사용, 그러나 그렇게 사용하는 일이 없음...1년에 한번?

Map
- HashMap : 키/값 연관 배열이 필요할때				**
- TreeMap : HashMap에 정렬기능을 추가할 때 사용.
- HashTable

Properties : JSON, XML

*/
package com.test.java.collection;

import java.util.TreeMap;
import java.util.Vector;

public class Ex71_TreeMap {

	public static void main(String[] args) {
		
		TreeMap<String, String> map = new TreeMap<String, String>();
		
		map.put("white", "흰색");
		map.put("black", "검정");
		map.put("red", "빨강");
		map.put("yellow", "노랑");
		map.put("blue", "파랑");
		map.put("orange", "주황");
		map.put("green", "초록");
		
		System.out.println(map.size());				//7
		System.out.println(map);					//키값을 기준으로 정렬됨 : Tree의 특징
		
		System.out.println(map.get("green"));		//해당 key의 value : 초록
		
		map.put("green", "녹색");					//기존의 key에 새로운 값 넣기
		
		System.out.println(map.firstKey());			//첫 key값 : black
		System.out.println(map.lastKey());			//마지막 key값 : yellow
		
		System.out.println(map.headMap("m"));		//스펠링 m까지	: black~green
		System.out.println(map.tailMap("m"));		//스펠링 m부터 끝까지 : orange~yellow
		System.out.println(map.subMap("r", "y"));	//key값이 r로 시작하는것 부터 y전까지 : red~white
		
		
		//벡터 클래스 > ArrayList라는 대체제의 등장으로 쇄락중, 잘 안씀, 벡터만의 장점이 있기는 함.
		Vector<Integer> list = new Vector<Integer>();
		list.add(10);
		System.out.println(list.get(0));			//10
		
		
	}//main
	
}//class
