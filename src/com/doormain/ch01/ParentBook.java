package com.doormain.ch01;

public class ParentBook extends Parent {
	ParentBook (String name, int price){ // �����ڴ� �� this�� �޾ƶ�
		this.name = name;
		this.price = price;
	}
	
	
	public static void main(String[] args) {
		
		ParentBook child = new ParentBook("���ǿ�", 25000);
		System.out.println("���");
		child.Print();
	}

}
