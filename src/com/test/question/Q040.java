//40. 반복문 : 숫자합
package com.test.question;

import java.util.Scanner;

public class Q040 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int start = scan.nextInt();
		System.out.print("종료 숫자 : ");
		int end = scan.nextInt();
		
		int total = 0;
		
		for(int i=start ; i<=end ; i++) {
			if(i != end) {
				if(i % 2 == 0) {	//짝수
					System.out.printf("%d + ", i);									
					total = total - i;
				}else {				//홀수
					total = total + i;
					System.out.printf("%d - ", i);									
				}
			}else if(i == end) {
				System.out.printf("%d = ", end);
				if(end % 2 == 0) {
					total -= i;
				}else {
					total += i;					
				}
			}
		}//for
		System.out.println(total);
		
	}
	
}
