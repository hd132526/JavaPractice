/**
 * 
 */
package org.dimigo.abstractclass;

/**
	JavaClass 
	-org.dimigo.inheritance 
	--SmartPhoneTest.java
	@date : 2015. 8. 25.
	@author : 이승현
	@version : 1.0
 */
public class SmartPhoneTest {
	public static void main(String args[]) {
		Galaxy g = new Galaxy("갤럭시 S6", "삼성", 650000);
		IPhone i = new IPhone("아이폰 6", "애플", 700000);
		
		System.out.println(i.toString());
		i.turnOn();
		i.useSpecialFunction(i);
		i.pay();
		i.turnOff();
		
		System.out.println();
		
		System.out.println(g.toString());
		g.turnOn();
		g.useSpecialFunction(g);
		g.pay();
		g.turnOff();
		
	}
}
