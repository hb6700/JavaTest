//Ex34_String.java
/*
문자열(String)
JDK에서 제공하는 문자열 조작 기능
//문자열 조작
//1. int length()
//2. char charAt(int)
//3. String trim()
*/
package com.test.java;

import java.util.Scanner;

public class Ex34_String {

	public static void main(String[] args) {
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		m13();
		
	}//main

	private static void m13() {
		//문자열 분리
		//String[] split(String delimiter)
		//구분자를 기준으로 쪼개는 메소드
		//구분자가 연속으로 와도 그 사이의 빈값이 생성
		//맨 마지막 구분자다음에 바로 문장이 끝나면 아무것도 안생김-무시(무시하네;;)
		String name = "홍길동, 아무개, 유재석, 강호동, 박명수";
		String[] temp = name.split(", ");		//split의 값으로 주어진 걸 기준으로 잘림 -> temp배열에 저장
		for (int i=0 ; i<temp.length ; i++) {	//반복문으로 
			System.out.println(temp[i]);		//temp배열 출력
		}
		
	}

	private static void m12() {
		//문자열 치환(바꾸기)
		//String replace(String old, String new)
		//문자열의 일부(old)를 다른 문자열(new)로 바꾸는 메소드
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		//오마이갓 비상사태 이름을 바꿔야 함 어쩌면 좋니?
		//설명 드간다 : 이름 찾아서 오려내고 새로고침 함 그다음 앞문장 뒷문장 바꾼거 세개 이어붙일거임ㅇㅇ
		int index = txt.indexOf("홍길동");
		String temp1 = txt.substring(0, index);					//"안녕하세요. "
		String temp2 = txt.substring(index+3);					//"입니다."	
		System.out.println(temp1 + "아무개" + temp2); 			//"안녕하세요. 아무개입니다."
		
		//ㅋㅋ멍청이 한줄이면 되는데 ㅋㅋㅋㅋㅋㅋ
		//이건 횟수 제한도 없어서 홍길동 나올때마다 아무개로 바꿔주는데 ㅋㅋㅋㅋ
		System.out.println(txt.replace("홍길동", "아무개"));	//"안녕하세요. 아무개입니다."

		//*** replace로 무언가를 삿제하고 싶으면 "무언가~"를 찾아서 ""으로 교체하면 됨
		//ㅋㅋㅋㅋ trim도 개털렸죠?ㅋ 아 근데 대치 하는거라 일부분만 없애는 건 안됨
		txt = "     하나     둘     셋     ";
		System.out.println(txt.trim());
		System.out.println(txt.replace(" ", ""));
		
	}

	private static void m11() {
		//문자열검색
		//indexOf(), lastIndexOf()
		//startsWith(), endsWith()
		
		//boolean contains(String) : 해당 문자열이 있으면 true 아니면 false, 가장 단순하고 어쩌구저쩌구
		String txt = "안녕하세요. 홍길동입니다.";
		System.out.println(txt.contains("홍길동"));		//true
		System.out.println(txt.contains("아무개"));		//false
		
	}

	private static void m10() {
		//문자열 추출 - charAt()
		//String subString(int beginIndex, int endIndex)
		//String subString(int beginIndex)
	
		String txt = "가나다라마바사아자차카타파하";
		System.out.println(txt.substring(3, 7));		//3~7번에 있는 거 출력 : 라마바사
		//근데 왜 7번위치는 '아'인데 왜 '사'까지만 나오니?
		//beginIndex : 포함(inclusive)
		//endIndex : 미포함(exclusive)
		//*** 자바에서는 범위를 나타낼때 -> 시작(포함) ~ 끝(미포함)
		//Math.random() : 0~1까지의 난수 -> 1 포함 노노링
		System.out.println(txt.charAt(5));				//'바' > 문자코드값 변환 가능(O
		System.out.println(txt.substring(5, 6));		//'바' > 문자코드값 변환 불가(X
		System.out.println();
		System.out.println(txt.substring(3));			//endIndex가 없는 경우 문자열 끝까지 출력한다
		
		//주민등록번호
		String jumin = "970728-1012345";
		//성별이 궁금해요 : 배열 7번째 자리가 1인지
		System.out.println(jumin.charAt(7)=='1' ? "남자" : "여자");
		System.out.println(jumin.substring(7, 8).equals("1") ? "남자" : "여자");
		//몇년생이야? : 맨 앞 두자리
		System.out.println(jumin.charAt(0) + jumin.charAt(1));			//112 <- '9'(57) + '7'(55)
		System.out.println("" + jumin.charAt(0) + jumin.charAt(1));		//빈문자열 더해주면 "97"출력 가능
		System.out.println(jumin.substring(0, 2));						//97
		//몇월생이니?
		System.out.println(jumin.substring(2, 4));						//07
		//ㅇㅇ몇일?
		System.out.println(jumin.substring(4, 6));						//28		
		
		
		String path = "C:\\class\\java\\JavaTest\\Ex34_String.java";
		//1. 파일명 추출 : "Ex34_String.java"
		int index = path.lastIndexOf("\\");							//문자열의 마지막부터 가장 처음 만나게되는 '\\'발견해줘
		String fileName = path.substring(index+1);					//찾은 '\\'바로 뒤부터 뽑아낼거야 -> 변수로 지정할거임
		System.out.println(fileName);								//변수추출할건데 맨 마지막까지 다 출력
		//2. 확장자 없는 파일명 추출 : "Ex34_String"
		index = fileName.lastIndexOf(".");							//인덱스(파일명 추출한거)에서 .위치를 찾을거임
		String fileNameWithoutExtention = fileName.substring(0, index);		//
		System.out.println(fileNameWithoutExtention);
		//3. 확장자 추출 : ".java"
		String extention = fileName.substring(index);
		System.out.println(extention);
		
	}

