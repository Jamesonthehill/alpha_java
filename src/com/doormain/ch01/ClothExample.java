package com.doormain.ch01;

public class ClothExample extends Cloth {
	ClothExample(){	
		super("��������", "���ڽ���", 250000); // ����� �ΰ������ ���ϳ�.
	}
	
		// --- ���ݾȵǾ߸���
	public static void main(String[] args) {
		ClothExample clothExample = new ClothExample();
		System.out.println("������� "); // �̰� �����ְ� �Ʒ� �� ����
		clothExample.hotkey(); // �׷��� ������� �Ʒ��� �߰ԵǴ°Ŵ�.
	}

}
