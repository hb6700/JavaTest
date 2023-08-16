//Q124
//파일입출력 : 주문 검색
package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;

public class Q124 {

	public static void main(String[] args) {
		
		try {
			BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\검색_회원.dat"));
			BufferedReader reader2 = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\검색_주문.dat"));
			
			
			System.out.println("========================구매내역========================");
			System.out.println("[번호]\t[이름]\t[상품명]\t[개수]\t[배송지]");
		} catch (Exception e) {
			System.out.println("오류");
			e.printStackTrace();
		}
		
	}//main
	
}//class
