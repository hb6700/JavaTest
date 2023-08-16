//성적관리프로그램
/*
패키지 : com.test.java.data
파일
- Main : 메인
- View : 출력 담당
- Data : 데이터 담당 student.txt 담당(입출력)
- Student : 학생1명 정보 > 상자
- Service : 업무 담당 

데이터파일 : stuendt.txt
*/
package com.test.java.data;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Data.load();
//		System.out.println(Data.list);
		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			
			View.mainMenu();
		
			String sel = scan.nextLine();
			if(sel.equals("1")) {
				Service.add();
			}else if(sel.equals("2")) {
				Service.list();
			}else if(sel.equals("3")) {
				Service.delete();
			}else {
				loop = false;
			}
			
		}//while
		scan.close();
		System.out.println("프로그램 종료");
		Data.save();
		
		
	}
	
}
