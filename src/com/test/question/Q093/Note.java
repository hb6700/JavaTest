package com.test.question.Q093;

public class Note {

	private String size;
	private String color;
	private int page;
	private String owner;
	private int price;

	// 크기 : setter , A3, A4, A5, B3, B4, B5
	public void setSize(String size) {
		if (size.equals("A3") || size.equals("A4") || size.equals("A5") || 
				size.equals("B3") || size.equals("B4") || size.equals("B5")) {
			this.size = size;
		} else {
			System.out.println("잘못 입력되었습니다.");
		}
		//사이즈에 따라 price변수(가격)증가 //(+) 크기 변경 : A3(+400원), A4(+200원), B3(+500원), B4(+300원), B5(+100원) 
		if(this.size.equals("A3")){ 
			this.price += 400; 
		}else if(this.size.equals("A4")){ 
			this.price += 200; 
		}else if(this.size.equals("B3")){ 
			this.price += 500; 
		}else if(this.size.equals("B4")){ 
			this.price += 300; 
		}else if(this.size.equals("B5")){ 
			this.price += 100;
		}
	}

	//(+) 기본 노트 : A5 + 흰색 + 10페이지 = 가격(500원) this.price = 500;
	//(+) 페이지수 변경 : 페이지 당 x 10원 추가 
	//무료 인쇄 10장 
	//this.size += (this.page - 10) * 10;
	
	
	// 표지 색상 :setter, 검정색, 흰색, 노란색, 파란색 
	public void setColor(String color) {
		if (color.equals("검정색") || color.equals("흰색") || color.equals("노란색") || color.equals("파란색")) {
			this.color = color;
		} else {
			System.out.println("잘못 입력되었습니다.");
		}
		//색상에 따라 가격 변경 //(+) 색상 변경 : 검정색(+100원), 노란색(+200원), 파란색(+200원)
		if(this.color.equals("검정색")){ 
			this.price += 100; 
		}else if(this.color.equals("노란색")){ 
			this.price += 200; 
		}else if(this.color.equals("파란색")){ 
			this.price += 200; 
		}
	}

	// 페이지수 : setter, 10 ~ 200페이지 이내
	// (+) 10~50(얇다), 51 ~ 100(보통), 101 ~ 200(두껍다)
	// >> if문으로 조건 걸기 페이지수>=10 && 페이지수 <=50 - 얇다
	String txt = " ";

	public void setPage(int page) {
		if (page >= 10 && page <= 200) {
			this.page = page;
			if (this.page >= 10 && this.page <= 50) {
				txt = "얇은";
			} else if (this.page >= 51 && this.page <= 100) {
				txt = "보통";
			} else if (this.page >= 101 && this.page <= 200) {
				txt = "두꺼운";
			}
		} else {
			System.out.println("잘못 입력되었습니다.");
		}
		if(page<10 || page>200) { 
			return; 
		} this.page = page;
	}

	 

	// 소유자이름 : setter 한글 2~5자이내.
	public void setOwner(String owner) {
//		if (owner.length() >= 2 && owner.length() <= 5) {
//
//			boolean result = false;
//			for (int i = 0; i < owner.length(); i++) {
//				char c = owner.charAt(i);
//				if (c >= '가' && c <= '힣') {
//					result = true;
//				} else {
//					result = false;
//					break;
//				}
//			} // for
//
//			if (result) {
//				this.owner = owner;
//			}
//		} else {
//			System.out.println("잘못 입력되었습니다.");
//		}
		if(owner.length() < 2 ||owner.length() > 5) {
			return;
		}
		for(int i=0; i<owner.length() ; i++) {
			char c = owner.charAt(i);
			if(c<'가' || c > '힣') {
				return;
			}
		}
		this.owner = owner;
	}


	// 출력
	public String info() {
		String temp = "";
		if (this.owner == null) {
			temp += "■■■■■■ 노트 정보 ■■■■■■" + "\n";
			temp += "주인 없는 노트" + "\n";
			temp += "■■■■■■■■■■■■■■■■■■■■■■" + "\n";
		} else {
			temp = "■■■■■■ 노트 정보 ■■■■■■" + "\n";
			temp += "소유자 : " + this.owner + "\n";
			temp += "특성 : " + this.color + " " + txt + " " + this.size + "\n";
			temp += "가격 : " + this.price + "원\n";
			temp += "■■■■■■■■■■■■■■■■■■■■■■" + "\n";
		}
		return temp;
	}

}
