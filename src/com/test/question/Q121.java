//Q121
//파일 입출력 : 숫자 바꾸기
package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q121 {

	public static void main(String[] args) {
		
		try {
			//읽을 파일
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\숫자.dat"));
			//쓸 파일
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\user\\Downloads\\파일_입출력_문제\\숫자_변환.dat"));
			
			//문자열 변수 초기화
			String line = "";
//			String[] korNum = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
			
			while((line = reader.readLine()) != null) {
				line = line.replace("0", "영");
				line = line.replace("1", "일");
				line = line.replace("2", "이");
				line = line.replace("3", "삼");
				line = line.replace("4", "사");
				line = line.replace("5", "오");
				line = line.replace("6", "육");
				line = line.replace("7", "칠");
				line = line.replace("8", "팔");
				line = line.replace("9", "구");

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
