/*
54. 반복문 : 소수
요구사항 : 2부터 100사이의 소수를 구하시오.
조건 : 소수: 1과 자기자신으로밖에 나눠지지 않는 수
2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
*/
package com.test.question;

public class Q054 {

	public static void main(String[] args) {
		
		/*
		2~100의 숫자를 for문으로 받는거 하나 생성(변수 i)
		그 변수에서 1까지 값을 또 하나의 변수로 만들어서 위 for문 안에 집어넣기(변수 j)
		1은 제외, 2부터 100 전까지 값을 하나씩 증가하며 나눠서 나눠진 값을 체크
		나머지로 확인하고 나머지가 없는 수가 나오면 제외시키기
		 */
		
		for(int i=2 ; i<=100 ; i++) {	//비교할 숫자
			for(int j=2 ; j<i ; j++) {	//비교위해 사용
				if(i % j == 0) {		//소수 계산 -> 1과 자기자신을 제외한 숫자들로 나누었을때 나머지가 생기지 않는 경우 소수가 아니다 
					break;
				}
				if(j+1 == i) {
					if(i % j != 0) {
						System.out.print(i + ", ");
					}
				}	
			}
		
		}
			
		
	}
	
}
