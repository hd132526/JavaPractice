/**
 * 
 */
package org.dimigo.oop;

/**
	JavaPractice 
	-org.dimigo.oop 
	--SnackTest.java
	@date : 2015. 5. 18.
	@author : 이승현
	@version : 1.0
 */
public class SnackTest {
	public static void main(String args[]) {		
				Snack[] snArr = new Snack[] {
				new Snack("새우깡", "농심", 1100, 2), 
				new Snack("콘칲", "크라운", 1200, 1),
				new Snack("허니버터칩", "해태", 1500, 4)
				};
				
				int sum = 0;
				
				for(Snack value: snArr) {
					value.printSnack();
					sum += value.calcPrice();
				}
				System.out.println("총 가격 : " + String.format("%,d ", sum) + "원");
	} 
}
