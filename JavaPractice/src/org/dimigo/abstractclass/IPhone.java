/**
 * 
 */
package org.dimigo.abstractclass;

/**
	JavaClass 
	-org.dimigo.inheritance 
	--IPhone.java
	@date : 2015. 8. 25.
	@author : 이승현
	@version : 1.0
 */
public class IPhone extends SmartPhone {
	public IPhone() {
		
	}
	
	public IPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void pay() {
		System.out.println("애플 페이로 결제합니다.");
	}
	
	public void useAirDrop() {
		System.out.println("AirDrop 기능을 사용합니다.");
	}
}
