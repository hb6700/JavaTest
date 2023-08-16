package com.test.question.Q094;

public class Main {

	public static void main(String[] args) {

//		가격 : 1,200원
//		유통기한 : 5일 남았습니다.
//		과자를 맛있게 먹습니다.
		
		Bugles snack = new Bugles();
		snack.setSize(500);	
		snack.setCreationTime("2023-07-28");
		System.out.println("가격 : " + snack.getPrice() + "원");
		System.out.println("유통 기한이 " + snack.getExpiration() + "일 남았습니다.");
		snack.eat();
		
		System.out.println();

		
//		가격 : 850원
//		유통 기한이 -6일 남았습니다.
//		유통기한이 지나 먹을 수 없습니다.
		Bugles snack2 = new Bugles();
		snack2.setSize(300);
		snack2.setCreationTime("2023-07-20");
		System.out.println("가격 : " + snack2.getPrice() + "원");
		System.out.println("유통 기한이 " + snack2.getExpiration() + "일 남았습니다.");
		snack2.eat();

	}

}
