package org.dimigo.basic;

import java.util.Scanner;

public class While {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int menu;
		do {
			System.out.println("-----------------");
			System.out.println("<< ���� �޴�>>\n");
			System.out.println("1. ����");
			System.out.println("2. ����");
			System.out.println("3. ����");
			System.out.println("-----------------");
			System.out.print("�޴� �Է� =>");
			
			menu = scanner.nextInt();
			
			switch(menu) {
			case 1: 
				System.out.println("���ֿ��� �����϶�\n");
				break;
			case 2:
				System.out.println("�������� �����϶�\n");
				break;
			case 3:
				System.out.println("��������\n");
				scanner.close();
				break;
			default:
				System.out.println("���� �޴��Դϴ�\n");
			}
		} while(menu != 3);
		
	} 
}