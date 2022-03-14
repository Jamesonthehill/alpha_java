package com.doormain.ch13;

public class ProductExample {

	public static void main(String[] args) {
		
			Product<String, Integer> productExample = new Product<String, Integer>();
			
			productExample.setKind("벤츠");
			productExample.setModel(400);
			
			System.out.println("선물 받은 자동차 : "+ productExample.getKind() + " : " + productExample.getModel() + " 입니다" );

			Product<Tv,String> productExample2 = new Product<>();
			
	}

}
