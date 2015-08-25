/**
 * 
 */
package org.dimigo.inheritance;

/**
	JavaClass 
	-org.dimigo.inheritance 
	--Rectangle.java
	@date : 2015. 8. 17.
	@author : 이승현
	@version : 1.0
 */
public class Rectangle extends Figure {
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		super(0,0);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(int centerX, int centerY, int width, int height) {
		super(centerX , centerY);
		this.width = width;
		this.height = height;
	}
	
	protected void printCenter() {
		System.out.printf("사각형 ");
		super.printCenter();
	}
	
	protected double calcArea() {
		return width*height;
	}
}
