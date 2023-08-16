//83. 문자열 : 확장자
package com.test.question;

import java.util.Scanner;

public class Q083 {

	public static void main(String[] args) {
		
		int mp3=0, jpg=0, java=0, hwp=0, doc=0;
		Scanner scan = new Scanner(System.in);
		
		//입력 10개 받기
		for(int i=0 ; i<9 ; i++) {
			System.out.print("파일명 : ");
			String file = scan.nextLine();
			
			//확장자구분 : 확장자 위치
			int index = file.lastIndexOf(".");
			
			
			if(file.substring(index).equals(".mp3")) {
				mp3++;
			}else if(file.substring(index).equals(".jpg")){
				jpg++;
			}else if(file.substring(index).equals(".java")){
				java++;
			}else if(file.substring(index).equals(".hwp")){
				hwp++;
			}else if(file.substring(index).equals(".doc")){
				doc++;
			}
		}
		System.out.printf("mp3 : %d개\n", mp3);
		System.out.printf("jpg : %d개\n", jpg);
		System.out.printf("java : %d개\n", java);
		System.out.printf("hwp : %d개\n", hwp);
		System.out.printf("doc : %d개\n", doc);			
		
	}
	
}
