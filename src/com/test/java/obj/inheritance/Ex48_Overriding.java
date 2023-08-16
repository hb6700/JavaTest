package com.test.java.obj.inheritance;

import java.util.Date;

public class Ex48_Overriding {

	public static void main(String[] args) {
		
		//대중적인 오버라이드
		
		Time t1 = new Time(2, 30);
		
		//com.test.java.obj. inheritance.Time @ 5aaa6d82
		System.out.println(t1);
		
		//String java.lang.Object.toString()
		System.out.println(t1.toString());
		System.out.println(t1.info());
		
		Date now = new Date();
		
		//kst~
		System.out.println(now);
		//~~~.Date.toString()
		System.out.println(now.toString());
		
	}
	
}

class Time{
	
	private int hour, minute;

	public Time(int hour, int minute) {
		super();
		this.hour = hour;
		this.minute = minute;		
	}
	
	//덤프메소드
	public String info() {
		return this.hour + ":" + this.minute;
	}
	
	@Override		//어노테이션(Annotation) = 주석의 기능
	public String toString() {
		return this.hour + ":" + this.minute;
	}
	
	
}

