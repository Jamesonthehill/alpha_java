package com.doormain.ch13;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>(); // 여기서 데이터 타입을 정함.
		box.set("조르디 : 3000만");
		String str = box.get();
		
		System.out.println("str : " + str );
	
		
		Box<Double> box2 = new Box<Double>();
		box2.set(3.0); // set으로 데이터를 받아서   double: 3.0 이런식을 적고 float:   3.0f 으로적는다. 
		Double number = box2.get(); // get 으로 사용하겠다.
		System.out.println("number : "+ number);
	}

}
