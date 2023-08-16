package com.test.java.obj;

public class Member {

	private String id, pw, name;
	private int lv;

	//생성자 vs setter
	//생성자 : 초기화역할
	//Setter : 초기화 이후 수정하는 역할
	
	public Member(String id, String pw, String name, int lv) {
//		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.lv = lv;
	}

//	public Member(String id, String pw, String name, int lv) {
//		this.id = id;
//		this.pw = pw;
//		this.name = name;
//		this.lv = lv;
//	}
	
	public String info() {
		return String.format("아이디(%s), 암호(%s), 이름(%s), 등급(%d)", this.id, this.pw, this.name, this.lv);
	}
		
}
