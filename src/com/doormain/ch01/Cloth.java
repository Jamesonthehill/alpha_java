package com.doormain.ch01;

public class Cloth {
	String name;
	String brand;
	int price;
//			String name = "Ʈ��������";
//			String brand = "Ÿ�����ǰ�";
//			int price = 3000000;
			public Cloth (String name, String brand, int price) {
				this.name = name;
				this.brand = brand;
				this.price = price;
			}
			
			
	public void hotkey() {
		System.out.println("�� �̸� : "+ name);
		System.out.println("�� �귣�� : "+ brand);
		System.out.println("�� ����: "+  price);
	}
}