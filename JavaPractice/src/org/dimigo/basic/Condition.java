package org.dimigo.basic;

public class Condition {
	public static void main(String args[])
	{
		// ����1 / ��ӹ���2 / �׿�3
		int bustype = 1;
		int runtime = 10;
		
		if(runtime <= 0) {
			System.out.println("0 �̻��� ���� �Է��ϼ���.\n");
			return;
		}
		
		if(bustype == 1) {
			if(runtime <= 10) {
				System.out.println("<<��ӵ��� ����� ���>>\n");
				System.out.printf("���� : ����\n");
				System.out.println("����� : 300��\n");
				return;
			}
			else if(runtime > 10 && runtime <= 20) {
				System.out.println("<<��ӵ��� ����� ���>>\n");
				System.out.printf("���� : ����\n");
				System.out.println("����� : 500��\n");
				return;
			}
			else if(runtime > 20 && runtime <= 30) {
				System.out.println("<<��ӵ��� ����� ���>>\n");
				System.out.printf("���� : ����\n");
				System.out.println("����� : 700��\n");
				return;
			}
		}
		if(bustype == 2) {
			if(runtime <= 10) {
				System.out.println("<<��ӵ��� ����� ���>>\n");
				System.out.printf("���� : ��ӹ���\n");
				System.out.println("����� : 850��\n");
				return;
			}
			else if(runtime > 10 && runtime <= 20) {
				System.out.println("<<��ӵ��� ����� ���>>\n");
				System.out.printf("���� : ��ӹ���\n");
				System.out.println("����� : 1150��\n");
				return;
			}
			else if(runtime > 20 && runtime <= 30) {
				System.out.println("<<��ӵ��� ����� ���>>\n");
				System.out.printf("���� : ��ӹ���\n");
				System.out.println("����� : 1450��\n");
				return;
			}
		}
		if(bustype == 3) {
			if(runtime <= 10) {
				System.out.println("<<��ӵ��� ����� ���>>\n");
				System.out.printf("���� : �� ��\n");
				System.out.println("����� : 600��\n");
				return;
			}
			else if(runtime > 10 && runtime <= 20) {
				System.out.println("<<��ӵ��� ����� ���>>\n");
				System.out.printf("���� : �� ��\n");
				System.out.println("����� : 800��\n");
				return;
			}
			else if(runtime > 20 && runtime <= 30) {
				System.out.println("<<��ӵ��� ����� ���>>\n");
				System.out.printf("���� : �� ��\n");
				System.out.println("����� : 1000��\n");
				return;
			}
		}
		else {
			System.out.println("�ش�Ǵ� ������ �������� �ʽ��ϴ�.\n");
			return;
		}
	}
}
