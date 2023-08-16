//Q113
//
package com.test.question;

import java.io.File;
import java.util.Arrays;

public class Q113 {

	public static void main(String[] args) {
		
		//파일위치 가져오기
		File dir = new File("C:\\class\\파일_디렉토리_문제\\음악 파일\\Music");
		//배열로 만들기
		File[] list = dir.listFiles();
		for(int i=0 ; i<list.length ; i++) {
			File temp = new File(dir + "\\" + String.format("[%03d]%s", i+1, list[i].getName()));
			dir.renameTo(temp);
		}
		System.out.println("수정완료");
		
	}//main
	
}//class
