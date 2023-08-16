//89
package com.test.question;

import java.util.Scanner;

public class Q089 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액(원) : ");
		String money = scan.nextLine();
		String[] m = money.split("");
		System.out.println(m[1]);
		String[] unit = {"천", "백", "십", "만", "천", "백", "십", "원"};
		String result = "";
		
		System.out.print("일금 ");
		for(int i=0 ; i<m.length ; i++) {
//			if(m[i]==0) {
//				
//			}
			result = m[i]+unit[i];
			System.out.print(result);
		}
//		System.out.printf("%s", result);
	}
	
}
