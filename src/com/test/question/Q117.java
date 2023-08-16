//Q117
package com.test.question;

import java.io.File;

public class Q117 {

	public static void main(String[] args) {
	
		//내용있는 폴더 삭제하기
		File dir = new File("C:\\class\\파일_디렉토리_문제\\폴더 삭제\\delete");
		
		//탐색
		delete(dir);
		System.out.println("삭-제~★");
		
	}//main

	private static void delete(File dir) {
		File[] list = dir.listFiles();
		
		for(File f : list) {
			if(f.isFile()) {
				//action
				f.delete();			//모든 파일들을 전부 남김없이 삭제
				//count++
			}
		}
		
		for(File d : list) {
			if(d.isDirectory()){
				delete(d);
			}
		}
		
		dir.delete();
		//count++
	}
	
}//class
