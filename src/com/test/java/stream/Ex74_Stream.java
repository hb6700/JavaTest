//Ex74_Stream.java
/*
Stream(스트림)
자바 스트림
			1. 입출력 스트림
				- 파일 입출력, 콘솔 입출력, 네트워크 입출력..
			
			2. 스트림
				- Java 8(JDK 1.8)
				- 람다식 + 함수형 인터페이스
				- 배열(컬렉션)의 탐색(조작) 지원
				- 파일 입출력 지원
				- 디렉토리 탐색 지원
		
		
			배열, 컬렉션 탐색
			1. for문(루프변수)
			2. 향상된 for문
			3. Iterator
			4. 스트림
			
			
			
			함수형 인터페이스
			1. Consumer
				- (매개변수) -> {구현부}
			
			2. Supplier
				- () -> {return 값}
			
			3. Function
				- (매개변수) -> {return 값}
			
			4. Operator
				- (매개변수) -> {return 값}
				- 매개변수와 반환값의 자료형이 동일
			
			5. Predicate
				- (매개변수) -> {return 값}
				- 반환값이 boolean
				
stream()
.filter(Predicate)
.map(Function)
.sorted(Comparator)
.distinct()
.count().max().min().average().sum()
.allMatch().anyMatch().noneMatch()
.forEach()

*/
package com.test.java.stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.data.Data;
import com.test.data.Item;
import com.test.data.User;
import com.test.java.collection.Student;

public class Ex74_Stream {

	public static void main(String[] args) {
		
		String path = "test.java";
		
		//개발자 자바 소스 > (전달) > 다른 개발자 : 배포
		//1. 소스 자체 전달 > Myfile.java
		//2. 컴파일한 실행파일을 전달 > Myfile.class > 압축(*.zip) : *.jar
		
		
		//import : 같은 프로젝트 내에서만 가능
//		MyFile mf = new MyFile();
//		
//		System.out.println((mf.getFileNameWithoutExtension(path)));
//		System.out.println(mf.getExtension(path));

		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		m10();
		
		
		
	}//main
	
	
	private static void m10() {
		//집계, 통계파이프(Reduce pipe)
		//count(), max(), min(), sum(), avg()
		//최종파이프, 요소들을 가공해서 통계값을 내줌
		
		System.out.println(Data.getIntList().stream().count());
		//optional<Integer>
		System.out.println(Data.getIntList().stream().max((a, b) -> a-b));
		System.out.println(Data.getIntList().stream().min((a, b) -> a-b));

		int sum = Data
					.getIntList()
					.stream()				//Stream<Integer>(X) IntStream(O)
					.mapToInt(n -> n)
					.sum();
		System.out.println(sum);
		
		double avg = Data
						.getIntList()
						.stream()
						.mapToInt(n -> n)
						.average()
						.getAsDouble();
		System.out.println(avg);
		
		
	}


	private static void m9() {
		//매칭
		//allMatch(), anyMatch(), noneMatch()
		//최종파이프, 스트림 요소들이 제시한 조건을 만족 유무 판단?
		//a. boolean allMatch(Predicate)			//모든 요소가 조건을 100% 만족
		//b. boolean anyMatch(Predicate)			//일부 요소가 조건을 만족
		//c. boolean noneMathc(Predicate)			//모든 요소가 조건을 만족하지 않을때 true
		
		//요구사항) 배열 > 짝수만 있는지?
		//1. 
		int[] nums = {1, 2, 3, 4, 5};
		
		boolean result = false;
		
		for(int n : nums) {
			if(n % 2 == 1) {
				result = true;
				break;
			}
		}
		if(result) {
			System.out.println("홀수 발견");
		}else {
			System.out.println("짝수 발견");
		}
		System.out.println();
		
		//2. 
		System.out.println(Arrays.stream(nums).allMatch(n -> n % 2 == 0));
		if(Arrays.stream(nums).allMatch(n -> n % 2 == 0)) {
			System.out.println("홀수 발견");
		}else {
			System.out.println("짝수 발견");
		}
		System.out.println();

		//anyMatch
		System.out.println(Arrays.stream(nums).anyMatch(n -> n % 2 == 0));
		if(Arrays.stream(nums).anyMatch(n -> n % 2 == 0)) {
			System.out.println("홀수 발견");
		}else {
			System.out.println("짝수 발견");
		}
		System.out.println();
		
		//noneMatch
		System.out.println(Arrays.stream(nums).noneMatch(n -> n % 2 == 0));
		if(Arrays.stream(nums).noneMatch(n -> n % 2 == 0)) {
			System.out.println("홀수 발견");
		}else {
			System.out.println("짝수 발견");
		}
		System.out.println();
		
		
	}


	private static void m8() {
		//정렬(sorted)
		//중간파이프, 배열/컬렉션의 sort와 사용방법이 동일 -> Compatator구현
		Data.getIntList(10).stream().sorted((a,b) -> b-a).forEach(n -> System.out.println(n));
	}


