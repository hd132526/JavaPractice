package org.dimigo.basic;

public class Ifelse {
	public static void main(String[] args)
	{
		// Hello World! I love HelloWorld I want to go to the HelloWorld
		// 0~6 ���Ʊ� / 7~12 : �Ƶ��� / 13~15 ����� / 16~24 û��� / 25~ 
		int age = 18;
		
		if(age < 0) {
			System.out.println("����� �Է��ϼ���.\n");
			return;
		} 
		else if(age <= 6 && age >= 0) {
			System.out.println("���Ʊ�\n");
		}
		else if(age >= 7 && age <= 12) {
			System.out.println("�Ƶ���\n");
		}
		else if(age >= 13 && age <= 15) {
			System.out.println("�����\n");
		}
		else if(age >= 16 && age <=24 ) {
			System.out.println("û���\n");
		}
		else if(age >= 25) {
			System.out.println("�ľ��� �ľ���;;;");
		}
	}
}
