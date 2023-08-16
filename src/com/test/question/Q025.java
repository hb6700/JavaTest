/*
25. 조건문 : 숫자비교
요구사항 : 숫자 2개를 입력받아 큰 수와 작은 수를 출력하시오
조건 : 두 숫자가 얼마의 차이를 보이는지 출력하시오
*/

package com.test.question;

import java.util.Scanner;

public class Q025 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int firstNumber = scan.nextInt();
		System.out.print("두번째 숫자 : ");
		int secondNumber = scan.nextInt();
		
		
		if(firstNumber > secondNumber){
			System.out.printf("큰 수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d이(가) 차이납니다.", firstNumber, secondNumber, firstNumber-secondNumber);
		} else if(firstNumber < secondNumber) {
			System.out.printf("큰 수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d이(가) 차이납니다.", secondNumber, firstNumber, secondNumber-firstNumber);			
		} else {
			System.out.println("두 숫자는 동일합니다");
		}
		
	}//main
		
}
