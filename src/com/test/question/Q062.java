/*
62. 배열 : 이름정렬
조건 : 오름차순
*/
package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q062 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수 : ");
		String[] names = new String[scan.nextInt()];		//입력받은 학생수를 String[] names의 크기로 지정
		scan.nextLine();									//nextInt다음에 nextLine으로 입력받기 위해 초기화
		for(int i=0 ; i<names.length ; i++) {				//반복문으로 0부터 length(배열 크기:방 개수)까지의 학생이름을 입력
			System.out.print("학생명 : ");
			String name = scan.nextLine();					//학생명 입력
			names[i] = name;								//i를 이용해서 0번째 배열부터 차례대로 학생이름 입력
		}
		System.out.println();
		
		//이름 오름차순 
		
		System.out.printf("입력한 학생은 총 %d명 입니다.\n", names.length);
		for(int j=0 ; j<names.length ; j++) {
			System.out.printf("%d. %s\n", j+1, names[j]);
		}
		
	}
	
}
