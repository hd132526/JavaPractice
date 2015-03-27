package org.dimigo.basic;

public class Loop {
	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(i == j) System.out.printf("*");
				System.out.printf("%d",j);
			}
			System.out.printf("\n");
		}
	}
}
