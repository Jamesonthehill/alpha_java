package com.doormain.ch01;

public class Cloth {
	String name;
	String brand;
	int price;
//---------------------			
	String a;
	String b;
	int c;
			
//			public Cloth (String name, String brand, int price) {
//				this.name = name;
//				this.brand = brand;
//				this.price = price;
//			}
			
	public void hotkey() {
		System.out.println("�� �̸� : "+ name);
		System.out.println("�� �귣�� : "+ brand);
		System.out.println("�� ����: "+  price);
	} // -----------------------------
		public void hotkey1() {
			System.out.println("�� �̸� : "+ a);
			System.out.println("�� �귣�� : "+ b);
			System.out.println("�� ����: "+  c);
	}
}