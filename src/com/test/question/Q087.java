//87.
package com.test.question;

import java.util.Scanner;

public class Q087 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("단어 : ");
		String sentence = scan.nextLine();
		
		for(int i=0 ; i<sentence.length() ; i++) {
			char alphabet = sentence.charAt(i);
			if('A'<=alphabet && 'Z'>=alphabet) {
				if(i!=0) {
					System.out.print(" ");
				}
			}
			System.out.print(alphabet);
		}
		
	}
	
}
