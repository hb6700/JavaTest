//Ex59_Exception.java
/*
예외(Exception)
- 런타임 오류
- 컴파일 발견(X), 실행중 발견(O)
- 개발자가 미리 예측(O) or 예측(X)
*/
package com.test.java.obj.inheritance;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex59_Exception {
	
	public static void main(String[] args) {		//예외처리 포기
//	public static void main(String[] args) throws Exception {		//예외처리 포기
		
		//m1();
		//m2();
		//m3();
		//m4();
	
//		m5();

//		try {
//			m5();	
//		} catch(Exception e){
//			e.printStackTrace();
//		}
//		
		m6();
		


		
	}//main
	
	
	private static void m6() {
		//예외던지기
		//숫자입력 > 처리
		//반드시 짝수만 - 홀수는 에러
		
		int num = 10;
		if(num % 2 == 0) {
			System.out.println("업무진행");
		}else {
			System.out.println("예외처리");
		}
		
		//try구현
		try {		
			if(num % 2 == 1) {
				//강제 에러
				throw new Exception("홀수입력");		//강제로 에러 발생				
			}
			
			System.out.println("업무진행");
		} catch (Exception e) {
			System.out.println("예외처리");
			System.out.println(e.getMessage());
		}
	}


	private static void m5() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		
		//Unhandled exception type IOException
//		try {
//			String input = reader.readLine();
//		}catch(Exception e){
//			
//		}
		input = reader.readLine();
	}


	private static void m4() {
		try {
			//0으로 나누기 : java.lang.ArithmeticException
			int num = 10;
			System.out.println(100/num);
			//에러 발생시 : throw new ArithemeticException() 받아서 catch로 던짐
			
			//배열 첨자 오류 : java.lang.ArrayIndexOutOfBoundsException
			int[] nums = new int[3];
			nums[0] = 10;
			//에러 발생시 : throw new ArrayIndexOutOfBoundsException() 받아서 catch로 던짐
			
			//NULL참조 : java.lang.NullPointerException
			Scanner scan = null;
			scan.nextLine();			
			//에러 발생시 : throw new NullPointerException() 받아서 catch로 던짐
			
			//StringIndexOutOfBoundsException 등의 오류 발생 : Exception e > "예외처리"
			//준비가 되지 않은 오류는 모두 Exception e에서 오류 출력 다만 디테일한 오류내역은 확인 불가
			
			
		}catch (ArithmeticException e) {
			System.out.println("0으로 나누기");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자");
		}catch (NullPointerException e) {
			System.out.println("널 참조");
		}catch (Exception e) {					//~~~Exception들의 부모클래스, 위치 : 맨 끝 고정.
			System.out.println("예외처리");
		}
		
	}
	
	private static void m3() {
		
		//0으로 나누기 : java.lang.ArithmeticException
//		int num = 0;
//		System.out.println(100/num);
		try {
			int num = 10;
			System.out.println(100/num);			
		}catch(Exception e) {
			System.out.println("0으로 나누기");
		}
		
		
		//배열 첨자 오류 : java.lang.ArrayIndexOutOfBoundsException
//		int[] nums = new int[3];
//		nums[5] = 10;
		try {
			int[] nums = new int[3];
			nums[5] = 10;
		} catch (Exception e) {
			System.out.println("배열 첨자");
		}

		
		//NULL참조 : java.lang.NullPointerException
//		Scanner scan = null;
//		scan.nextLine();
		try {
			Scanner scan = null;
			scan.nextLine();
		} catch (Exception e) {
			System.out.println("널 참조");
		}
	}

	private static void m2() {
		int num = 10;
		try {
			//test.txt 파일 열기
			//비지니스 영역
			System.out.println(100/num);
		} catch(Exception e){
			//예외처리 영역
			System.out.println("예외처리");
		}finally {
			//마무리영역
			//예외와 상관없이 항상 실행해야 하는 코드블럭
			System.out.println("마지막");
			//test.txt 파일 닫기
		}
		
	}

	private static void m1(){
		//요구사항) 숫자를 입력받아 연산을 하시오
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = scan.nextInt();
		
		//예외처리 : 전통적인 방식
		if(num != 0) {
			//비즈니스 코드( = 업무코드 ) : 원래 목적
			System.out.printf("100 / %d = %d\n", num, 100/num);			
		}else {
			//예외 처리 코드
			System.out.println("0 입력 ㄴㄴ 다른거 ㄱㄱ");
		}
		
		//권장하지 않는 방식 : 가독성 ↓
		if(num == 0) {
			//예외 처리 코드
			System.out.println("0 입력 ㄴㄴ 다른거 ㄱㄱ");
		}else {
			//비즈니스 코드( = 업무코드 ) : 원래 목적
			System.out.printf("100 / %d = %d\n", num, 100/num);			
		}
		/*
		if(조건식){
			참 > 실행
		}else{
			거짓 > 실행
		}
		*/
		
		/*
		if문 vs try문
		if문 : 사전에 미리 검사를 해서 사고가 안나게 처리
		try문 : 일단 실행하고 감시함, 사고가 나면 그때 뒤처리 하는 방식
		*/
		
		try {
			System.out.println(1);
			System.out.printf("100 / %d = %d\n", num, 100/num);			
			System.out.println(2);
		}catch(Exception e) {
			System.out.println("0 입력 ㄴㄴ 다른거 ㄱㄱ");
			//Exception e
			//예외 객체 : 예외의상황을 전달
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("종료");
		
		//try영역 : 예외가 발생했는지 감시(CCTV)
		
		
	}

}//class
