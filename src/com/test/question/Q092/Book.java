package com.test.question.Q092;

public class Book {

	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2019";
	private String isbn;
	private int page;
	
	//제목(title)
	//제목 : 읽기/쓰기, 최대 50자 이내(한글, 영어, 숫자, 공백)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
//		System.out.println(title.length());
		
/*
입력으로 받은 타이틀의 값을 하나씩 쪼갠다음에 반복문 통해서 한글자씩 비교
일단 50자 이내먼저 걸러내는게 효율적인거 같으니 만들어진 if문 안에서 작업을 하면 될거같고 
그러면 해야할 거
- 각각 문자열을 한글자씩 쪼개는게 뭔지
일단 split("")으로 하나하나 다 잘라내는거
- 한글 /영어/공백/숫자에 해당하는 ascii코드
한글 44032~55203
영어 65~90, 97~122
공백 32
숫자 48~57
*/
		String txt = "";
		if(title.length()>=1&&title.length()<=50) {
			char[] word = new char[title.length()];
			for(int i=0 ; i<title.length() ; i++) {
				word[i]=title.charAt(i);
				if(word[i]>=44032 && word[i]<=55203) {
					txt += word[i];
				}else if(word[i]>=65 && word[i]<=90){
					txt += word[i];
				}else if(word[i]>=97 && word[i]<=122){
					txt += word[i];
				}else if(word[i]>=48 && word[i]<=57){
					txt += word[i];
				}else if(word[i]==32){
					txt += word[i];
				}else {
					txt = "입력 오류입니다";
					break;
				}
			}
			
		}else {
			txt = "입력 오류입니다";
		}
		this.title = txt;			
	}

	//가격(price)
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price>=0 && price<=1000000) {		//유효성 검사
			this.price = price;
		}else {
			System.out.print("잘못 입력하셨습니다.");			
		}
	}

	//저자(author)
	//유효성 검사 필요 없음
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	//출판사(publisher)
	//쓰기 전용
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	//발행년도(pubYear)
	//읽기 전용
	public String getPubYear() {
		return pubYear;
	}

	//ISBN
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	//페이지수(page)
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		if(page>=1) {
			this.page = page;			
		}
	}


	// getter, setter
	public String info() {
//		System.out.printf("제목 : %s\n", this.title);
//		System.out.printf("가격 : %s\n", this.price);
//		System.out.printf("저자 : %s\n", this.author);
//		System.out.printf("출판사 : %s\n", this.publisher);
//		System.out.printf("발행년도 : %s\n", this.pubYear);
//		System.out.printf("ISBN : %s\n", this.isbn);
//		System.out.printf("페이지 수 : %s\n", this.page);
//		return "";
		
		String temp = "제목 : ";
		temp += this.title + "\n";
		temp += "가격 : " + this.price + "원\n";
		temp += "저자 : " + this.author + "\n";
		temp += "출판사 : " + this.publisher + "\n";
		temp += "발행년도 : " + this.pubYear + "년\n";
		temp += "ISBN : " + this.isbn + "\n";
		temp += "페이지 수 : " + this.page + "장\n";
		return temp;
	}
}
