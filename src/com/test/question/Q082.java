//82. 문자열 : 숫자합
/*
숫자 입력받아 각각을 잘라서 저장, 각 값의 합
*/
package com.test.question;

import java.util.Scanner;

public class Q082 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 : ");
//		String txt[] = new String[];
		String txt = scan.nextLine();
		
		int sum = 0;	//더한 값
		
		for(int i=0 ; i<txt.length() ; i++){
//			int sum = Integer.parseInt(txt);
//			sum += txt[i];
			sum += txt.charAt(i)-48;
			if(i == txt.length()-1) {
				System.out.printf("%c = %d", txt.charAt(i), sum);
			}else if(i < txt.length()-1) {				
				System.out.printf("%c + ", txt.charAt(i));
			}
			
		}
		
	}

}
