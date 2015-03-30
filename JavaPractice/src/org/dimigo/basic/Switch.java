package org.dimigo.basic;

public class Switch {
	public static void main(String[] args) {
		
		int num = 100;
		switch (num % 2) {
		case 0:
			System.out.println("짝수입니다.\n");
			break;
		case 1:
			System.out.println("홀수입니다.\n");
			break;
		default:
			System.out.println("넌 누구니!\n");
			break;
		}
		
		String season="봄";
		switch(season) {
		case "봄":
			System.out.println("봄\n");
			break;
		case "여름":
			System.out.println("여름\n");
			break;
		case "가을":
			System.out.println("가을\n");
			break;
		case "겨울":
			System.out.println("겨울\n");
			break;
		}
	}
}
