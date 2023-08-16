package com.test.java.obj;

import java.util.Calendar;

public class Mouse {

	private String model="M301", color="white";
	private int price=30000;
	private Calendar date;

//	public Calendar getDate() {
//		return date;
//	}
//	public void setDate(Calendar date) {
//		this.date = date;
//	}
	public int getPrice() {
		return price;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}

	//새로 생성
	//계산된 프로퍼티 : getter/setter는 기본저긍로 private 멤벼 변수를 조작하지만, 그게 필수가 아니다.
	//멤버변수와 적당히(?) 무관한 getter와 setter를 만들기도 한다
	
	public String getState() {
		if(this.date.get(Calendar.YEAR)<=2021) {
			return "구형";
		}else {
			return "신형";
		}
	}
	
	public void setDate(int year, int month, int date) {
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, date);
		this.date = c;
	}
	
	public String getDate() {
		//System.out.printf("%tF\n", this.date);		//출력 : 자바 콘솔 수업용
		return String.format("%tF", this.date);			//반환 : 모든 분야에서 사용이 가능
	}
	
	//덤프(dump)
	public String info() {
		
		String temp = "[";
		temp += this.model + ",";
		temp += this.price + ",";
		temp += this.color + ",";
		temp += String.format("%tF", this.date);
		temp = "]";
		
		return temp;
	}
	
	
}
