//86.
package com.test.question;

import java.util.Scanner;

public class Q086 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 : ");
		String num = scan.nextLine();
		
		//(,)횟수
		int repeat = num.length() / 3;
		//맨 앞자리 계산
		int prefix = num.length() % 3;
		//맨 처음부터 첫 콤마 자리까지 문자열 삽입
		String result=num.substring(0, prefix);
		
		for(int i=0;i<repeat;i++){
			int begin = prefix+3*i;
			//prefix뒤에 바로 콤마찍고 그다음세자리뒤로 이동
			result+="," + num.substring(begin, begin+3);
		}

		//3의 배수인 경우 맨 앞자리에 콤마(,)가 출력되는것을 방지
		if(result.substring(0,1).equals(",")){ 
			result = result.substring(1); 
		}

		System.out.printf("결과 : %s\n", result);	
	}
	
}