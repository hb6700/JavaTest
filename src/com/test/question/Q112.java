//Q112
package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q112 {

	public static void main(String[] args) {
		
		File dir1 = new File("C:\\class\\code\\java\\file\\AAA\\test.txt");
		File dir2 = new File("C:\\class\\code\\java\\file\\BBB\\test.txt");
		
		System.out.println("파일 이동을 실행합니다.");
		if(dir2.exists()) {
			Scanner scan = new Scanner(System.in);
			System.out.print("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n) : ");
			if(scan.nextLine().equals("y")) {
				dir1.renameTo(dir2);
				System.out.println("y. 파일을 덮어썼습니다.");
			}else {
				
				System.out.println("n. 작업을 취소합니다.");
			}
		}else if(!dir2.exists()){
			System.out.println("xxxx");
		}
		
	}//main
	
}//class
