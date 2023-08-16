//Q115
//파일디렉토리조작 : 파일삭제
package com.test.question;

import java.io.File;

public class Q115 {

	public static void main(String[] args) {
		
		File file = new File("C:\\class\\파일_디렉토리_문제\\파일 제거");
		File[] list = file.listFiles();
		int count = 0;
		
//		for(File file : list) {			
//			if(file.length() == 0) {
//				file.delete();
//				count++;
//			}	
//		}
		
		System.out.printf("총 %d개의 파일을 삭제했습니다.", count);
		
	}//main
	
}//class
