package org.dimigo.basic;

public class For {
	public static void main(String[] args) {
		/*
		System.out.println("<<번호 출력하기>>");
		for(int i=1; i<=37; i++) {
			System.out.printf("%d번 ", i);
			if(i % 10 == 0) System.out.println("");
		}
		return;
		*/
		/*
		System.out.println("<<구구단 출력하기>>\n");
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d    ", i, j, i*j);
			}
			System.out.println("");
		}
		*/
		
		String[] member = {"유재석", "정준하", "박명수", "하하", "정현돈"};
		System.out.println("<<무한도전멤버>>");
		for(String name : member) {
			System.out.println(name);
		}
	}
}