package org.dimigo.basic;

public class Switch {
	public static void main(String[] args) {
		
		int num = 100;
		switch (num % 2) {
		case 0:
			System.out.println("¦���Դϴ�.\n");
			break;
		case 1:
			System.out.println("Ȧ���Դϴ�.\n");
			break;
		default:
			System.out.println("�� ������!\n");
			break;
		}
		
		String season="��";
		switch(season) {
		case "��":
			System.out.println("��\n");
			break;
		case "����":
			System.out.println("����\n");
			break;
		case "����":
			System.out.println("����\n");
			break;
		case "�ܿ�":
			System.out.println("�ܿ�\n");
			break;
		}
	}
}
