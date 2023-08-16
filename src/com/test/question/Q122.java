//Q122
//파일입출력 : 성적처리
package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Q122 {

	public static void main(String[] args) {

		try {
			//파일 읽기
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\성적.dat"));
			
			//합격자, 불합격자 배열 ArrayList
			ArrayList<String> pass = new ArrayList<String>();
			ArrayList<String> fail = new ArrayList<String>();

			String line = "";
			while ((line = reader.readLine()) != null) {
				// 점수 추출
				String[] score = line.split(",");
				
				int kor = Integer.parseInt(score[1]);
				int eng = Integer.parseInt(score[2]);
				int math = Integer.parseInt(score[3]);

				//합격 조건: 3과목 평균 60점 이상
				//과락 조건: 1과목 40점 미만
				if(((kor + eng + math)/3>=60) && (kor>=40) && (eng>=40) && (math>=40)) {
					pass.add(score[0]);
				}else {
					fail.add(score[0]);					
				}
				
			}
			//합격자
			System.out.println("[합격자]");
			for(String name : pass) {
				System.out.println(name);
			}
			//불합격자
			System.out.println("[불합격자]");
			for(String name : fail) {
				System.out.println(name);
			}
			
		} catch (Exception e) {
			System.out.println("오류");
			e.printStackTrace();
		}

	}// main

}// class
