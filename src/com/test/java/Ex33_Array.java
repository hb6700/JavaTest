//Ex33_Array.java
/*

*/
package com.test.java;

public class Ex33_Array {

	public static void main(String[] args) {
		
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
		
	}

	//문제 설명
	private static void m5() {
		//5*5 2차원 배열
		int[][] nums = new int[5][5];
		
		//데이터 입력
		int n = 1;
		
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<=i ; j++) {
				nums[i][j] = n;
				n++;
			}
		}
		
		//출력 : 수정없이 그대로 사용
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
		
	}

	private static void m4() {
		
		String[] member = {"가가가", "나나나", "다다다", "라라라", "마마마", "바바바", "사사사", "아아아", "자자자", "차차차"};
		
		//1. 배열 > 원하는 데이터 존재하는지 검색
		String name = "강호동";
		
		if(contains(member, name)) {
			System.out.println("야! " + name + " 찾음ㅋ ㅊㅊ");
		}else {
			System.out.println(name + "도 못찾니ㅋ OOPS...");
		}
		
		//2. 배열 : 원하는 데이터가 존재하는지 검색 - 걔 어디서 찾았니?
		int index = indexOf(member, name);
		System.out.println(index);
	}

	private static int indexOf(String[] member, String name) {
		for(int i=0 ; i<member.length ; i++) {
			if(member[i].equals(name)) {
				return i;			//발견 위치 : 방번호
			}
		}
		return -1;			//인덱스는 음수 없음
	}

	private static boolean contains(String[] member, String name) {

		for(int i=0 ; i<member.length ; i++) {
			if(member[i].equals(name)) {
				return true;	//발견
			}
		}	
		return false;			//못찾았다 꾀꼬리
	}

	private static void m3() {
		int[] nums1 = {10, 20, 30};
		for(int i=0 ; i<nums1.length ; i++) {
			System.out.println(nums1[i]);
		}
		System.out.println();
		
		int[][] nums2 = {{10, 20, 30}, {40, 50, 60}};
		
		System.out.println(nums2.length);			//2
		System.out.println(nums2[0].length);		//1차원 배열
		System.out.println();
		
		for(int i=0 ; i<nums2.length ; i++) {
			for(int j=0 ; j<nums2[i].length ; j++) {
				System.out.println(nums2[i][j]);
			}
		}
		
	}

	private static void m2() {
		//다차원 초기화 리스트
		int[] nums1 = new int[] {10, 20, 30};
		int[] nums2 = {10, 20, 30};
		
		int[][] nums3 = new int[2][3];
		int[][] nums4 = new int[][] {{10, 20, 30}, {40, 50, 60}};
		int[][] nums5 = {{10, 20, 30}, {40, 50, 60}};
		
		int[][][] nums6 = new int[2][2][3];
		int[][][] nums7 = new int[][][] {{{10, 20, 30}, {40, 50, 60}}, {{10, 20, 30}, {40, 50, 60}}};
		int[][][] nums8 = {{{10, 20, 30}, {40, 50, 60}}, {{10, 20, 30}, {40, 50, 60}}};
		int[][][] nums9 = 
		{
			{
				{10, 20, 30},
				{40, 50, 60}
			}, 
			{
				{10, 20, 30},
				{40, 50, 60}
			}
		};
				
	}

	private static void m1() {

		//1차원 배열
		int[] nums1 = new int[3];
		
		nums1[0] = 100;
		nums1[1] = 200;
		nums1[2] = 300;
		
		for(int i=0 ; i<3 ; i++) {
			System.out.printf("nums1[%d] = %d\n", i, nums1[i]);
		}
		System.out.println();
		System.out.println();
		
		
		//2차원 배열
		int[][] nums2 = new int[2][3];		//2(2차원, 행), 3(1차원, 열)
		
		nums2[0][0] = 100;
		nums2[0][1] = 200;
		nums2[0][2] = 300;
		nums2[1][0] = 400;
		nums2[1][1] = 500;
		nums2[1][2] = 600;
		
		for(int i=0 ; i<=1 ; i++) {
			for(int j=0 ; j<=2 ; j++) {
				System.out.printf("nums2[%d][%d] = %d\n", i, j, nums2[i][j]);
			}
		}
		System.out.println();
		System.out.println();
		
		
		//3차원 배열
		int[][][] nums3 = new int[2][2][3];		//2(3차원, 동, 면), 2(2차원, 층, 행), 3(1차원, 호, 열)
		
		nums3[0][0][0] = 100;
		nums3[0][0][1] = 200;
		nums3[0][0][2] = 300;
		nums3[0][1][0] = 400;
		nums3[0][1][1] = 500;
		nums3[0][1][2] = 600;
		nums3[1][0][0] = 700;
		nums3[1][0][1] = 800;
		nums3[1][0][2] = 900;
		nums3[1][1][0] = 1000;
		nums3[1][1][1] = 1100;
		nums3[1][1][2] = 1200;
		
		for(int i=0 ; i<=1 ; i++) {
			for(int j=0 ; j<=1 ; j++) {
				for(int k=0 ; k<=2 ; k++) {
					System.out.printf("nums3[%d][%d][%d] = %d\n", i, j, k, nums3[i][j][k]);
				}
			}
		}
		System.out.println();
		System.out.println();
		
	}
}

