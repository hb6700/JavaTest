/*
59. 반복문 : 숫자합
조건 : 마지막 숫자가 100이 넘기 전까지 출력하시오.
//
1 + 2 + 4 + 7 + 11 + 16 + 22 + 29 + 37 + 46 + 56 + 67 + 79 + 92 +  = 469
*/
package com.test.question;

public class Q059 {
	
	public static void main(String[] args) {
		
		int sum = 1;
		String txt = "";

		while(true) {
			int num = 1;
			int add = 1;
			num += add;
			if(100 < num) {
				break;
			}
			sum = add + num;
			txt = num + "+";
			add++;
			
		}
		System.out.printf("1 + %s = %d\n", txt, sum);
		
	}

}

/*
int i = 1;
		while(i<=100) {
			int j=1;
			sum = j;
			System.out.print("1 + ");
			System.out.printf("%d + ", );
			System.out.printf("= %d", sum);
		}
		
*/