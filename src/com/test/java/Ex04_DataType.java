package com.test.java;

public class Ex04_DataType {
	public static void main(String[] args) {
		
		//Ex04_DataType.java
		
		//변수 생성방법, 주의할 점
		byte kor;					//변수 선언
		kor = 100;					//초기화
		System.out.println(kor);	//출력
		
		byte eng;
		eng = 90;
		System.out.println(eng);
		
		byte math;
		math = 80;
		System.out.println(math);
		
		
		/*
		문장(Statement) : 1개 이상의 표현식 
		문장 종결자 : ;		
		*/
		
		//Duplicate local variable kor
		//같은 이름의 변수명을 2개 이상 선언 불가능 / 변수명은 유일해야 함
		//byte kor;
		
		//(***)폴더명 : 한글 사용(X)
		
		/*
		변수명을 만들 때 규칙(***) -> 모든것의 식별자를 만들 때 규칙
		1. 영문자 + 숫자 + '_'만 사용한다 -> 관습 + 물리
		2. 숫자로 시작 불가능 -> 물리		ex) byte 1kor; (X)
		3. 예약어(키워드) 사용 불가능		ex) 
		4. 의미있게(*****************)	-> 풀네임으로 작성(****)
		5. 대소문자 구분
		*/
		
		byte b1;
		b1 = 100;
		System.out.println(b1);
		//수정, 치환
		b1 = 50;		//기존값 100을 가지고 있는 변수 b1에 새롭게 50을 대입
		System.out.println(b1);
		
		//변수(변하는 데이터) vs 상수(변하지 않는 데이터)
		//표현은 동일한데, 그 값이 변하는지 안변하는지?
		//프로그래밍의 상수 -> 데이터(***)
		
		System.out.println(100);	//점수 100점
		System.out.println(100);	//100
		System.out.println(100);	//100
		
		byte score;
		score = 100;
		System.out.println(score);	//100
		score = 90;
		System.out.println(score);	//100->90
		score = 80;
		System.out.println(score);	//100->80
		
		//국어점수(100) -> 화면에 출력
		//byte kor;
		kor = 100;
		System.out.println(kor);		//-> 가독성 높음 -> 변수명 = 의미

		System.out.println(100);		//-> 가독성 낮음 -> 의미(X)
		
		//프로그래밍 발전 방향 -> 코드 재사용
		
		//변수 생성하기
		byte b2;
		b2 = 100;
		
		//선언 + 초기화
		byte b3 = 100;
		
		byte b4;
		byte b5;
		
		byte b6, b7;
		
		byte b8, b9, b10, b11;
		
		byte b12 = 100, b13 = 50, b14 = 90;
		
		byte b15 = 100, b16, b17;
		
		//지도 좌표(x, y)
		byte x1;		//현재 X좌표
		byte y1;		//현재 Y좌표
		
		byte x2, y2;	//마트 x좌표, 마트 y좌표
		
		byte x3,		//마트 X좌표
		     y3;		//마트 Y좌표
		
		
		/*
		변수명 명명법 패턴
		1. 헝가리언 표기법 : 식별자를 만들때 식별자의 접두어로 자료형을 표시하는 방법
			- 자바에서 많이 사용하지 않음
			- 인터페이스명으로 가끔 사용
		2. 파스칼 표기법 : 식별자 단어의 첫 문자를 (대)문자 표기 + 나머지 문자는 소문자로 표기
			- 두 개 이상의 단어로 만든 합성어 -> 모든 단어를 붙이고 각 단어의 첫 문자를 대문자로 표기
			- 사용) 클래스명 Ex4_DataType
		3. 캐멀 표기법 : 식별자 단어의 첫 문자를 (소)문자 표기 + 나머지 문자는 소문자로 표기
			- 두 개 이상의 단어로 만든 합성어 -> 모든 단어를 붙이고 각 단어의 첫 문자를 대문자로 표기
			- 사용) 변수명, 메소드명
		4. 스네이크 표기법 : 전부 소문자 표기, 합성어 각 단어를 '_'로 연결
		5. 케밥 표기법 : 전부 소문자료 표기, 합성어의 경우 각 단어를 '-'로 연결
			- 자바에서는 사용 불가능 -> -(마이너스) 연산자로 인식하기 때문에
			- HTML/CSS에서 자주 사용
		*/
		
		//변수로 이동할때 단축키 : F3, 왼쪽 컨트롤+변수명 클릭
		
		//1
		byte weight;
		byte byte_weight;
		byte byteWeight;
		byte bweight;
		byte bWeight;
		byte b_weight;
		weight = 100;
		
		//2
		byte height;
		byte Height;				//파스칼 표기법
		byte englishscore;			//가독성 낮음
		byte EnglishScore;			//파스칼 표기법
		
		//3
		byte mathscore;
		byte MathScore;				//파스칼 표기법
		byte mathScore;				//캐멀 표기법
		byte MapPositionLatitude;	//파스칼 표기법
		byte mapPositionLatitude;	//캐멀 표기법
		
		//4
		byte english_score;
		
		//5
		//byte english-score;
		
	}//main

}//class
