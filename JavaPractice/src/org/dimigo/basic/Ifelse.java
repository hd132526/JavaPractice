package org.dimigo.basic;

public class Ifelse {
	public static void main(String[] args)
	{
		// Hello World! I love HelloWorld I want to go to the HelloWorld
		// 0~6 유아기 / 7~12 : 아동기 / 13~15 사춘기 / 16~24 청년기 / 25~ 
		int age = 18;
		
		if(age < 0) {
			System.out.println("양수만 입력하세요.\n");
			return;
		} 
		else if(age <= 6 && age >= 0) {
			System.out.println("유아기\n");
		}
		else if(age >= 7 && age <= 12) {
			System.out.println("아동기\n");
		}
		else if(age >= 13 && age <= 15) {
			System.out.println("사춘기\n");
		}
		else if(age >= 16 && age <=24 ) {
			System.out.println("청년기\n");
		}
		else if(age >= 25) {
			System.out.println("늙었네 늙었어;;;");
		}
	}
}
