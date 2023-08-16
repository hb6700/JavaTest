//Q119
//파일 디렉토리 조작 : 분류이동
package com.test.question;

import java.io.File;

public class Q119 {

	public static void main(String[] args) {
		
		File dir = new File("C:\\class\\파일_디렉토리_문제\\직원");
		File[] list = dir.listFiles();
		for(File f : list) {
			//아무게_2014__17.txt
			//아무게_2016_67.txt
			String[] temp = f.getName().split("_");		//'-'을 기준으로 분리
			String name = temp[0];						//분리된 첫번째 뭉텅이 : 아무게
			String year = temp[1];						//두번째 뭉텅이 : 2017
			
			File nameDir = new File(dir.getAbsolutePath() + "\\" + name);
			nameDir.mkdir();
			
			File yearDir = new File(dir.getAbsolutePath() + "\\" + name + "\\" + year);
			yearDir.mkdir();

			File dest = new File(dir.getAbsolutePath() + "\\" + name + "\\" + year + "\\" + f.getName());
			f.renameTo(dest);
			
		}
		
	}//main
	
}//class
