package com.doormain.ch01;

public interface RemoteControl {
//  ���
    public static final int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;     // public static final ���� ����
    
//  �߻� �޼���     : ����    , ���� Ŭ�������� ������ �������̵� �ؾ���            // public abstract ���� ����
    public abstract void turnOn();
    void turnOff();
    void setVolume();
    
//  ����Ʈ �޼��� //public ��������
    public default void setMute(boolean mute) {
        if(mute) {
            System.out.println("���� ó���մϴ�.");
        } else {
            System.out.println("���� �����մϴ�.");
        }
    }
    
//  ���� �޼��� : ��ü ���� ���� ��� ������ �޼���  //public ��������
    public static void changeBattery() {
        System.out.println("�������� ��ü�մϴ�.");
    }
}
