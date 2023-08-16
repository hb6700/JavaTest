/*
Ex32_Array.java
배열(Array)
- 자료구조
- 자료형 -> 참조형
- 집합 -> 집합자료형 : 데이터를 여러 개 저장할 수 있는 자료형
- 같은 자료형, 같은 성격의 데이터를 집어넣는 집합

배열의 인덱스 

배열복사
1. 얕은 복사(shallow Copy)
- 주소값 복사
- side Effect 발생
2. 깊은 복사(Deep Copy)
- 요소 복사
- side Effect 없음

유틸리티클래스
- int -> Integer
- double -> Double
Arrays클래스
- 배열 유틸리티 클래스
//배열의 자동 초기화
//배열(참조형)은 생성 직 후에 자동으로 초기화가 된다.
 * 초기화 규칙
 - 정수 배열 : 0
 - 실수 배열 : 0.0
 - 문자 배열 : null
 - 
 - 
 
정렬 : 요소간의 크기를 비교해서 재배치 하는 작업
1. 오름차순 정렬
	a. 숫자 : 작은 수 -> 큰 수
	b. 문자열 : 문자코드값 순으로
	c. 날짜시간 : 과거 -> 미래
2. 내림차순
	a. 숫자 : 큰 수 -> 작은 수
	b. 문자열 : 문자코드값 역순으로
	c. 날짜시간 : 미래 -> 과거

정렬 구현
1. 개발자 구현
2. JDK or Library 사용 (더 사용)


*/
package com.test.java;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Ex32_Array {

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
		
		//Q064();
		//Q065();
		//Q067();
		Q068();
		
	}//main

	//배열의 요소를 삭제하시오
	private static void Q068() {
		int[] nums = {5,6,1,3,2,8,7,10,4,9};
		int index = 2;
		
		System.out.println(Arrays.toString(nums));
		
		for (int i=index ; i<nums.length-1 ; i++) {
			//왼쪽 방 = 오른쪽 방
			nums[i] = nums[i+1];
		}
		nums[nums.length-1] = 0;
		
		System.out.println(Arrays.toString(nums));
	}

	//Q067 : 배열에 요소를 삽입
	private static void Q067() {
		//Right shift : 배열의 삽입
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[] {5, 6, 1, 3, 2, 0, 0, 0, 0, 0};
		System.out.print("삽입 위치 : ");
		int index = scan.nextInt();
		System.out.print("값 : ");
		int value = scan.nextInt();
		
		System.out.println(Arrays.toString(nums));
		
		//right shift
		for(int i=nums.length-2 ; i>=index ; i++) {
			//오른쪽 방 = 왼쪽 방
			nums[i+1]=nums[i];
		}
		nums[index] = value;
		System.out.println(Arrays.toString(nums));
		
		
	}

	//Q065 : 중복되지 않는 임의의 숫자 6개를 만드시오.(로또)
	private static void Q065() {
		int[] lotto = new int[6];		
		for(int j=0 ; j<5 ;j++) {
			for(int i=0 ; i<lotto.length ; i++) {
				
				int n = (int)(Math.random() * 45) + 1;			//1~45사이의 수 랜덤
				
				if(isDuplicate(lotto, n)) {
					i--;										//중복이 나오면 i--를 사용해서 
				}else {
					lotto[i] = n;								//배열에 집어넣음	
					
				}
			}		//for i
		Arrays.sort(lotto);									//정렬
		System.out.println(Arrays.toString(lotto));			//출력
		}		//for j
	}

	// TODO Auto-generated method stub
	private static boolean isDuplicate(int[] lotto, int n) {
		for(int i=0 ; i<lotto.length ; i++) {
			if(lotto[i] == n) {
				return true;		//똑같은 값임 다시;
			}
		}
		return false;				//중복 노노링
	}

	//Q064 : 1~20 사이의 난수를 담고 있는 배열을 생성하고 최댓값과 최솟값을 출력하시오
	private static void Q064() {
		int[] nums = new int[20];
		for(int i=0 ; i<nums.length ; i++) {
			nums[i] = (int)(Math.random() * 20);
		}
		
		int max = 0, min = 21;			//1~20사이의 값들과 비교하기 위해서 변수 지정
		for(int i=0 ; i<nums.length ; i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
			if(nums[i]<min) {
				min=nums[i];
			}
		}
		System.out.println("원본 : " + Arrays.toString(nums));
		System.out.println("최댓값 : "+ max);
		System.out.println("최솟값 : "+ min);
	}

	//자바에서 제공하는 버블정렬 - 퀵정렬
	private static void m13() {
		int[] nums = {5, 3, 1, 4, 2};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));		
	}

	//정렬
	private static void m12() {
		
		//버블 정렬 - 오름차순
		int[] nums = {5, 3, 1, 4, 2};
		System.out.println(Arrays.toString(nums));
		System.out.println();
		
		for(int i=0 ; i<nums.length-1 ; i++) {				//0, 1, 2, 3 -> cycle
			for(int j=0 ; j<nums.length-1-i ; j++) {		//사이클 내에 비교하는 횟수 - 비교후 스왑
				if(nums[j] < nums[j+1]) {					//오름차순(>), 내림차순(<)
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}//for
		System.out.println(Arrays.toString(nums));
	}

	//배열 초기화 리스트
	private static void m11() {
		int[] nums = new int[3];
		System.out.println(Arrays.toString(nums));
		//초기화
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		System.out.println(Arrays.toString(nums));
		
		int[] nums2 = new int[] {100, 200, 300};
		System.out.println(Arrays.toString(nums2));
		
		int[] nums3 = {100, 200, 300};
		System.out.println(Arrays.toString(nums3));
		
		String[] names1 = new String[3];
		names1[0] = "홍길동";
		names1[1] = "아무개";
		names1[2] = "하하하";
		
		String[] names2 = {"가나다", "라마바", "사아자"};
		
		System.out.println(Arrays.toString(names1));
		System.out.println(Arrays.toString(names2));
		
	}

	//
	private static void m10() {
		int a;			//null
		System.out.println();
		
		//배열의 자동 초기화
		//배열(참조형)은 생성 직 후에 자동으로 초기화가 된다.		
		int[] nums = new int[3];		//int x 3
		System.out.println(nums[0]);
		System.out.println(Arrays.toString(nums));
	
		double[] nums2 = new double[3];		//int x 3
		System.out.println(Arrays.toString(nums));
		
		char[] list1 = new char[3];
		System.out.println(Arrays.toString(list1));

		boolean[] list2 = new boolean[3];
		System.out.println(Arrays.toString(list2));
		
		String[] list3 = new String[3];
		System.out.println(Arrays.toString(list3));
	}

	//유틸리티클래스
	private static void m9() {
		int[] nums = new int[3];
		nums[0] = 111;
		nums[1] = 222;
		nums[2] = 333;
		
		//배열궁금?출력!
		printArray(nums);

		//덤프(dump) : 객체의 상태를 하나의 문자열로 풀어내는 행동
		System.out.println(nums);			//[I@7d6f77cc
		
		System.out.println(Arrays.toString(nums));
		
		//깊은 복사 메소드
		int[] copy;
		
		copy = Arrays.copyOfRange(nums, 0, nums.length) ;
		
		nums[0] = 1000;
		System.out.println (Arrays.toString(nums));
		System.out.println (Arrays.toString(copy));	
		
	}
	public static void printArray(int[] nums) {
		//배열의 상태가 궁금? 출력!
		for(int i=0; i<nums.length ; i++) {
			System.out.println(nums[i]);
		}	
	}

	//깊은 복사
	private static void m8() {
		int[] nums = new int[3];
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		int[] copy = new int[3];
		for(int i=0; i<nums.length ; i++) {
			//배열 = 배열(x) 
			//copy의 i위치의 값 : int
			copy[i] = nums[i];
		}
		System.out.println("nums[0] : " + nums[0]);
		System.out.println("copy[0] : " + copy[0]);
	}

	//배열 복사 - 얇은 복사
	//******* 개발자가 만드는 모든 지역변수는 Stack에 생성한다.
	private static void m7() {
		
		//값형에서만 일어나는 동작↓ : side effect가 발생되지 않는다.
		int a = 10;
		int b;
		b = a;								//a = b = 10
		
		//원본 수정 : 복사본에게 영향을 미치는지 확인
		a = 20;								//a = 20, b = 10
		System.out.println("a : " + a);		//20		
		System.out.println("b : " + b);		//10
		
		//배열 생성
		int[] nums = new int[3];
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		//int배열 copy변수 생성
		//******* 배열 변수끼리는 복사는 주소값 복사이다
		int[] copy;
		//int[] = int[]
		copy = nums;
		
		//원본 수정
		//*****nums와 copy는 같은 주소값을 가지고, 같은 배열을 가리킨다. 둘중 하나를 조작하면 나머지 배열도 영향을 받는다
		// ▲ Side Effect가 발생한다
		nums[0] = 1000;
		
		System.out.println("nums[0] : " + nums[0]);
		System.out.println("copy[0] : " + copy[0]);
		
	}

	//배열의 길이는 런타임 때 정할 수도 있다.
	private static void m6() {
		//학생수(= 배열 크기)
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수 : ");
		int count = scan.nextInt();
		//입력받은 학생수(배열크기)만큼 데이터 생성
		int[] kors = new int[count];
		
		System.out.println(kors.length);
	}

	//********** 메모리의 공간은 한번 할당되면 절대(100%)로 공간을 더 늘리거나 줄일 수 없다.
	//********** 배열은 처음부터 사용하는 최대 길이를 미리 예측하기 : 나중에 수정 불가!....!!
	private static void m5() {
		int n;		//4byte
		
		int[] nums = new int[3];	//4byte x 3 = 12byte
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		//공간 확장 : 방이 하나 더 필요할 경우
//		nums[3] = 400;
	}

	//각 자료형
	private static void m4() {
		//정수 배열(byte, short, int, long)
		long[] list1 = new long[5];
		list1[0] = 100;
		System.out.println(list1[0]);
		
		//실수 배열(float, double)
		double[] list2 = new double[5];
		list2[0] = 100;
		System.out.println(list2[0]);
		
		//문자 배열(char)
		char[] list3 = new char[5];
		list3[0] = 'A';
		System.out.println(list3[0]);
		
		//논리배열(boolean)
		boolean[] list4 = new boolean[5];
		list4[0] = true;
		System.out.println(list4[0]);
		
		//참조형
		String[] list5 = new String[5];
		list5[0] = "홍길동";
		System.out.println(list5[0]);
		
		//Calendar c1;
		//캘린더 저장변수를 5개 생성(o) 캘린더 5개를 만든게 아니라
		Calendar[] list6 = new Calendar[5];
		list6[0] = Calendar.getInstance();
		System.out.printf("%tF\n", list6[0]);
		
	}

	//
	private static void m3() {
		//길이(방 개수) : 3, 인덱스(방 번호) : 0~2 -> 길이-1
		//방 1개(데이터) : 요소(Element)
		int nums[] = new int[3];
//		nums[0] = 100;
//		nums[1] = 200;
//		nums[2] = 300;
//		nums[3] = 400;
		//-> Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3오류
		
		//입력
		//배열의 방을 워나는 순서대로 접근  for문=
		for(int i=0 ; i<nums.length ; i++) {
			nums[i] = 100;
		}
		
		//출력
		for(int i=0 ; i<nums.length ; i++) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}
	}

	//배열을 사용해서 m1()메소드 만들기
	//요구사항 : 학생 3명의 국어점수의 총점과 평균(실수)
	//추가사항 : 학생수 증가 3명-> 300명
	private static void m2() {
		//배열 선언하기 : 자료형[]배열 이름 : new 자료형[길이]
		int[] kors = new int[3];
		//위 소스 동작 결과 : int[] -> int 배열의 자료형
		
		//배열의 방 갯수 == 배열의 길이
		System.out.println(kors.length);
		
		//배열의 인덱스
		//int = int
//		kors[0] = 100;
//		kors[1] = 90;
//		kors[2]= 80;
//		
//		int total = kors[1] + kors[2] + kors[3];
//		double avg = total/3.0;
//		System.out.printf("총점 : %d점, 평균 : %.1f점", total, avg);
		
		int total = 0;
		for(int i=0 ;i<300; i++) {
			total += kors[i];
		}double Avg = total /2000;

		System.out.printf("총점 : %d점, 평균 : %.1f점", total, Avg);
			
	}

	
	//요구사항 : 학생 3명의 국어점수의 총점과 평균(실수)
	//추가사항 : 학생수 증가 3명-> 300명
	private static void m1() {
		int kor1;
		int kor2;
		int kor3;
		//변수생성 +297

		kor1 = 100;
		kor2 = 90;
		kor3 = 80;
		//값 입력  +297

		int total = kor1 + kor2 + kor3;	//+297개의 변수 추가 더하기
		
		double avg = total/3.0;			//3.0 -> 300.0
		
		System.out.printf("총점 : %d점, 평균 : %.1f점", total, avg);
	}
	
}