	//매핑
	private static void m7() {
		//map(), mapXXX();
		//중간파이프, 변환작업
		
		//값 10개 가져오기
		List<String> list = Data.getStringList(10);
		System.out.println(list);
		System.out.println();
		
		//글자수 세자리 이하인것만 출력
		//Stream<String> -> Stream<String>
		list.stream().filter(word -> word.length() <= 3).forEach(word -> System.out.println(word));
		System.out.println();
		
		//각 글자수의 길이를 순서대로 배열(?
		//Stream<String> -> Stream<Integer>
		list.stream().map(word -> word.length()).forEach(num -> System.out.println(num));
		System.out.println();
		
		//성때고 이름만 빼내기
		String[] names = {"홍길동", "아무개", "이순신", "권율", "강감찬", "연개소문", "홍길동", "이순신", "남궁장군", "연개소문"};
		//이름추출
		Arrays.stream(names).map(name -> name.substring(1)).forEach(name -> System.out.println(name));
		System.out.println();
		
		List<Student> slist = new ArrayList<Student>();
		slist.add(new Student("가가가", 100, 90, 80));
		slist.add(new Student("나나나", 77, 88, 99));
		slist.add(new Student("다다다", 60, 50, 40));
		slist.add(new Student("라라라", 82, 67, 91));
		slist.add(new Student("마마마", 67, 88, 68));
		
		//Stream<Student> -> Stream<String>
		slist.stream().map(s -> {
			if(s.getKor() + s.getEng() + s.getMath() >= 180) {
				return "합격";
			}else {
				return "불합격";
			}
		})
		.forEach(result -> System.out.println(result));
		System.out.println();
		
		slist.stream().map(s -> {
			if(s.getKor() + s.getEng() + s.getMath() >= 180) {
				Result r = new Result();
				r.setName(s.getName());
				r.setName("합격");
				return r;
			}else {
				Result r = new Result();
				r.setName(s.getName());
				r.setName("불합격");
				return r;
			}
		})
		.forEach(r -> {
			System.out.println("이름 : " + r.getName());
			System.out.println("결과 : " + r.getResult());
		});
		
		
		
	}//m7
	
	
	//중복제거파이프
	private static void m6() {
		//중복 제거
				//- distinct()
				//- 중간 파이프
				//- 앞의 스트림에서 중복 요소를 제거하고 > 유일한 요소만 남은 새로운 스트림을 반환한다.
				
				List<Integer> list = Data.getIntList();
				
				System.out.println(list.size());
				
				
				//요구사항] 위의 배열에서 중복값 제거
				//Case 1.
				Set<Integer> set1 = new HashSet<Integer>();		
				for (int n : list) {
					set1.add(n); //중복값 제거
				}		
				System.out.println(set1.size());
				
				//Case 2.
				Set<Integer> set2 = new HashSet<Integer>(list); //중복값 제거
				System.out.println(set2.size());
				
				//Case 3.
				//list.stream().distinct().forEach(n -> System.out.println(n));
				System.out.println(list.stream().count());
				System.out.println(list.stream().distinct().count());
				System.out.println();
				
				
				
				String[] names = { "홍길동", "아무개", "이순신", "권율", "강감찬", "연개소문", "홍길동", "이순신", "남궁장군", "연개소문" };
				
				Arrays.stream(names)
						.distinct()
						.filter(name -> name.length() == 3)
						.forEach(name -> System.out.println(name));
				System.out.println();
				System.out.println();
				
				
				
				List<Cup> clist = new ArrayList<Cup>();
				
				clist.add(new Cup(Cup.BLACK, 200));
				clist.add(new Cup(Cup.BLUE, 300));
				clist.add(new Cup(Cup.RED, 400));
				clist.add(new Cup(Cup.WHITE, 500)); //1
				clist.add(new Cup(Cup.YELLOW, 600)); //2
				clist.add(new Cup(Cup.BLACK, 700));
				clist.add(new Cup(Cup.BLUE, 800));
				clist.add(new Cup(Cup.RED, 900));
				clist.add(new Cup(Cup.WHITE, 500)); //1
				clist.add(new Cup(Cup.YELLOW, 600)); //2
				
				//Set, distinct() > 중복 객체를 제거하려면?
				//1. hashCode() 재정의
				//2. equals() 재정의
				
				clist.stream()
					.distinct()
					.forEach(cup -> System.out.println(cup));
				System.out.println();
				System.out.println();
	}


	private static void m5() {
	/*	
	스트림
	데이터 소스로부터 탐색/조작이 가능한 도구
	list.stream().forEach()
	
	파이프(pipe)
	스트림 객체 메소드
	1. 중간 파이프
		- 반환값 O > 스트림 반환
	2. 최종 파이프
		- 반환값 X > void
		- 반환값 O : 다른 자료형 반환
	
	요소 처리
	- forEach() : 최종파이프
	필터링
	- filter() : 중간 파이프
	
	*/
		
		List<Integer> list = Data.getIntList(20);
		System.out.println(list);
		
		//요구사항) 짝수만 출력하기
		for(int n : list) {
			if(n % 2 == 0) {
				System.out.printf("%-4d", n);
			}
		}
		System.out.println();
		
		list.stream().forEach(num -> {
			if(num % 2 == 0) {
				System.out.printf("%-4d", num);
			}
		});
		System.out.println();
		
		list.stream().filter(num -> num %2 == 0).forEach(num -> {
			System.out.printf("%-4d", num);
		});
		System.out.println();
	}

