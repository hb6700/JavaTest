//Ex50_final.java
/*
final 키워드 
- 한 번 결정하면 바꿀 수 없다 : 안정성이 높다.

1. 변수 적용(지역변수, 멤버 변수)
 - 초기화 이후 값을 변경할 수 없다.
 - 상수

2. 메소드 적용
 - 상속
 - 오버라이드 금지!!
 - 부모메소드를 수정하지 못하도록 만듦

3. 클래스 적용
 - 상속
 - 부모클래스를 수정하지 못하게 함
 */
package com.test.java.obj.inheritance;

import java.util.Calendar;

public class Ex50_final {

	public static void main(String[] args) {
		
		//지역변수
		int a = 10;
		a = 20;
		a = 30;
		
		//final 변수 = 상수
		//권장 방법 : 변수선언과 동시에 초기화
		final int b = 10;
		//b = 20;			//The final local variable b cannot be assigned. It must be blank and not using a compound assignment
		
		final int c;
		c = 10;
		//c = 20;
		
		//선언시 변수에 대문자로 쓰는 습관 기르기(?)
		final int E = 10;
		
		//인스턴스 생성 문장
		Test t = new Test();
		t.a = 20;
		//t.b = 30;		//final변수는 값할당 불가
		
		test(100);
		
		System.out.println(Calendar.YEAR);	//캘린더 상수
		//Calendar.YEAR = 2;	//상수?에 대문자 있는거 보고 확인하라고  뭘? 저게 final변수?상수?라고
		int gender;
		gender = 1;
		gender = 2;
		
		int male = 1;
		int female = 2;
		
		male = 2;
		
		
		//대문자 설정, final 맨 앞에, 값 설정동시에, 다만 이건 이 클래스 내에서만 사용가능해서 별로,,,
		final int MALE = 1;
		final int FEMALE = 2;
		
		//class로 따로 정의해놨기 때문에 어디서든 사용이 가능함.
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);
		
		
		
	}//main
	
	public static void test(final int a) {
		System.out.println(a);
		//a = 200;
	}
	
}//class


class Test{
	public int a = 10;
	public final int b = 20;		//멤버변수
}

//남자(1) 여자(2) : 열거값(final static변수를 사용하는게 보편적)
class Gender{
	//staticㄴㄴ > 객체멤버
	public final static int MALE = 1;
	public final static int FEMALE = 2;
}

















//오버라이드
class FinalParent{
	//부모 클래스 설계
	//test() >  나중에 상속받은 자식 클래스가 이 test()메소드를 재정의하면 안될 것 같다.
	final public void test() {
		System.out.println("부모 메소드");
	}
}

class FinalChild extends FinalParent{
//	@Override
//	public void test() {	///Cannot override the final method from FinalParent
//		System.out.println("자식 메소드");
//	}
}







//부모클래스 설계 > 상속 불가능
final class FinalMember{
	
}

//The type FinalUser cannot subclass the final class FinalMember
//class FinalUser extends FinalMember {
//	
//}

