package org.dimigo.basic;

public class TypeCasting {
	public static void main(String[] args) {
		int give = 1700000;
		int member = 3;
		int shop = 1500;
		long value = (long) give * (long) member * (long) shop * 12;
		System.out.println("연간인건비 : " + 
		String.format("%,d", value));
	}
}