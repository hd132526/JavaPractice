package org.dimigo.basic;

public class For {
	public static void main(String[] args) {
		/*
		System.out.println("<<��ȣ ����ϱ�>>");
		for(int i=1; i<=37; i++) {
			System.out.printf("%d�� ", i);
			if(i % 10 == 0) System.out.println("");
		}
		return;
		*/
		/*
		System.out.println("<<������ ����ϱ�>>\n");
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d    ", i, j, i*j);
			}
			System.out.println("");
		}
		*/
		
		String[] member = {"���缮", "������", "�ڸ��", "����", "������"};
		System.out.println("<<���ѵ������>>");
		for(String name : member) {
			System.out.println(name);
		}
	}
}