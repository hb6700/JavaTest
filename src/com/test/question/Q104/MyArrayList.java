package com.test.question.Q104;

import java.util.Arrays;

public class MyArrayList {

	//ArrayList<String>
	private String[] list;
	
	//1. 현재 요소를 대입할 방번호
	//2. 현재까지 대입된 요소의 개수
	private int index;		//*********이 문제의 핵심 ************
	
	//생성자
	public MyArrayList() {
		this.index = 0;
		this.list = new String[4];			
	}
	
	//개발할때 유용하게 사용 : toString()
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("length : %d\n", this.list.length));
		sb.append(String.format("index : %d\n", this.index));
		sb.append(Arrays.toString(this.list) + "\n");		
		
		return sb.toString();
	}
	
	public void add(String value) {
		
		if(checkLength()) {
			doubleList();
		}
		
		this.list[this.index] = value;
		this.index++;
	}
	
	private void doubleList() {
		String[] temp = new String[this.list.length * 2];
		//깊은 복사
		for (int i=0 ; i<this.list.length ; i++) {		//루프 > 짧은 배열 길이
			temp[i] = this.list[i];
		}
		this.list = temp;		//배열 교체
	}

	private boolean checkLength() {
		if(this.list.length == this.index) {
			//방이 꽉참
			return true;
		}
		//방 남음
		return false;
	}
	
	public String get(int index) {
		if(index < 0 || index>=this.index) {
			//없는 방번호를 요청 -> IndexOutOfBoundException 발생
			throw new IndexOutOfBoundsException();
		}
		return this.list[index];
	}
	
	public int size() {
		return this.index;
	}
	
	
	public void set(int index, String value) {
		if(index < 0 || index>=this.index) {
			//없는 방번호를 요청 -> IndexOutOfBoundException 발생
			throw new IndexOutOfBoundsException();
		}
		this.list[index] = value;
	}
	
	public void remove(int index) {
		//요소 삭제 > 우측의 모든 요소 > 왼쪽으로 한칸 이동 > leftshift
		for(int i=index ; i<this.list.length-1 ; i++) {
			this.list[i] = this.list[i+1];
		}
		this.index--;
	}
	
	public void add(int index, String value) {
		//요소 삽입 > 우측의 모든 요소 > 오른쪽으로 한칸 이동 > right shift
		for(int i=this.list.length-2 ; i>=index ; i--) {
			this.list[i+1] = this.list[i];
		}
		this.list[index] = value;
		this.index++;
	}
	
	public int indexOf(String value) {
		for(int i=0 ; i<this.index ; i++) {
			if(this.list[i] .equals(value)) {
				return i;
			}
		}
		return -1;
	}

	public int indexOf(String value,  int beginIndex) {
		for(int i=0 ; i<beginIndex ; i++) {
			if(this.list[i] .equals(value)) {
				return i;
			}
		}
		return -1;
	}

	public int lastIndexOf(String value) {
		for(int i=this.index-1 ; i>=0 ; i--) {
			if(this.list[i] .equals(value)) {
				return i;
			}
		}
		return -1;
	}
	
	public int lastIndexOf(String value, int beginIndex) {
		for(int i=beginIndex ; i>=0 ; i--) {
			if(this.list[i] .equals(value)) {
				return i;
			}
		}
		return -1;
	}

	public boolean contains(String value) {
		for(int i=0 ; i<this.index ; i++) {
			if(this.list[i].equals(value)) {
				return true;
			}
		}
		return false;
	}

	public void clear() {
	
		//1.
//		for(int i=0 ; i<this.index ; i++) {
//			this.list[i] = null;
//		}
//		this.index = 0;
		
		//2. 
//		this.list = new String[4];		//새로운 배열 교체
//		this.index = 0;
		
		//3.
		this.index = 0;
		
	}
	
	
	
	
//	public boolean add(String value) {
//		try {
//			if(this.index == 0) {		//this.index == null(배열이 초기상태일때 == 값이 아예 안들어있는 상황)
//				this.list = new String[4];			
//			}
//			//배열의 방이 남아있는지 
//			//없으면 두배로 늘리기
//			this.list[this.index] = value;
//			this.index++;
//			
//			return true;
//		} catch(Exception e) {
//			return false;
//		}
//	}
	
//	public String get(int index) {
//		return this.list[index];
//	}
//	
	
	//원하는 위치의 요소를 다른 값으로 수정한다
//	public String set(int index, String value) {
//		String temp = list.set(index, this.list[index]));
//		String originValue = this.list[index];
//		this.list[index] = value;
//		return originValue;
//	}
	
	//원하는 위치의 요소를 삭제한다
//	public String remove(int index) {	
//		remove(this.list[index]);
//		String deleteTemp = this.remove(get(index));
//		String deleteTemp = this.list[index];
//
//		return deleteTemp;
//	}
	
	
}
