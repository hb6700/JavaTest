package com.test.java.data;

public class Student {

	private String no, name, gradeNo, classNo, StudentNo;

	public Student(String no, String name, String gradeNo, String classNo, String studentNo) {
		this.no = no;
		this.name = name;
		this.gradeNo = gradeNo;
		this.classNo = classNo;
		this.StudentNo = studentNo;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGradeNo() {
		return gradeNo;
	}

	public void setGradeNo(String gradeNo) {
		this.gradeNo = gradeNo;
	}

	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	public String getStudentNo() {
		return StudentNo;
	}

	public void setStudentNo(String studentNo) {
		StudentNo = studentNo;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", gradeNo=" + gradeNo + ", classNo=" + classNo
				+ ", StrudentNo=" + StudentNo + "]";
	}
	
	
	
	
	
}
