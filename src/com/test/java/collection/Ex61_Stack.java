//Ex61_Stack.java
/*
List
- ArrayList
- Queue
- stack
*/
package com.test.java.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex61_Stack {

	public static void main(String[] args) {
		
		//stack
		//m1();
		//m2();
		
		//Queue
		m3();
		
		
	}
	
	private static void m3() {
		//선입선출(Queue) : 인터페이스
		Queue<String> queue = new LinkedList<String>();
		
		//1. 요소 추가하기
		//boolean add(T value)
		queue.add("짜장면");
		queue.add("볶음밥");
		queue.add("탕수육");
		
		//2. 요소 개수
		//int size()
		System.out.println(queue.size());		//3
		
		//3. 요소 읽기(꺼내기)
		System.out.println(queue.poll());		//짜장면 빼내기
		System.out.println(queue.size());		//2
		System.out.println(queue.poll());		//탕수육 빼내기
		System.out.println(queue.size());		//1
		System.out.println(queue.poll());		//볶음밥 빼내기
		System.out.println(queue.size());		//0
		
		//4. 
		System.out.println(queue.poll());
		if(queue.size()!= 0) {
			System.out.println(queue.poll());
		}
		if(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		//5. 요소 확인
		System.out.println(queue.peek());
		
	}

	private static void m2() {
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("짜장면");
		stack.push("짬뽕");
		stack.push("볶음밥");
		
		//5. 요소 확인(읽기만 가능, 삭제x)
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		
	}

	private static void m1() {
			
		//후입선출(Stack) : 클래스
		Stack<String> stack = new Stack<String>();
		
		//1. 요소 추가하기
		//T push(T value)
		stack.push("짜장면");
		stack.push("짬뽕");
		stack.push("볶음밥");
		
		//2. 요소 개수
		//int size
		System.out.println(stack.size());
		
		//3. 요소 읽기
		//T pop
		System.out.println(stack.pop());
		System.out.println(stack.size());

		System.out.println(stack.pop());
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		System.out.println(stack.size());
		
//		System.out.println(stack.pop());
//		System.out.println(stack.size());
		
		//4. 스택이 비었는지
		if(stack.size() != 0) {
			System.out.println(stack.pop());
		}
		if(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
	
}
