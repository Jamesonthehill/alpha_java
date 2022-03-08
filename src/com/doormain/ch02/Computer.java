package com.doormain.ch02;

public class Computer extends Calculation {

				public double circleArea(double R) {
				
				System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
				
				double result = Contants.PAI_2 * R * R;
						
				return result;
			}
		}
