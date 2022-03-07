package com.doormain.ch01;

public class ClothExample extends Cloth {
	ClothExample(){	
		super("더비팬츠", "라코스테", 250000); // 상속의 두가지방법 중하나.
	}
	
		
	public static void main(String[] args) {
		ClothExample clothExample = new ClothExample();
		System.out.println("구현결과 "); // 이거 적어주고 아래 꺼 실행
		clothExample.hotkey(); // 그래서 구현결과 아래에 뜨게되는거다.
	}

}
