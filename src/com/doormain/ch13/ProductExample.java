package com.doormain.ch13;

public class ProductExample {

	public static void main(String[] args) {
		
			Product<String, Integer> productExample = new Product<String, Integer>();
			
			productExample.setKind("����");
			productExample.setModel(400);
			
			System.out.println("���� ���� �ڵ��� : "+ productExample.getKind() + " : " + productExample.getModel() + " �Դϴ�" );

			Product<Tv,String> productExample2 = new Product<>();
			
	}

}
