package com.test.java.io;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class Ex64_File {

	//누적 변수
	private static int count = 0;		//파일 개수
	private static int dcount = 0;		//폴더 개수
	private static long length = 0;		//폴더 크기
	
	public static void main(String[] args) {
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		//m13();
		
		//m14();		//*******
		m15();
		
	}//main

	private static void m15() {
		//특정 폴더 > 파일 개수 세기
		File dir = new File("C:\\class\\dev\\eclipse");
		if(dir.exists()) {
			countFile(dir);
			System.out.println(count);
			System.out.println(dcount);			
			System.out.println(length);			
		}
	}

	private static void countFile(File dir) {
		//1. 목록 가져오기
		File[] list = dir.listFiles();
		
		//2. 파일 개수
		for(File subfile : list) {
			if(subfile.isFile()) {
				//너 파일이니? 맞으면 count 중가
				count++;
				length += subfile.length();		//파일 크기를 누적
			}
		}
		
		//3. 자식 폴더를 대상으로 1~2번을 반복
		for(File subdir : list) {
			if(subdir.isDirectory()) {
				//너 폴더니? 그러면 dcount 증가
				dcount++;
				
				//1~2번 식행 > 3번 > 손자폴더
				countFile(subdir);		//자식 폴더 > 반복
			}
		}
	}

	private static void m14() {
		//특정 폴더 > 파일 개수 세기
		File dir = new File("C:\\class\\dev\\eclipse");
		int count = 0;		//누적변수
	
		if(dir.exists()) {
			File[] list = dir.listFiles();
			for(File subfile : list) {
				if(subfile.isFile()) {
					count++;
				}
			}	
			for(File subdir : list) {
				if(subdir.isDirectory()){
					//자식폴더 > 내용
					File[] sublist = subdir.listFiles();
					for(File subsubfile :sublist) {
						if(subsubfile.isFile()) {
							count++;							
						}
					}
					for(File subsubdir : sublist) {
						if(subsubdir.isDirectory()){
							//손자폴더
							File[] subsublist = subsubdir.listFiles();
							for(File subsubsubfile : subsublist) {
								if(subsubsubfile.isFile()) {
									count++;
								}
							}
						}	
					}
				}	
			}
			System.out.printf("총 파일 개수 : %,d개\n", count);
		}
	}

	private static void m13() {
		//특정폴더의 내용 보기(자식폴더, 파일의 목록 보기)
		String path = "C:\\class\\dev\\eclipse";
		File dir = new File(path);
		if(dir.exists()) {
			//dir.list();				//return : 파일명을 문자열 배열로 반환
			//dir.listFiles();			//return :
			
//			String[] list = dir.list();
//			for(String f : list) {
//				//파일명, 폴더명
//				//System.out.println(f);
//				
//				File file = new File(path + "\\" + f);
//				System.out.println(f + " > " + (file.isFile() ? "파일" : "폴더"));
//			}
			
//			File[] list = dir.listFiles();
//			for(File f : list) {
//				System.out.printf("%s - %s\n", f.getName(), f.isDirectory() ? "폴더" : "파일");
//			}
			
			//탐색기 느낌
			File[] list = dir.listFiles();
			for(File d : list) {
				if(d.isDirectory()) {
					System.out.printf("[%s]\n" , d.getName());
				}
			}
			for(File f : list) {
				if(f.isFile()) {
					System.out.println(f.getName());
				}
			}
		}
		
	}

	private static void m12() {
		//파일 삭제하기
		//삭제 시 휴지통 ㄴㄴ 완전 삭제 ㅇㅇ
		//내용물(파일, 자식폴더)이 있으면 삭제가 불가능하다.
		File dir = new File("C:\\class\\code\\java\\aaa");
		//File dir = new File("C:\\class\\code\\java\\move\\할 일");		//빈 폴더일 때만 실행 가능
		
		// 직접 구현 
		
		
		if(dir.exists()) {
			System.out.println(dir.delete());
		}
	}

	private static void m11() {
		//폴더 이동하기
		File dir = new File("C:\\class\\code\\java\\file\\할 일");
		File dir2 = new File("C:\\class\\code\\java\\move\\할 일");
		if(dir.exists()) {
			System.out.println(dir.renameTo(dir2));
		}		
	}

	private static void m10() {
		//폴더 이름 바꾸기
		File dir = new File("C:\\class\\code\\java\\file\\날짜");
		File dir2 = new File("C:\\class\\code\\java\\file\\할 일");
		if(dir.exists()) {
			System.out.println(dir.renameTo(dir2));
		}
	}

	private static void m9() {
		//요구사항) 날짜별 폴더 > 2023-01-01 ~ 2023-12-31
		Calendar c = Calendar.getInstance();
		c.set(2023, 0, 1);
//		System.out.println(c.getActualMaximum(Calendar.DATE));				//1월달의 최대일
//		System.out.println(c.getActualMaximum(Calendar.DAY_OF_YEAR));		//올해가 몇일?
		
		int max = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		
		for(int i=0 ; i<max ; i++){
			//"2023-01-01"
			String name = String.format("%tF", c);
			System.out.println(name);
		
			File dir = new File("C:\\class\\code\\java\\file\\날짜\\"+ name);
			dir.mkdirs();
			
			c.add(Calendar.DATE, 1);
			
		}
		
	}

	//여러 폴더 한 번에 생성
	private static void m8() {
		//요구사항) 회원 > 회원명으로 개인폴더 생성
		String[] member = {"홍길동", "아무개", "이순신", "권율", "유관순"};
		for(int i=0 ; i<member.length ; i++) {
			String path = String.format("C:\\class\\code\\java\\file\\회원\\[개인폴더]%s님", member[i]);
			File dir = new File(path);
			System.out.println(dir.mkdirs());
		}
		
	}

	private static void m7() {
		//폴더  만들기
//		File dir = new File("C:\\class\\code\\java\\aaa");
		File dir = new File("C:\\class\\code\\java\\bbb\\ccc");
		if(!dir.exists()) {
//			System.out.println(dir.mkdir());		//폴더 1개
			System.out.println(dir.mkdirs());		//연관된 폴더 모두 함께 생성
		}
	
	}

	private static void m6() {
		//파일 : 삭제하기
		File file = new File("C:\\class\\code\\java\\move\\데이터.txt");
		
		if (file.exists()) {
			//파일 이동 > 
			//파일 삭제
			System.out.println(file.delete());
			
		}
	}

	private static void m5() {
		File file = new File("C:\\class\\code\\java\\file\\hello.txt");
		File file2 = new File("C:\\class\\code\\java\\move\\데이터.txt");
		if(file.exists()) {
//			System.out.println(file.renameTo(file2));
			System.out.println(file.renameTo(file2));
		}else {
			System.out.println("이미 동일한 파일이 존재합니다.");
		}
	}
	
	private static void m4() {
		//파일 > 파일명 바꾸기
		File file = new File("C:\\class\\code\\java\\file\\hello.txt");
		File file2 = new File("C:\\class\\code\\java\\file\\데이터.txt");
		if(file.exists()) {	//Ex64_File.java
			System.out.println(file.renameTo(file2));
		}else {
			System.out.println("이미 동일한 파일이 존재합니다.");
		}
		
	}
	
//	private static void m3() {
//		//파일 : 새파일 만들기
//		//참조객체
//		File file = new File("C:\\class\\code\\java\\file\\hello.txt");
//		
//		if(!file.exists()) {
//			try {
//				System.out.println(file.createNewFile());
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}else {
//			System.out.println("이미 동일한 파일이 존재합니다.");
//		}
//
//		//폴더 : 이동
//	}

	private static void m3() {
		//파일 : 새파일 만들기
		//참조객체
		File file = new File("C:\\class\\code\\java\\file\\hello.txt");
		
		if(!file.exists()) {
			try {
				System.out.println(file.createNewFile());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("이미 동일한 파일이 존재합니다.");
		}	
		
	}

	private static void m2() {
		//폴더 > 정보
		//폴더(folder), 디렉토리(Directory)
		
		//C:\class\code\java\file
		
		//폴더 참조 객체 : 폴더는 파일이다.
		File dir = new File("C:\\class\\code\\java\\file");
		
		if(dir.exists()) {
			System.out.println("폴더가 있습니다.");

			System.out.println(dir.getName());				//File
			System.out.println(dir.isFile());				//false
			System.out.println(dir.isDirectory());			//true
			System.out.println(dir.length());				//0 : 폴더 자체의 크기는 없음, 결과는 무조건 0
			System.out.println(dir.getAbsolutePath());		//C:\class\code\java\file
			System.out.println(dir.lastModified());			//마지막에 수정한 날짜 : 1691384954255
			System.out.println(dir.isHidden());				//숨겨진 파일인가요? : false
			System.out.println(dir.getParent());			//C:\class\code\java
		}else {
			System.out.println("폴더가 없습니다.");			
		}
	}

	private static void m1() {
		//파일 > 정보
		//C:\class\code\java\file  				폴더 파일 생성
		//C:\class\code\java\file\data.txt		텍스트 파일 생성
		
		// 자바 프로그램에서 외부의 파일을 접근
		//1. 외부 파일을 참조하는 참조객체 생성 > 대리자, 위임자
		//2. 참조 객체 조작 > 행동 > 외부 파일에 적용
		
		//파일 참조 클래스 > 객체 > java.io.file
		File file = new File("C:\\class\\code\\java\\file\\data.txt");
		
//		System.out.println(file.exists());		//파일있는지 확인
		if(file.exists()) {
			System.out.println("파일이 있습니다.");
			
			//업무
			System.out.println(file.getName());				//data.txt
			System.out.println(file.isFile());				//true
			System.out.println(file.isDirectory());			//false
			System.out.println(file.length());				//30 : 파일 크기(byte)
			System.out.println(file.getAbsolutePath());		//C:\class\code\java\file\data.txt
			System.out.println(file.lastModified());		//마지막에 수정한 날짜 : 1691379575747
			System.out.println(file.isHidden());			//숨겨진 파일인가요? : false
			
			//tick > 년월일시분초
			Calendar c1 = Calendar.getInstance();
			System.out.println(c1.getTimeInMillis());
			c1.setTimeInMillis(file.lastModified());
			
			System.out.printf("%tF %tT\n", c1, c1);
			
			
		}else {
			System.out.println("파일이 없습니다.");
		}
		
		
		
	}//m1
	
}//class
