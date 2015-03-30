package org.dimigo.basic;

import java.util.Scanner;

public class Break {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int menu;
		do {
			System.out.println("-----------------");
			System.out.println("<< 게임 메뉴>>\n");
			System.out.println("1. 공격");
			System.out.println("2. 수비");
			System.out.println("3. 종료");
			System.out.println("-----------------");
			System.out.print("메뉴 입력 =>");
			
			menu = scanner.nextInt();
			
			switch(menu) {
			case 1: 
				System.out.println("배주웅을 공격하라\n");
				break;
			case 2:
				System.out.println("김현성을 수비하라\n");
				break;
			case 3:
				System.out.println("도망간다\n");
				scanner.close();
				break;
			default:
				System.out.println("없는 메뉴입니다\n");
			}
			if(menu == 3) {
				return;
			}
		} while(true);
	} 
}