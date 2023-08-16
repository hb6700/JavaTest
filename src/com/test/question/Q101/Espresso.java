package com.test.question.Q101;

public class Espresso {
	public int bean;
	public Espresso(int bean) {
		this.bean = bean;
		//맞나이게''
	}
	
	public void drink() {
		System.out.printf("원두 %dg으로 만든 에스프레소 마셔마셔\n", bean);
	}
}
