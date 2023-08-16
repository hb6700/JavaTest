//Ex60_List.java
/*
컬렉션
- JCF(Java Collection Framework)
- (향상된)배열
- 기존의 순수 배열
    - 사용법 개량
    - 용도에 따른 입출력 방식/효율성 개량
- 클래스 + 내부 순수 배열을 가지고 있다.
- 길이가 가변 : 방의 개수를 마음대로 늘리고 줄이는 것이 가능함
- 자료구조(배열같은?)

컬렉션 종류
List, Set, Map → 인터페이스

1. List계열
    - ArrayList ★★★
    - LinkedList
    - Queue
    - Stack
    - Vector(legacy)
2. Set계열
    - HashSet ★
    - TreeSet
3. Map계열
    - HashMap ★★
    - TreeMap
    - Properties(legacy)
    - HashTable(legacy)
*/
package com.test.java.collection;

import java.util.ArrayList;

public class Ex60_List {

	public static void main(String[] args) {
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		m6();
		
		
	}//main
	
	private static void m6() {
		//컬렉션 포기 용량 : 내부 배열의 초기 길이
		ArrayList<Integer> list = new ArrayList<Integer>(10);		//int initial Capacity
		for(int i=0 ; i<10 ; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		list.add(10);				//이젠 더이상 추가계획이 없을때
		list.trimToSize();			//데이터가 들어있는 만큼의 길이로 재조정
	}

	private static void m5() {
		//ArrayList(컬렉션) 특징
		//1. 내부에 배열을 가지고 있다
		//2. ArrayList 클래스 대부분의 기능이 내부 배열을 조작하는 기능으로 구성
		//3. ??? 길이가 가변 > 데이터를 계속 넣으면 ...계속 공간이 늘어난다
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		for(int i=0 ; i<1000000 ; i++) {
//			list.add(i);
//		}
//		System.out.println(list.size());
//		System.out.println(list);
		
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		System.out.println(list.size());			//1
		
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list.size());			//4
		
		list.add(50);
		System.out.println(list.size());			//5
		
		/*
		배열의 길이는 4byte로 불변임. 그럼에도 배열의 길이가 자유로울 수 있는 이유는?(빠밤!)
		class ArrayList{
			private Integer[] list = new Integer[4];
			public void add(){
				if(검사 > 방이 없을때는?){
					//기존배열의 두배의 배열을 만들고 기존값을 copy&paste
					Integer[] temp = new Integer[list.length*2];
					this.list = temp;
				}
			}
		}	
		*/
		
	}

	private static void m4() {
		
		//성적표
		//학생(이름 국어 영어 수학 총점 평균)
		
		//선택 : 길이로 판단
		//배열 : 고정 vs ArrayList : 불확실
		
		//Student[] list;
		ArrayList<Student> list = new ArrayList<Student>();
		
		for(int i=0 ; i<10 ; i++) {
			int kor = (int)(Math.random() * 41) + 60;		//60~100점
			int eng = (int)(Math.random() * 41) + 60;		
			int math = (int)(Math.random() * 41) + 60;		
			
			Student s = new Student("학생" + i, kor, eng, math);
			list.add(s);		//배열에 학생 추가
			
		}
		//System.out.println(list);
		
		System.out.println("=========================================================================================");
		System.out.println("=======================================성  적  표 =======================================");
		System.out.println("=========================================================================================");
		System.out.println("[이름]\t\t[국어]\t\t[영어]\t\t[수학]\t\t[총점]\t\t[평균]");
		
		for(Student s : list) {
			int total = s.getKor() + s.getEng() + s.getMath();
			double avg = total / 3.0;
			System.out.printf("%s \t\t %3d \t\t %3d \t\t %3d \t\t %3d \t\t %.1f\n", s.getName(), s.getKor(), s.getEng(), s.getMath(), total, avg);
			System.out.println("-----------------------------------------------------------------------------------------");
		}
	}

	private static void m3() {

		//차원
		int[] ns1 = new int[3];
		int[][] ns2 = new int[3][3];
		int[][][] ns3 = new int[3][3][3];
		
		ArrayList<Integer> ms1 = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> ms2= new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<ArrayList<Integer>>> ms3= new ArrayList<ArrayList<ArrayList<Integer>>>();
		
	}

	private static void m2() {
		//ArrayList 용법
		ArrayList<String> list = new ArrayList<String>();
		
		//1. 요소 추가하기
		//boolean add(T value)
		//배열의 맨 마지막에 추가하기 > Append
		list.add("바나나");
		list.add("딸기");
		list.add("사과");
		list.add("귤");
		list.add("파인애플");
		
		//2. 요소의 개수
		//int size()
		System.out.println(list.size());	//5
		
		//3. 요소 접근(읽기)
		//T-get(get index)
		System.out.println(list.get(0));				//바나나
		System.out.println(list.get(4));				//파인애플
		System.out.println(list.get(list.size() - 1));	//파인애플
		
//		ArrayIndexOutOfBoundsException
//		StringIndexOutOfBoundsException
//		IndexOutOfBoundsException
		
		//java.lang.IndexOutOfBoundsException
		//System.out.println(list.get(5));
		
		//4. 요소 수정
		//list[0] = 10;		대입 or 수정
		//String set(int index, T newValue)
		String temp = list.set(2, "포도");
		System.out.println(list.get(2));		//포도
		System.out.println(temp);				//사과 : 사라지기 직전의 값을 출력
		
		//5. 요소 삭제
		//순수 배열의 요소(방)삭제는 불가능
		//컬렉션은 요소 삭제가 가능
		//T remove(int index) :  방번호를 찾아서 삭제
		//boolean remove(T value) : 값을 찾아서 삭제
		//***시프트가 발생한다!! : 삭제된 방 이후의 모든 요소 모두 방번호 --1
		
		System.out.println(list.get(1));		//딸기
		System.out.println(list.get(2));		//포도
		System.out.println(list.get(3));		//귤
		
		System.out.println();
		list.remove(2);							//포도 삭~제
		//list.remove("포도");					//만약 포도가 두개 이상이면 가장 처음 만나는 포도를 지움
		
		System.out.println(list.get(1));		//딸기
		System.out.println(list.get(2));		//귤
		System.out.println(list.get(3));		//파인애플 : 포도가 지워지면서 하나씩 작아짐(shift발생)
		//System.out.println(list.get(4));		//데이터 끝이 하나씩 줄어들었으므로 기존 파인애플이 들어있던 배열을 불러오면 오류
		
		//6. 탐색 : 루프
		for (int i=0 ; i<list.size() ; i++) {
			System.out.printf("list.get(%d) = %s\n", i, list.get(i));
		}
		System.out.println();
		
		
		//향상된 for문(foreach문)
		/*
		for(변수 : 배열/컬렉션) {
		
		}
		*/
		
		for(String item : list) {
			System.out.println(item);
		}
		System.out.println();
		
		
		//7. 덤프
		//Arrays.toString(배열)
		System.out.println(list.toString());
		System.out.println(list);
		
		//8. 요소의추가
		//배열의 원하는 위치에 요소를 추가
		//void add(index index, T value)
		//****시프트가 발생한다. 삽입된 방 이후의 모든 요소의 방번호 +1
		list.add(2, "망고");					//[바, 딸, 귤, 파]		//모 잡이 깆ㄱ전
		System.out.println(list);				//[바, 딸, 망, 굴 파]
		
		
		//9. 기타등등
		System.out.println(list.indexOf("사과"));
		System.out.println(list.indexOf("귤"));
		System.out.println(list.lastIndexOf("파인애플"));
		System.out.println(list.contains("망고"));
		
		
		//10.
		System.out.println(list.isEmpty());

		list.clear();					//모든 요소 삭제
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list);
		
		
	}

	private static void m1() {
		//순수 배열 선언
		//타입 명시 : int
		//길이 명시 : 3개
		int[] num1 = new int[3];
		
		//요소 접근 첨자 index 사용 : 배열은 Indexer표현법?사용
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		
		System.out.println(num1[0]);
		System.out.println(num1[1]);
		System.out.println(num1[2]);
		
		System.out.println(num1.length);
		
		
		//컬렉션
		//타입 명시(Integer) : 제네릭
		//길이 명시(??) : 가변
		//인덱스 지원 ㄴㄴ > 메소드로만 구현 (.............?)
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		
		//요소 추가	> 첨자 어디감? > add() == append : 차례대로 마지막방에 값을 넣어라
		num2.add(10);			//0번째 방에 알아서 들어감
		num2.add(20);			//1번째 방에 알아서 들어감
		num2.add(30);			//2번째 방에 알아서 들어감
		
		System.out.println(num2.get(0));	//num2[0]
		System.out.println(num2.get(1));	//num2[1]
		System.out.println(num2.get(2));	//num2[2]
		
		System.out.println(num2.size());	//== num.length (길이 3)
		
		num2.add(40);
		num2.add(50);
		
		System.out.println(num2.size());
		
		
	}
	
	
}//class


