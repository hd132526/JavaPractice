/**
 * 
 */
package org.dimigo.oop;

/**
	JavaPractice 
	-org.dimigo.oop 
	--PiggyBank.java
	@date : 2015. 6. 12.
	@author : 이승현
	@version : 1.0
 */
public class PiggyBank {
	static int balance=0;
	
	public static void putMoney(FamilyMember member, int amount) {
		System.out.println(member.getMemberName() + " " + amount + "원" + " 넣음");
		balance = balance + amount;
	}
	
	public static void printBalance() {
		System.out.println("돼지저금통 총 금액 : " + balance + "원");
	}
	
	
}
