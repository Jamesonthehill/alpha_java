package com.doormain.ch13;

public class Box<T> { // �׷� T�� ���ڿ�, ���ڿ� ������� ��밡���Ѱǰ�?
	
		private T t; // private�� get, set �ʿ�
		
		public T get() {
			return  t;
		}
		public void set(T t) {
			this.t = t;
		}
}
