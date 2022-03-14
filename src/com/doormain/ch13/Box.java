package com.doormain.ch13;

public class Box<T> { // 그럼 T는 문자열, 숫자열 상관없이 사용가능한건가?
	
		private T t; // private는 get, set 필요
		
		public T get() {
			return  t;
		}
		public void set(T t) {
			this.t = t;
		}
}
