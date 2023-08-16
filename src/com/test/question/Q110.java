//Q110
package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q110 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("파일 경로 : ");
		String path = scan.nextLine();
		
		File file = new File(path);
		System.out.println(file.getAbsolutePath());
		
		
		int fileNameNo = path.lastIndexOf("\\");
		String fileResult = path.substring(fileNameNo+1);
		System.out.printf("파일명 : %s\n", fileResult);
		
		int fileType = path.lastIndexOf(".");
		String typeResult = path.substring(fileType+1);
		System.out.printf("종류 : %s 파일\n", typeResult);
		
		
//		File file = new File(path);
		if(file.exists()) {
			if(file.length()/1024 == 0) {
				System.out.printf("파일 크기 : %sB", file.length());
			}else if(file.length()/(1024*1024) == 0) {
				System.out.printf("파일 크기 : %sKB", file.length()/1024);				
			}else if(file.length()/(1024*1024*1024) == 0) {
				System.out.printf("파일 크기 : %sMB", file.length()/1024/1024);				
			}else if(file.length()/(1024*1024*1024*1024) == 0) {
				System.out.printf("파일 크기 : %sGB", file.length()/1024/1024/1024);				
			}else if(file.length()/(1024*1024*1024*1024*1024) == 0) {
				System.out.printf("파일 크기 : %sTB", file.length()/1024/1024/1024/1024);				
			}
		}else {
			System.out.println("xxxx");
			
		}
		
		
	}//main
	
}//class
