package com.doormain.ch02;

public class Override1 extends Override {
	
	void Hot() {	
			System.out.println("����մϴ�");
		}
	void Hot(int a, int b) { 
			System.out.println( a * b);
		}
	void Hot(int c) {
			System.out.println("�ӵ��� ���Դϴ�." + c);
	}
	void Hot(String d) {
			System.out.println("��� �����մϴ�.." + d);
	}
			public static void main(String[] args) {
			Override1 overloadTest1 = new Override1();
			overloadTest1.Hot();
			overloadTest1.Hot(2 ,  10);
			overloadTest1.Hot(300);
			overloadTest1.Hot("�������̵�");
			}
	}