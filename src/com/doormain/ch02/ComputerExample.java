package com.doormain.ch02;

public class ComputerExample {
		

	public static void main(String[] args) {
		int R = 7;
		

		System.out.println("반지름 : "+ R);
		
		Calculation computerExample = new Calculation();
		System.out.println("원면적 : " +computerExample.circleArea(R));
			
		Computer computerExample1 = new Computer();
		System.out.println("원면적 : " +computerExample1.circleArea(R));
	}

}
