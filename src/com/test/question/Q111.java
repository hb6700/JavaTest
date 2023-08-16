//Q111
//파일디렉토리 : 확장자 검색
package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q111 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("폴더 : ");
		String folder = scan.nextLine();
		System.out.print("확장자 : ");
		String ext = scan.nextLine();
		//대문자로 입력받아도 전부 소문자로 변환
		ext = ext.toLowerCase();
		
		File file = new File(folder);
		File[] fileList = file.listFiles();
		for(File f : fileList) {
			if(f.isFile()) {
				//endsWith() : 대상 문자열(getName)이 해당 문자열(ext)로 끝나는지 확인
				if(f.getName().endsWith(ext)) {
					System.out.println(f.getName());
				}
			}
		}
	}	
}
//C:\class\dev\eclipse
