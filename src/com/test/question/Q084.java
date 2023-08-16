//84. 
package com.test.question;

public class Q084 {

	public static void main(String[] args) {
	
		int index = 0;
		int count = 0;
		
		String content = "안녕~ 길동아길동아길동아 길동아~ 잘가~ 길동아";
		String word = "길동";

		for(int i=0;;i++) {
			index = content.indexOf(word);
					
			if(index > -1) {
				count++;
				//찾은곳까지의 문자열을 지우고 새로 등록(?
				content = content.substring(index+word.length());
			}else {
				break;				
			}
		}
		System.out.printf("길동이 : %d개\n", count);	
	
	}
	
}
