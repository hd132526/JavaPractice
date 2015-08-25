/**
 * 
 */
package org.dimigo.inheritance;

/**
	JavaClass 
	-org.dimigo.inheritance 
	--Circle.java
	@date : 2015. 8. 17.
	@author : 이승현
	@version : 1.0
 */
public class Circle extends Figure {
	int radius;
	
	public Circle(int radius) {
		super(0,0);
		this.radius = radius;
	}
	
	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}
	
	protected void printCenter() {
		System.out.printf("원 ");
		super.printCenter();
	}
	
	protected double calcArea() {
		return radius*radius*Math.PI;
	}
}
