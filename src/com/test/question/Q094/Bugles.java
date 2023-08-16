package com.test.question.Q094;

import java.util.Calendar;

public class Bugles {

	private int price;
	private int weight;
	private Calendar creationTime;
	private int expiration;

	//용량 : 쓰기 전용, 300g, 500g, 850g - setter
	public void setSize(int weight) {
		if(weight == 300 || weight == 500 || weight == 850) {
			this.weight = weight;			
		}else {
			System.out.println("잘못 입력하셨습니다");
		}
	}

	//가격 : 읽기 전용, 850원(300g), 1200원(500g), 1950원(850g)
	public int getPrice() {
		if(this.weight == 300) {
			this.price = 850;
		}else if(this.weight == 500){
			this.price = 1200;			
		}else if(this.weight == 850){
			this.price = 1950;			
		}
		return this.price;
	}
	
	//생산일자 : 쓰기 전용(Calendar)
	public void setCreationTime(String date) {
		Calendar c = Calendar.getInstance();
		c.set(Integer.parseInt(date.substring(0, 4)), Integer.parseInt(date.substring(5, 7)) - 1, Integer.parseInt(date.substring(8)));
		this.creationTime = c;
	}
	
	//남은유통기한 : 읽기 전용, 생산된 제품의 유통기한 기준 : 7일(300g), 10일(500g), 15일(850g)
	/*
		먹을수 있는 날짜 = 유통기한 - 현재 - 제조시간
		5 : 먹을 수 있는 날짜가 5일 남음
		-3 : 먹을 수 있는 날짜가 3일 지남
	 */
	public int getExpiration() {
		if(this.weight == 300) {
			expiration  = 7;		//7일(300g)
		}else if(this.weight == 500) {
			expiration = 10;		//10일(300g)
		}else if(this.weight == 850) {
			expiration = 15;		//15일(850g)
		}	
		
		//현재시간
		Calendar now = Calendar.getInstance();
		expiration = expiration-(int)(now.getTimeInMillis() - this.creationTime.getTimeInMillis()) / 1000 / 60 / 60 / 24;
		
		return expiration;
	}	

	//void eat() : 과자 먹기
	public void eat() {
		if(getExpiration()>=0) {
			System.out.println("냠냠쩝쩝 드세요");
		}else {
			System.out.println("피부에 양보하세요");
		}
		
	}

}
