//Q120
//파일 입출력 : 이름 바꾸기
package com.test.question;

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q120 {

//	public static finalx String FILE = "C:\\Users\\user\\Downloads\\파일_입출력_문제\\";
	
	public static void main(String[] args) {

		try {
			//읽을 파일
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\이름수정.dat"));
			//쓸 파일
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\user\\Downloads\\파일_입출력_문제\\이름수정_수정.dat"));
			
			//문자열 변수 초기화
			String line = "";
			
			while((line = reader.readLine()) != null) {
				//유재석 > 메뚜기
				line = line.replace("유재석", "메뚜기");
				//줄바꿈해주려고 넣었는데 빼도 될듯...
				line = line.replace(".", ".\n");
				writer.write(line);
			}
			reader.close();
			writer.close();
			
			//잘했음
			System.out.println("변환 후 다른 이름으로 저장하였습니다.");
			
		}catch(Exception e) {
			//다시하셈
			System.out.println("XXXXXX");
			e.printStackTrace();
		}
		
	}//main
	
}//class


