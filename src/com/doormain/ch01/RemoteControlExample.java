package com.doormain.ch01;

public class RemoteControlExample {
    
    public static void main(String[] args) {
        
//      Audio audio = new Audio();
        Television television = new Television();
        
		
//		 audio.turnOn();
//		 audio.turnOff();
        television.turnOn();
        television.setMute(true);
        television.setMute(false);
        System.out.println(television.MAX_VOLUME);
        television.changeBattery();
        television.turnOff();
        
//      인터페이스를 구현한 클래스를 사용해야 할 때
//      RemoteControl remoteControl;    // 인터페이스 참조변수 선언
//      remoteControl = new Audio();    // 구현객체로 초기화
        
//      RemoteControl remoteControl = new Audio();
        RemoteControl remoteControl = new Television();
        remoteControl.setMute(true);
        remoteControl.setMute(false);
        remoteControl.turnOn();
        System.out.println(remoteControl.MIN_VOLUME);
        RemoteControl.changeBattery();
        remoteControl.turnOff();
    }
        
}