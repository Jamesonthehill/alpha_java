package com.doormain.ch02;

public class Override {


 
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
}
