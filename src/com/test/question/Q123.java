//Q123
//
package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q123 {

	public static void main(String[] args) {
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\단일검색.dat"));
			
			Scanner scan = new Scanner(System.in);
			System.out.print("이름 : ");
			String name = scan.nextLine();
			
			String line = "";
			
			while((line = reader.readLine()) != null) {
				String[] temp = line.split(",");
				
				if(temp[1].equals(name)) {
					//출력
					System.out.printf("[%s]\n", name);
					System.out.printf("번호 : %s\n", temp[0]);
					System.out.printf("주소 : %s\n", temp[2]);
					System.out.printf("전화 :%s\n", temp[3]);	
					break;
				}
				
			}
			
		} catch (Exception e) {
			System.out.println("오류");
			e.printStackTrace();
		}
		
	}//main
	
}//class
