package com.test.java.obj;

public class Person {

	//이름 나이 성별 변수지정
	private String name, gender;
	private int age;
	
	private Person father, mother;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person getFather() {
		return father;
	}
	public void setFather(Person father) {
		this.father = father;
	}
	public Person getMother() {
		return mother;
	}
	public void setMother(Person mother) {
		this.mother = mother;
	}
	
	public String info() {
		String temp ="";
		temp += "아빠 : " + this.father.getName() + "\n";
		temp += "엄마 : " + this.mother.getName() + "\n";
		temp += "본인 : " + this.name + "\n";
		
		return temp;
	}
	
}
