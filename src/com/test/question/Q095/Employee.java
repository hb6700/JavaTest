package com.test.question.Q095;

public class Employee {

	private String name;
	private String department;
	private String position;
	private String tel;
	private Employee boss;

	//getter
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public String getPosition() {
		return position;
	}
	public String getTel() {
		return tel;
	}
	public Employee getBoss() {
		return boss;
	}

	
	//setter
	//한글 2~5자 이내
	public void setName(String name) {
		if(name.length() < 2 ||name.length() > 5) {
			return;
		}
		for(int i=0; i<name.length() ; i++) {
			char c = name.charAt(i);
			if(c < '가' || c > '힣') {
				return;
			}
		}
		this.name = name;
	}

	//영업부, 기획부, 총무부, 개발부, 홍보부
	public void setDepartment(String department) {
		if(department.equals("영업부") || department.equals("기획부") || department.equals("총무부") || department.equals("개발부") || department.equals("홍보부")) {
			this.department = department;			
		}
	}

	//부장, 과장, 대리, 사원
	public void setPosition(String position) {
		if(position.equals("부장") || position.equals("과장") || position.equals("대리") || position.equals("사원")) {
			this.position = position;			
		}
	}

	//010-XXXX-XXXX 형식 확인
	public void setTel(String tel) {
		this.tel = tel;
	}

	//다른 직원 중 한명, 같은 부서가 아니면 될 수 없음(유효성 검사)
	public void setBoss(Employee boss) {
		this.boss = boss;
	}

	//직원 정보 확인
	public void info() {
		System.out.printf("[%s]\n", this.name);
		System.out.printf("- 부서 : %s\n", this.department);
		System.out.printf("- 직위 : %s\n", this.position);
		System.out.printf("- 연락처 : %s\n", this.tel);
		System.out.printf("- 직속상사 : %s\n", this.boss);
		
/*
[홍길동]
- 부서: 홍보부
- 직위: 부장
- 연락처: 010-1234-5678
- 직속상사: 없음

[아무개]
- 부서: 홍보부
- 직위: 사원
- 연락처: 010-2541-8569
- 직속상사: 홍길동(홍보부 부장)*/
	}

}
