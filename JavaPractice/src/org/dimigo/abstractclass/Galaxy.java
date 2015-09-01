/**
 * 
 */
package org.dimigo.abstractclass;

/**
	JavaClass 
	-org.dimigo.inheritance 
	--Galaxy.java
	@date : 2015. 8. 25.
	@author : 이승현
	@version : 1.0
 */
public class Galaxy extends SmartPhone {
	public Galaxy() {
		
	}
	
	public Galaxy(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void pay() {
		System.out.println("삼성 페이로 결제합니다.");
	}
	
	public void useWirelessCharging() {
		System.out.println("무선 충전 기능을 이용합니다.");
	}
}
