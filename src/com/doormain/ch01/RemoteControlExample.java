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
        
//      �������̽��� ������ Ŭ������ ����ؾ� �� ��
//      RemoteControl remoteControl;    // �������̽� �������� ����
//      remoteControl = new Audio();    // ������ü�� �ʱ�ȭ
        
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