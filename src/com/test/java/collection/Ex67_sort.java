//Ex67_sort.java
/*
배열 or 컬렉션
- 오름차순정렬, 내림차순정렬
1. 직접 알고리즘 구현
2. JDK제공 기능

//2+1 > JDK제공 + 커스터마이징 + 익명클래스 사용(선택)
*/
package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class Ex67_sort {

	public static void main(String[] args) {

		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		
	}// main

	private static void m5() {
		//컬렉션의정렬
		//1. ArrayList >> 얘만 가능
		//2. HashMap
		//3. Queue
		//4. Stack
		//5. HashSet
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0 ; i<10 ; i++) {
			list.add((int)(Math.random()*100));			//0 ~ 99
		}
		System.out.println(list);
		
		//Collections.sort(list);						//Arrays.sort()
//		Collections.sort(list, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2-o1;
//			}	
//		});
		
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		
		
		System.out.println(list);
	}

	//객체정렬
	private static void m4() {
		Score[] list = new Score[5];
		list[0]	= new Score("홍길동", 100, 90, 80);
		list[1]	= new Score("아무개", 98, 78, 88);
		list[2]	= new Score("유재석", 78, 95, 79);
		list[3]	= new Score("박명수", 56, 78, 76);
		list[4]	= new Score("이순신", 99, 67, 79);
		
		System.out.println(Arrays.toString(list));
		
		Arrays.sort(list, new Comparator<Score>() {
			@Override
			public int compare(Score o1, Score o2) {
				//이름순으로
//				return o1.getName().compareTo(o2.getName());
				//국어성적 순으로
//				return o2.getKor() - o1.getKor();
				//성적순으로 내림차순
				return (o2.getKor() + o2.getEng() + o2.getMath()) - (o1.getKor() + o1.getEng() + o1.getMath());
			}	
		});
		System.out.println(Arrays.toString(list));
		
	}

	//날짜 변경
	private static void m3() {
		Calendar[] dates = new Calendar[5];
		for(int i=0 ; i<dates.length ; i++) {
			dates[i] = Calendar.getInstance();
		}
		dates[0].add(Calendar.DATE, 7);
		dates[1].add(Calendar.DATE, -2);
		dates[2].add(Calendar.DATE, 1);
		dates[3].add(Calendar.DATE, 0);
		dates[4].add(Calendar.DATE, 3);
		
		//test
		for(int i=0 ; i<dates.length ; i++) {
			System.out.printf("%tF\n", dates[i]);
		}
		System.out.println();
		
		//날짜순으로 정렬
		Arrays.sort(dates);	
		for(int i=0 ; i<dates.length ; i++) {
			System.out.printf("%tF\n", dates[i]);
		}
		System.out.println();
		
		//역순으로 정렬
		Arrays.sort(dates, new Comparator<Calendar>() {

			@Override
			public int compare(Calendar o1, Calendar o2) {
				//return (int)(o2.getTimeInMillis() - o1.getTimeInMillis());
				return o2.compareTo(o1);
			}
			
		});
		for(int i=0 ; i<dates.length ; i++) {
			System.out.printf("%tF %tT %tA\n", dates[i], dates[i], dates[i]);
		}
		System.out.println();
		
		//요일 순으로 정렬
		Arrays.sort(dates, new Comparator<Calendar>() {
			
			@Override
			public int compare(Calendar o1, Calendar o2) {
				//JAVA(일요일 : 1 ~ 토요일 : 7)
				return o1.get(Calendar.DAY_OF_WEEK) - o2.get(Calendar.DAY_OF_WEEK);
			}
			
		});
		for(int i=0 ; i<dates.length ; i++) {
			System.out.printf("%tF %tT %tA\n", dates[i], dates[i], dates[i]);
		}
		System.out.println();
		
		
	}

	private static void m2() {
		/*
		자료형별 정렬
		1. 숫자
		2. 문자(열) > 문자코드값
		3. 날짜시간
		*/
		
		String txt1 = "홍길동";
		String txt2 = "아무개";	
		
		//참조파일이 오면 에러가 난다. 주소값은 연산자의 피연산자가 될 수 없다
		//System.out.println(txt1 > txt2);		//모든 연산자는 피연산
		
		//문자열 > 문자열 : 불가능(참조값)
		//문자 > 문자 : 가능(값)
		System.out.println('A' > 'B');
		int n=0;
		
		for(int i=0 ; i<3 ; i++) {
			char c1 = txt1.charAt(i);
			char c2 = txt2.charAt(i);
			
			if(c1<c2) {
				n=1;
				break;
			}else if(c1<c2) {
				n=-1;
				break;		
			}
			
		}
		
		System.out.println(txt1.compareTo(txt2));
		System.out.println(txt1.compareToIgnoreCase(txt2));
		
		
		String[] names = {"홍길동", "아무개", "유재석", "박명수", "이순신", "훈", "김철"};
		
		System.out.println(Arrays.toString(names));
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				return o1.compareTo(o2);
			}
		});
		
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				//문자 코드값 비교 > 가나다
				//return o2.compareTo(o1);
				
				//글자수 비교
				//return o1.length() - o2.length();
				
				if(o1.length() > o2.length()) {
					return 1;
				} else if(o1.length() < o2.length()) {
					return -1;
				}else {
					//2차 정렬 기준
					return o2.compareTo(o1);
				}
				
			}
		});
		
		System.out.println(Arrays.toString(names));
		
	}

	private static void m1() {
//		Integer[] nums = {1, 5, 2, 4, 3};
//		
//		System.out.println(Arrays.toString(nums));
//		
//		//오름차순 정렬
//		//Arrays.sort(nums);		//Quick sort
//		System.out.println(Arrays.toString(nums));
//		
//		//내림차순 정렬 > 지원ㄴㄴ > 직접 구현
//		//Arrays.sort(배열, Comparator);
//		Arrays.sort(nums, new MyComparator());
//		System.out.println(Arrays.toString(nums));
//		
//		
//		//쓸모없당
//		MyComparator mc1 = new MyComparator();
//		System.out.println(mc1.compare(10, 20));
//		
//		
//		Double[] nums2 = {2.5, 7.1, 3.8, 9.2, 8.9};
//		Arrays.sort(nums2, new Comparator<Double>() {

//			@Override
//			public int compare(Double o1, Double o2) {
//				if(o1 < o2) {
//					return +1;
//				}else if(o1 > o2) {
//					return -1;
//				}else {
//					return 0;
//				}
		// return (int)(o2-o1);
//				return (int)Math.ceil(o2 - o1);

//			}});

//		System.out.println(Arrays.toString(nums2));
	}

}// class

//nums 배열 정렬위해 선언한 클래스
class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		/*
		 * o1 vs o2 1. 오름차순 o1이 더 크면 > 양수 반환 > 1 o2가 더 크면 > 음수 반환 > -1 같으면 0 반환 2. 내림차순
		 * o1이 더 크면 > 음수 반환 > -1 o2가 더 크면 > 양수 반환 > 1 같으면 0 반환
		 */

		// 오름차순
		if (o1 > o2) {
			return +1;
		} else if (o1 < o2) {
			return -1;
		} else {
			return 0;
		}

	}

}//class

class Score{
	private String name;
	private int kor, eng, math;
	
	
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]\n";
	}
	
	
	
	
}