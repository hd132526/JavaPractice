/**
 * 
 */
package org.dimigo.oop;

/**
	JavaPractice 
	-org.dimigo.oop 
	--CarTest.java
	@date : 2015. 4. 13.
	@author : �̽���
	@version : 1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.setCompany("�����ڵ���");
		car1.setModel("���׽ý�");
		car1.setColor("������");
		car1.setMaxSpeed(225);
		car1.setPrice(50000000);
		
		car2.setCompany("����ڵ���");
		car2.setModel("K7");
		car2.setColor("���");
		car2.setMaxSpeed(246);
		car2.setPrice(46000000);
	
		car3.setCompany("�Ｚ�ڵ���");
		car3.setModel("SM7");
		car3.setColor("ȸ��");
		car3.setMaxSpeed(200);
		car3.setPrice(38000000);
		
		System.out.println("<<�ڵ��� ���>>");
		System.out.println(car1.getCompany());
		System.out.println(car1.getModel());
		System.out.println(car1.getColor());
		System.out.println(car1.getMaxSpeed());
		System.out.println(String.format("%,d", car1.getPrice()));
		
		System.out.println("<<�ڵ��� ���>>");
		System.out.println(car2.getCompany());
		System.out.println(car2.getModel());
		System.out.println(car2.getColor());
		System.out.println(car2.getMaxSpeed());
		System.out.println(String.format("%,d", car2.getPrice()));
		
		System.out.println("<<�ڵ��� ���>>");
		System.out.println(car3.getCompany());
		System.out.println(car3.getModel());
		System.out.println(car3.getColor());
		System.out.println(car3.getMaxSpeed());
		System.out.println(String.format("%,d", car3.getPrice()));
	}

}