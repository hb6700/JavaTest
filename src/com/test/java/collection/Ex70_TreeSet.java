//Ex70_TreeSet
/*
TreeSet
- Tree구조 : 이진트리구조(이진탐색트리, Binary Search Tree)
	- 
- Set사용법
	- 순서가 없다
	- 중복값을 가지지 않는다
*/
package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex70_TreeSet {

	public static void main(String[] args) {
		
		//Treeset : 자동 정렬(오름차순)
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		
		set1.add(10);
		set1.add(30);
		set1.add(40);
		set1.add(20);
		set1.add(50);
		
		set2.add(10);
		set2.add(30);
		set2.add(40);
		set2.add(20);
		set2.add(50);
		
		System.out.println(set1);
		System.out.println(set2);
		
		//탐색 > for / iterator
		for(int n : set2) {
			System.out.println(n);
		}
		
		Iterator<Integer> iter = set2.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		
		//TreeSet 고유기능
		System.out.println(set2.first());
		System.out.println(set2.last());
		
		System.out.println(set2.headSet(30));			//exclusive(~제외)	: [10, 20]
		System.out.println(set2.tailSet(30));			//inclusive(~포함) : [30, 40, 50]	
		System.out.println(set2.subSet(20, 40)); 		//~이상, ~미만 : [20, 30]
		
		HashSet<Integer> set3 = new HashSet<Integer>();
		
		set3.add(20);
		set3.add(50);
		set3.add(30);
		set3.add(10);
		set3.add(40);

		System.out.println(set3);
		
		//Hashset 정렬기능없어서 대신 사용해서 간편하게 sort기능을 이용...???맞을걸
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		
		
		
		
	}//main
	
}//class
