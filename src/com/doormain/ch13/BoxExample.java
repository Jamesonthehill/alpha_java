package com.doormain.ch13;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>(); // ���⼭ ������ Ÿ���� ����.
		box.set("������ : 3000��");
		String str = box.get();
		
		System.out.println("str : " + str );
	
		
		Box<Double> box2 = new Box<Double>();
		box2.set(3.0); // set���� �����͸� �޾Ƽ�   double: 3.0 �̷����� ���� float:   3.0f �������´�. 
		Double number = box2.get(); // get ���� ����ϰڴ�.
		System.out.println("number : "+ number);
	}

}
