package com.doormain.ch01;

public class ParentBook extends Parent {
	ParentBook (String name, int price){ // 생성자는 꼭 this로 받아라
		this.name = name;
		this.price = price;
	}
	
	
	public static void main(String[] args) {
		
		ParentBook child = new ParentBook("파피용", 25000);
		System.out.println("결과");
		child.Print();
	}

}