	private static void m9() {
		//패턴 검색 : 특정 단어로 시작하면 true반환, 아니면 false / end도 동일
		//boolean startsWith(String)
		//boolean endsWith(String)
		String txt = "자바 프로그래밍";
		System.out.println(txt.startsWith("자바"));				//true
		System.out.println(txt.startsWith("프로그래밍"));		//false
		
		System.out.println(txt.endsWith("자바"));				//false
		System.out.println(txt.endsWith("프로그래밍"));			//true
		
		String name = "홍길동";
		//동일기능을 하는 여러 문장
		System.out.println(name.startsWith("홍"));				//추천 ♣
		System.out.println(name.charAt(0) ==  '홍');
		System.out.println(name.indexOf('홍') == 0);
		
		System.out.println(name.endsWith("홍"));				//추천 ♣
		System.out.println(name.charAt(name.length()-1) ==  '동');
		System.out.println(name.indexOf('동') == name.length()-1);
		System.out.println();
		
		//파일 in HDD
		String path = "C:\\class\\java\\JavaTest\\Ex34_String.java";
		//해당 파일이 자바소스입니까? -> 확장자 검색
		//endswith으로 자바 대조
		if(path.endsWith(".java")) {
			System.out.println("자바소스파일");
		}else {
			System.out.println("다른 파일");			
		}
		
	}

	private static void m8() {
		//대소문자 변경
		//String toUpperCase();
		//String toLowerCase();
		
		String content = "오늘 수업은 Java입니다.";
		String word = "java";
		
		System.out.println(content);
		System.out.println(content.toUpperCase());
		System.out.println(content.toLowerCase());
		
		//대소문자 구분(Case sensitive)
		//정확도 높음
		//검색율 낮음
		if(content.indexOf(word) > -1) {
			System.out.println("결과 O");
		}else {
			System.out.println("결과 X");
		}
		
		//대소문자 구분X(Case insensitive)
		//정확도 낮음
		//검색율 높음
		if(content.toUpperCase().indexOf(word.toUpperCase()) > -1) {
			System.out.println("결과 O");
		}else {
			System.out.println("결과 X");
		}
		
	}

	private static void m7() {
		//주민등록번호 -> '-'rldlq
		String jumin = "970728-2012345";
		
		if(jumin.charAt(6) == '-'){
			System.out.println("O");
		}else {
			System.out.println("X");			
		}
		
		if(jumin.indexOf("-") == 6){
			System.out.println("O");
		}else {
			System.out.println("X");			
		}
		
		//게시판 글쓰기
		String word = "바보";
		String content = "안녕하세요. 반갑습니다~ 자바를 공부하고 있어요.";
		
		if(content.indexOf(word) > -1) {
			System.out.println("금지어 발견");
		}else {
			System.out.println("글쓰기 진행");
		}
		
		String[] words = {"바보", "멍청이", "메롱", "ㅂㅏㅂㅗ"};		
		
		for(int i=0 ; i<words.length ; i++) {
			if(content.indexOf(words[i]) > -1) {
				System.out.println("금지어 발견");
				break;
			}
		}
		
	}

