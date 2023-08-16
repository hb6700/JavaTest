/*
41. 반복문 : 숫자 합
조건 : 누적값이 1000을 넘어가는 순간 루프를 종료하시오.
*/
package com.test.question;

public class Q041 {
	
	public static void main(String[] args) {
		
		int total = 0;
		
		for(int i = 1;;i++) {
			total += i;
			if(total<1000) {
				if(i%10 == 0) {
					System.out.printf("%d + \n", i);
				}else {
					System.out.printf("%d + ", i);
				}
			}else {
				//total += i;
				System.out.printf("%d = ", i);
				break;
			}
		}//for
		System.out.println(total);
		
	}

}
