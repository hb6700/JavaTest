//Q114
//HashMap<String, Integer>
package com.test.question;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;

public class Q114 {

	public static void main(String[] args) {
		
		File dir = new File("C:\\class\\파일_디렉토리_문제\\확장자별 카운트");
		File[] list = dir.listFiles();
		//키>확장자, 값>카운트
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		for(File f : list) {
			//System.out.println(f.getName());
			String ext = getExtension(f.getName());
			if(!count.containsKey(ext)) {
				count.put(ext, 1);						//새로운 확장자 등록
			}else {
				count.put(ext, count.get(ext)+1);		//count++								
			}
			
		}
		System.out.println(count);
		
	}//main

	private static String getExtension(String name) {
		//test.png
//		System.out.println(name);
		String[] temp = name.split("\\.");		//점을 기준으로 분리
//		System.out.println(temp.length);
		String ext = temp[temp.length-1].toLowerCase();

//		System.out.println(Arrays.toString(temp));
//		System.out.println(ext);
		
		//return name.split("\\.")[temp.length-1]toLowerCase();
		return ext;
	}
	
}//class
