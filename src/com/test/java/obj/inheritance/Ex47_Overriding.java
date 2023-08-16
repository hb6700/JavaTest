//Ex37_Overriding.java
/*
메소드 오버로딩(Method Overloading)
- 메소드 이름 동일 * N개 생성> 인자리스트 변환
메소드 오버리딩(Method Overfiding)
- 클래스 상속시에 발생
메소드 재정의 > 상속받은 메소드를 수정하는 기술
*/
package com.test.java.obj.inheritance;

public class Ex47_Overriding {

	public static void main(String[] args) {
	
		OverrideParent hong = new OverrideParent();
		hong.name = "홍길동";
		hong.hello();
		
		OverrideChild jhong = new OverrideChild();
		jhong.name = "홍철수";
		jhong.hello();
		
	}
	
}

//상황) 동네사람
class OverrideParent {
	public String name;
	public void hello() {
		System.out.printf("안녕하세요. 좋은 아침입니다 저는 %s입니다.\n", this.name);
	}
}

class OverrideChild extends OverrideParent{
	//시간이 흘러... 중딩2학년
	//****클래스 상속은 부모가 물려준 멤버를 자식이 거부할 방법이 없다.
	
//	public void hi() {
//		System.out.printf("하이 난 %c야\n", this.name);
//	}
	
	//동일한 hello()를 두 개 가지고 있다 > 에러발생 xx
	//무조건 자식이 우선한다 > 자식의 hello()가 호출
	
	//메소드 재정의
	public void hello(){
		System.out.printf("하이 난 %s야\n", this.name);
	}
}

