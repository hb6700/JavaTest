//88.
package com.test.question;

import java.util.Scanner;

public class Q088 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		String ment = scan.nextLine();
		
		String[] word = {"바보", "멍청이"};
		
		int count = 0;
		
		//비교
		for(int i=0 ; i<word.length ; i++) {
			//해당 문자열을 찾는 기능 : contains
			while(ment.contains(word[i])) {
				String masking = "";
				for(int j=0;j<word[i].length();j++) {
					masking+="*";
				}
				ment = ment.replaceFirst(word[i], masking);
				count++;
			}
			
		}
		
		System.out.printf("%s\n", ment);
		System.out.printf("금지어를 %d회 마스킹했습니다.\n", count);
				
	}
	
}
