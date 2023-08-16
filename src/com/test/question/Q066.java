/*
66. 배열 : 로또
중복되지 않는 임의의 숫자 6개(1~45), 오름차순
*/
package com.test.question;

public class Q066 {

	public static void main(String[] args) {
		
		int lotto[] = new int[6];
		String txt = "";

		System.out.print("[");
		
		System.out.print("로또 번호 : ");
		for(int i=0 ; i<6 ; i++) {
			int random = (int)Math.random()*45;
//			if(lotto == random) {
//				//만약 랜덤값이 뽑아놓은 랜덤값에 포함되어있다면
//				//break;
//			}else {	//새로운 랜덤값의 등장이란.
//				System.out.printf("%s, ", txt);
//			}
			lotto[i] = random;
		}//for
		System.out.print("]");
	}//main
	
}

//			for(int j=1 ; j<=45 ; j++) {
//				
//			}