package com.doormain.ch02;

public class ComputerExample {
		

	public static void main(String[] args) {
		int R = 7;
		

		System.out.println("������ : "+ R);
		
		Calculation computerExample = new Calculation();
		System.out.println("������ : " +computerExample.circleArea(R));
			
		Computer computerExample1 = new Computer();
		System.out.println("������ : " +computerExample1.circleArea(R));
	}

}
