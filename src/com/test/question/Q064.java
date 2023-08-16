/*
64. 배열 : 최대최소
요구사항 : 1~20 사이의 난수를 담고 있는 배열을 생성하고 최댓값과 최솟값을 출력하시오.
조건 
난수를 20개 발생 후 배열에 넣는다.
난수는 1 ~ 20 사이

난수생성 (random)
20개짜리의 배열 생성
숫자 랜덤 생성(1~20사이에서)
최대 최소 찾기
중복숫자는 하나만 출력되도록
*/
package com.test.question;

import java.util.Arrays;

public class Q064 {

	public static void main(String[] args) {
		
		int[] list = new int[20];
		
		for(int i=0 ; i<list.length ; i++) {
			int random = (int)(Math.random()*20)+1;
			list[i] = random;
			System.out.printf("%d, ",list[i]);
		}
		
		for(int i=0 ; i<list.length ; i++) {
			int max = 0, min = 20;
			int big = 0, small = 0;
			if(list[i]<list[i+1]) {
				big = list[i+1];
				small = list[i];
				if(big>max) {
					max = list[i+1];
				}
				if(small<min) {
					min = list[i];
				}
			}
			
			
			
			
			
		}
		
		
	}
//			System.out.printf("%d, ", random);
}

//int random = (int)(Math.random()*20);
//
//for(int i=0 ; i<20 ; i++) {
//	int list[] = new int[i];
//	list[i] = random;
//	
////			String result = (Arrays.toString(list));
////			System.out.printf("%s ", result);