	private static void m6() {
		//문자열 검색
		//int indexOf(char)
		//int indexOf(String)
		//int indexOF(char, int)
		//int indexOf(String, int)
		
		//int lastIndexOf(char)
		//int indexOf(String)
		//int indexOF(char, int)
		//int indexOf(String, int)

		
		String txt = "안녕하세요. 홍길동입니다.";
		int index = -1;		//인덱스 서치 결과가 0부터라서, 못찾더라도 숫자를 반환해줘야 하기 때문에(음수는 인덱스로 사용불가)
		
		index = txt.indexOf('하');
		System.out.println(index);			//2
		
		index = txt.indexOf('홍');
		System.out.println(index);			//7
		
		index = txt.indexOf('김');
		System.out.println(index);			//-1
		
		index = txt.indexOf("홍길동");		//첫번째 문자의 위치를 반환
		System.out.println(index);			//7
		System.out.println();
		
		txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 안녕히가세요. 홍길동입니다.";
//		index = txt.indexOf("홍길동",0);	//기본	
//		System.out.println(index);			//7, 첫번째 홍길동
//		index = txt.indexOf("홍길동",10);	
//		System.out.println(index);			//10
//		index = txt.indexOf("홍길동",25);	
//		System.out.println(index);			//38
		
		index = -1;

		for(int i=0 ; i<3 ; i++) {
			index = txt.indexOf("홍길동", index);
			System.out.println(index);
			index += 3;
			
		}
		while(true) {
			index = txt.indexOf("홍길동", index);
			if(index == -1) {
				break;
		}
		System.out.println(index);
			index += 3;
		}
		
		txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. ";
		System.out.println(txt.indexOf("홍길동"));				//7
		System.out.println(txt.lastIndexOf("홍길동"));			//22
	}

	private static void m5() {
		//공백 제거
		//String trim()
		//문자열내의 공백(whitespace > 스페이스, 탭, 개행=엔터)문자를 제거
		//문자열의 시작과 끝에 존재하는 공백을 제거한다.(***)
		String txt = "     하나     둘     셋     ";
		
		System.out.printf("[%s]\n", txt);
		System.out.printf("[%s]\n", txt.trim());
	}

	private static void m4() {
		//주민등록번호 : 
		String jumin = "970727-1000001";
		
		System.out.println(jumin.charAt(6));		//입력받은 주민등록번호의 6번째(-)뽑아냄
		if(jumin.charAt(6) == '-') {
			System.out.println("올바른 주민등록번호");
			
			if(jumin.charAt(7) == '1' || jumin.charAt(7) == '3') {
				System.out.println("남자");
			}else {
				System.out.println("여자");				
			}
		}else {
			System.out.println("올바르지 않은 주민등록번호");			
		}
		
	}

	private static void m3() {
		Scanner scan = new Scanner(System.in);
		//요구사항) 회원가입, 아이디입력, 영어 소문자만 입력
		System.out.print("아이디 : ");
		String id = scan.nextLine();
		
		//아이디: hong -> h o n g	
		//아이디 분리
		
		for(int i=0 ; i<id.length() ; i++) {
			char c = id.charAt(i);
			//System.out.println(c);
			//영소문자가 아님
			if(c < 'a' || c >'z'){
				System.out.println("잘못된 문자 발견");
				break;
			}
		}
		System.out.println("종료");
	}

	private static void m2() {
		//문자열 추출
		//char charAt(int index)
		//java : Zero-based index
		
		String txt = "안녕하세요. 홍길동입니다.";
//		txt.char
		char c = txt.charAt(3);
		System.out.println(c);		
		c = txt.charAt(7);
		System.out.println(c);		
		c = txt.charAt(13);
		System.out.println(c);		
//		c = txt.charAt(14);
//		System.out.println(c);
//		c = txt.charAt(14);
//		System.out.println(c);
		
	}

	private static void m1() {
		//문자열(String), 문자(char), 문자열(String) = 문자의 짒합(char[])
		//문자열 조작 기능 = 배열 조작 기능 유사
		
		//문자열 길이 
		//- int length, 문자열의 글자수
		
		//홍길동 입니다
		char[] clist = {'홍', '길', '동', '입', '니', '다', '.'};
		System.out.println(clist.length);
		
		String[] name = { "홍길동입니다."};
		System.out.println(name.length);
		System.out.println("홍길동".length());
		
		//요구사항) 회원가입 > 이름입력 > 이름을 2~5자 이내로 작성 : 유효성검사
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		String name2 = scan.nextLine();
		
		if(name2.length() >= 2 && name2.length()<=5) {
			System.out.println("올바른 이름");
		}else{
			System.out.println("dl이름을 2자~5자 이내로 작성하시오");
			
			//A1rk$
		}
	
	}
}
