//Ex62_Map.java
/*
ArrayList
- 요소 접근 : 첨자(index) 사용
- 순서가 있는 데이터 집합(방번호 == 요소의 순서)
ex) 강의실 6개 : 1강의실, 2강의실 ~~, 6강의실
- 스칼라 배열(scalar Array)
- 요소 일괄 접근 : 루프(for)
- 요소끼리의 구분이 힘듦
- 첨자(index)는 유일하다
- 값(value)는 중복이 가능하다. > 방번호가 유일해서 식별이 가능

HashMap
- 요소 접근 : 키(key) 사용
- 순서가 없는 데이터 집합(방번호X)
ex) 강의실 6개 : 햇님반, 달님반, 별님반 등등
- 맵(Map), 딕셔녀리(Dictionary, 사전구조) : 키(key) -> 값(value)
- 연관 배열
- 요소 일괄 접근 불가능
- 요소끼리의 구분이 용이하다, 식별자(key)로 방의 의미를 알 수 있으므로 가독성↑
- 키(key)는 유일하다
- 값(value)는 중복이 가능하다 > 키가 유일하기 때문에
*/
package com.test.java.collection;

import java.util.HashMap;

public class Ex62_Map {

	public static void main(String[] args) {
		
		//String - key : 방 이름, Integer - value : 데이터
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		
		//1. 요소 추가
		//V put(K key, V value)
		map.put("국어", 100);		//int 국어 = 100;
		map.put("영어", 90);		//int 영어 = 90;
		map.put("수학", 80);		//int 수학 = 80;
		
		//2. 요소 개수
		//int size()
		System.out.println(map.size());			//3
		
		//3. 요소 읽기
		//v get(K key)
		System.out.println(map.get("국어"));	//100
		System.out.println(map.get("영어"));	//90
		System.out.println(map.get("수학"));	//80
		
		//4. 일괄 탐색 : 불가능
		
		//5. 요소 수정
		//V put(K key, V value)
		map.put("국어", 95);					//추가ㄴㄴ 수정ㅇㅇ 이유는? : key값이 유일하기 때문에

		System.out.println(map.get("국어"));	//95
		
		//6. 요소 검색
		//boolean containsKey(K key)
		//boolean containsKey(V value)
		System.out.println(map.containsKey("국어"));		//true
		System.out.println(map.containsKey("국사"));		//false
		
		System.out.println(map.get("국사"));				//NULL
		
		System.out.println(map.containsKey(90));			//90점 맞은 과목? : 영어, false 출력
		System.out.println(map.containsKey(100));			//100점 맞은 과목 : 국어, false 출력
		
		
		//7. 요소 삭제
		//V remove(K key)
		map.remove("국어");
		
		System.out.println(map.size());						//2
		System.out.println(map.get("국어"));				//null
		
		//8. 초기화
		map.clear();
		System.out.println(map.size());						//0
		
		//변수 재초기화
		map.put("국어", 100);		
		map.put("영어", 90);		
		map.put("수학", 80);		
		
		java.util.Set<String> set = map.keySet();
		
		System.out.println(set);							//[국어, 수학, 영어]
		
		for(String key : set) {
			System.out.println(key + ":" + map.get(key));	//국어 : 100 \n 수학 : 80 \n 영어:90
		}
		
		//교실
		HashMap<String, String> list = new HashMap<String, String>();
		
		list.put("반장", "홍길동");
		list.put("부반장", "아무개");
		list.put("미화부장", "하하하");

		
	}//main 
	
}//class
