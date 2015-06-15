/**
 * 
 */
package org.dimigo.oop;

/**
	JavaPractice 
	-org.dimigo.oop 
	--PirggyBankTest.java
	@date : 2015. 6. 12.
	@author : 이승현
	@version : 1.0
 */
public class PirggyBankTest {
	public static void main(String[] args) {
		FamilyMember[] fam = {
				new FamilyMember("아빠"), new FamilyMember("엄마"), new FamilyMember("나"), new FamilyMember("남동생")
		};
		
		PiggyBank.putMoney(fam[0], 10000);
		PiggyBank.putMoney(fam[1], 5000);
		PiggyBank.putMoney(fam[2], 2000);
		PiggyBank.putMoney(fam[3], 1000);
		PiggyBank.printBalance();
		PiggyBank.putMoney(fam[2], 1000);
		PiggyBank.printBalance();
	}
}
