package com.doormain.ch01;

public class Television implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
		
	}
	public void SetVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME){
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}

		System.out.println("���� Ƽ�� ���� : " + volume);
	}
		public int getVolume() {
				return volume;
		}

		
		  public void setVolume(int volume) { 
			  this.volume = volume;
		  }
		  public static void changeBattery() {
		        System.out.println("�������� ��ü�մϴ�.");
		    }

		@Override
		public void setVolume() {
			// TODO Auto-generated method stub
			
		}
		
}