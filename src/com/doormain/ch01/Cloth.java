package com.doormain.ch01;

public class Cloth {
	String name;
	String brand;
	int price;
//			String name = "트러거자켓";
//			String brand = "타미힐피거";
//			int price = 3000000;
			public Cloth (String name, String brand, int price) {
				this.name = name;
				this.brand = brand;
				this.price = price;
			}
			
			
	public void hotkey() {
		System.out.println("옷 이름 : "+ name);
		System.out.println("옷 브랜드 : "+ brand);
		System.out.println("옷 가격: "+  price);
	}
}