package com.doormain.ch02;

public class Override1 extends Override {
	
	void Hot() {	
			System.out.println("출발합니다");
		}
	void Hot(int a, int b) { 
			System.out.println( a * b);
		}
	void Hot(int c) {
			System.out.println("속도를 줄입니다." + c);
	}
	void Hot(String d) {
			System.out.println("장비를 정지합니다.." + d);
	}
			public static void main(String[] args) {
			Override1 overloadTest1 = new Override1();
			overloadTest1.Hot();
			overloadTest1.Hot(2 ,  10);
			overloadTest1.Hot(300);
			overloadTest1.Hot("오버라이드");
			}
	}