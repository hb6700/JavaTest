/*
Ex35_String.java
문자열
- 물리적으로 참조형이지만, 약간의 값형의 성질을 가진다. 존1나 이랬다 저랬다 하는 새*끼임
1. 메모리의 공간은 한 번 할당되면 더이상 늘리거나 줄일 수 없다.
2. "문자열은 불변(Immutable)이다." : 한번 만들어진 문자열은 절대 수정할 수 없다.
3. 문자열은 참조형이다

★※ 문자열은 불변이다 -> 라는 게 무슨 말인가요 설명하세요!
라고 하면 뭐라 답할지 적어놓자; 면접질문각임

*/
package com.test.java;

public class Ex35_String {
	
	public static void main(String[] args) {
		
		//m1();
		//m2();
		m3();
		
	}//main

	private static void m3() {
		//문자열 클래스
		//String vs StringBuilder
		String s1 = "홍길동";				//문자열 리터럴 사용 > 특혜
		String s2 = new String("홍길동");
		
		//StringBuilder s3 = "홍길동";
		StringBuilder s3 = new StringBuilder("홍길동");
		System.out.println(s1);
		System.out.println(s3);
		
		System.out.println(s1.length());
		System.out.println(s3.length());
		
		//String : 7157706300ns
		long begin = System.nanoTime();
		//작업 : String
		String txt1 = "홍길동";
		for(int i=0 ; i<100000 ; i++) {
			txt1 = txt1 + ".";		//수정작업
		}
		long end = System.nanoTime();
		System.out.println(txt1.length());
		System.out.println(end - begin + "ns");
		
		
		//StringBuilder : 수정작업에 강함 : 4586200ns
		long begin2 = System.nanoTime();
		StringBuilder txt2 = new StringBuilder("홍길동");
		for(int i=0 ; i<100000 ; i++) {
			txt2.append("."); 			//txt2 = txt2 + ".";		//수정작업
		}
		long end2 = System.nanoTime();
		System.out.println(txt2.length());
		System.out.println(end2 - begin2 + "ns");
	}

	private static void m2() {
		//문자열은 불변이다 -> 그렇기 때문에 되도록 하지 말아야 하는 행동!
		//1. 문자열의 잦은 수정
		//2. 커다란 문자열의 수정
		//아 물론 상황마다 다 다르긴 함. 그래도 쓰지 말라면 왠만하면 하지 말자;
		
		String txt1 = "홍길동";
		for(int i=0 ; i<10 ; i++) {
			txt1 = txt1 + "님";				//수정			
		}
		System.out.println(txt1);		

		txt1 = "존1나 긴 문자열 ";			//이거 존나 긴거임 ㅇ그런거임 근데 쓰기 귀찮아서 이거만 씀
		txt1 = txt1 + "!";					//이렇게 좀 하지 말라고 
		
	}

	private static void m1() {
		//*** 모든 값형은 어떤 데이터를 넣더라도 공간의 크기가 불변이다.
		int n1 = 10;				//4byte
		int n2 = 2000000000;		//4byte
		
		//▼ 해당 내용은 하나의 메소드에서만 적용
		//하나의 메소드안에서 선언된 상수는 같이 사용된다.
		
		//문자열이 길어지면 길어지는 만큼 메모리크기도 커짐 -> 재사용할수 있게 만듦으로써 메모리 절약 -> 문자열은 불변
		String s1 = "홍길동";							//6byte
		String s2 = "안녕하세요. 홍길동입니다.";		//28byte
		String s3 = "홍길동";							//값이 s1과 같기 때문에 홍길동이 저장된 heap주소를 각각 변수로 갖고오는 방식임
		String s4 = "홍";
		s4 = s4 + "길동";
		
		//문자열 비교는 이렇게 하면 절대 안되고 equals쓰라고 했잖니;
		//해당 String의 주소(stack)를 비교
		System.out.println(s1 == s3);		//true..그럼 써도 되겠네! 안돼! 그니까 됐었는데? 아니안돼요. 그냥 안돼요.
		System.out.println(s1 == s4);		//false
		//heap으로 넘어가서 값 자체를 비교
		System.out.println(s1.equals(s3));	//true
		System.out.println(s1.equals(s4));	//true
		
		s1 = s1 + "님";						//홍길동 -> 홍길동님
		System.out.println(s1);				//홍길동님
		System.out.println(s3);				//홍길동
		
	}
	
}


//git test