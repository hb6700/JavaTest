/*
45. 반복문 : 369
요구사항 : 사용자가 입력한 범위의 숫자까지 369 게임 과정을 출력하시오.
조건 : 최대 3자리까지만 입력하시오.
*/
package com.test.question;

import java.util.Scanner;

public class Q045 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("최대 숫자 : ");
		int input = scan.nextInt();
		if(input < 1000) {
			for(int i = 1 ; i <= input ; i++) {
				//3 -> 짝 치환x
				//13 16 19..
				//각 자리수를 쪼개서 3 6 9를 인식해서 그걸로 치환기능 이용
				
			}
		}else {
			System.out.println("숫자는 999까지만 입력 가능합니다.");
		}
	}	
}

/*
- 369
input / 100 : 100의 자리 : hundred
input / 10 % 10 : 10의 자리 : ten
input % 10 : 1의 자리 : one

int hundred = input / 100;
int ten = input /10 % 10;
int one = input % 10;

if (input < 10){
	
}else if(input < 100){

}else if(input < 1000){

}else{
	System.out.println("다시 입력하세요");
}

if (hundred == 3){
	
}

if(hundred, ten, one % 3 == 0;){
	clap++;
}
for(int i = 1 ; i <=clap ; i++){
	//System.out.print("짝");
}

*/