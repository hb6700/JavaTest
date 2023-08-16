//Ex54_interface.java
package com.test.java.obj.inheritance;

public class Ex54_interface {

	public static void main(String[] args) {
		
		//회사의 직원
		Hong hong = new Hong();
		hong.출근하다();
		hong.일을한다();
		hong.퇴근하다();
		
		hong.애들하고놀기();
		hong.낮잠자기();
		hong.돈벌기();
	}
	
}

interface 직원{
	void 출근하다();
	void 퇴근하다();
	void 일을한다();
}

interface 아빠{
	void 애들하고놀기();
	void 돈벌기();
	void 낮잠자기();
}

class Hong implements 직원, 아빠{

	@Override
	public void 출근하다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 퇴근하다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 일을한다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 애들하고놀기() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 돈벌기() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 낮잠자기() {
		// TODO Auto-generated method stub
		
	}
	
}






class Lee implements 직원 {

	@Override
	public void 출근하다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 퇴근하다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 일을한다() {
		// TODO Auto-generated method stub
		
	}
	
}

class Park implements 아빠 {

	@Override
	public void 애들하고놀기() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 돈벌기() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 낮잠자기() {
		// TODO Auto-generated method stub
		
	}
	
}

