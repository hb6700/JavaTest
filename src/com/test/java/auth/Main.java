package com.test.java.auth;

import java.util.Scanner;

import com.test.java.auth.admin.Admin;
import com.test.java.auth.auth.Auth;
import com.test.java.auth.data.Data;
import com.test.java.auth.member.Member;

public class Main {

	public static void main(String[] args) {
	
		//콘솔 : 인증처리 : 로그인/로그아웃
		
		
		Data.load();
		
		boolean loop = true;
		Scanner scan = new Scanner(System.in);
		
		
		
		while(loop) {
			System.out.println("================");
			System.out.println(" [회원 관리]");
			System.out.println("================");
			
			if(Auth.auth == null) {
				System.out.println("1. 로그인");
			}else {
				System.out.println("2. 로그아웃");				
				System.out.println("3. 회원정보");
				System.out.println("4. 회원전용");
				if(Auth.auth.getLv().equals("2")) {
					System.out.println("5. 관리자전용");					
				}
			}		
			System.out.println("6. 종료");
			System.out.print("선택 : ");
			
			String sel = scan.nextLine();
			
			if(sel.equals("1")) {
				Auth.login();
			}else if(sel.equals("2")){
				Auth.logout();
			}else if(sel.equals("3")){
				Member.info();
			}else if(sel.equals("4")){
				Member.something();
			}else if(sel.equals("5")){
				Admin.something();
			}else {
				loop = false;
			}
		}//while
		System.out.println("프로그램 종료");
		
	}//main
	
}
