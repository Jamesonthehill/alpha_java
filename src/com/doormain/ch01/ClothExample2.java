package com.doormain.ch01;

public class ClothExample2 extends Cloth{
	 ClothExample2 (String a, String b, int c){
			this.a	= a;
			this.b 	= b;
			this.c	= c;
		} // aa
	
	public static void main(String[] args) {
	
		ClothExample2 clothExample2 = new ClothExample2("������ ����", "����Ŭ��" , 50000);
			clothExample2.hotkey1();
	}

}