	//스트림을 얻어오는 방법
	private static void m4() {
		//1. 배열
		int[] nums1 = {10, 20, 30};
		Arrays.stream(nums1).forEach(num -> System.out.println(num));
		System.out.println();
		
		//2. 컬렉션
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		nums2.add(100);
		nums2.add(200);
		nums2.add(300);
		nums2.stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		//3. 숫자범위
		//Stream<Integer> : 범용 스트림 > forEach > Consumer<Integer>
		//IntStream : 전용 스트림 > forEach > IntConsumer
		IntStream.range(1, 10).forEach(num -> System.out.println(num));
		System.out.println();
		
		try {
			//4. 파일로부터
			//스트림 : 파일읽기
			//Paths.get("c:\\class\\java\\code\\JavaTest\\data\\number.txt");
			//. : 현재 실행파일이 있는 폴더
			//자바 콘솔 프로젝트에서는 프로젝트 루트 폴더를 표현
			Path path = Paths.get(".\\data\\number.txt");	
			Files.lines(path).forEach(Line -> System.out.println(Line));
			
			//5. 디렉토리부터
			//목록보기 > dir.listFiles()
			Path dir = Paths.get("C:\\class\\dev\\eclipse");
			Files.list(dir).forEach(p -> {
				System.out.println(p.getFileName());
				System.out.println(p.toFile().isFile());
			});
			
		}catch(Exception e) {
			System.out.println("오류");
			e.printStackTrace();
		}
		
		
	}

	private static void m3() {
		Data
			.getIntList()
			.stream()
			.forEach(num -> System.out.printf("%4d", num));
		System.out.println();
		
		
		Data.getUserList().stream().forEach(user -> {
			System.out.println("[회원정보]");
			System.out.println("이름 : " + user.getName());
			System.out.println("나이 : " + user.getAge());
			System.out.println("성별 : " + user.getGender());
			System.out.println();
		});
		
		Data.getItemList().stream().forEach(item -> {
			System.out.println(item.getName());
			System.out.println(item.getColor());
			System.out.println();
		});
		
	}
	

	private static void m2() {
		//배열(컬렉션) 탐색
		List<String> list = Data.getStringList(10);
		
		//1.for
		for(int i=0 ; i<list.size() ; i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println();
		
		//2. 향상된 for문
		for(String word : list) {
			System.out.print(word + " ");
		}
		System.out.println();
		System.out.println();
		
		//3. Iterator
		Iterator<String> iter = list.iterator();
		while(iter.hasNext())	{
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		System.out.println();
		
		//4. Stream
		Stream<String> stream = list.stream();
		Consumer<String> c1 = str -> System.out.println(str + " ");
		//foreach메소드
		//1. stream으로부터 얻어낸 데이터 > 1개씩 가져온다. 향상된 for문처럼
		//2. 가져온 데이터 > Consumer.accept()메소드 인자 전달 + 메소드 호출
		//3. 반복x 요소만큼
		stream.forEach(c1);
		
		stream = list.stream();
		stream.forEach(c1);
		
		//메소드 체이닝 > 함수형 프로그래밍 방식
		list.stream().forEach(str -> System.out.println(str));
		
		
	}

	private static void m1() {
		int[] nums1 = Data.getIntArray();
		System.out.println(Arrays.toString(nums1));
		System.out.println(nums1.length);
		
		int[] nums2 = Data.getIntArray(5);
		System.out.println(Arrays.toString(nums2));
		
		//List<Integer>
		List<Integer>nums3 = Data.getIntList();
		System.out.println(nums3.size());
		
		List<Integer>nums4 = Data.getIntList(5);
		System.out.println(nums4);
		
		String[] txt = Data.getStringArray();
		System.out.println(Arrays.toString(txt));
		
		Item[] items = Data.getItemArray();
		System.out.println(items);

		User[] list = Data.getUserArray();
		System.out.println(list);
		
	}
	
}

//이전 > Set 수업
class Cup {
	
	public final static int BLACK = 1;
	public final static int WHITE = 2;
	public final static int RED = 3;
	public final static int YELLOW = 4;
	public final static int BLUE = 5;	
	
	//private String color2; //주관식 > color2 = "white"
	
	private int color; //객관식 > 빨강, 파랑... 선택 > 열거값
	private int size;
	
	public Cup(int color, int size) {
		this.color = color;
		this.size = size;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Cup [color=" + color + ", size=" + size + "]";
	}
	
	
	//개발자의 의도대로 객체를 비교하려면..
	@Override
	public int hashCode() {
		
		return ("" + this.color + this.size).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return this.hashCode() == obj.hashCode();
	}
	
}



//230811-2교시
//Stream<Student> -> map() -> Stream<Result>
class Result{
	private String name, result;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	
}
