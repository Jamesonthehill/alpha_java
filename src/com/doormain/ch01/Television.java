package com.doormain.ch01;

public class Television implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
		
	}
	public void SetVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME){
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}

		System.out.println("현재 티비 볼륨 : " + volume);
	}
		public int getVolume() {
				return volume;
		}

		
		  public void setVolume(int volume) { 
			  this.volume = volume;
		  }
		  public static void changeBattery() {
		        System.out.println("건전지를 교체합니다.");
		    }

		@Override
		public void setVolume() {
			// TODO Auto-generated method stub
			
		}
		
}