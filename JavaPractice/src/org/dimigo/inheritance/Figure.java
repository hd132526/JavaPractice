/**
 * 
 */
package org.dimigo.inheritance;

/**
	JavaClass 
	-org.dimigo.inheritance 
	--Figure.java
	@date : 2015. 8. 17.
	@author : 이승현
	@version : 1.0
 */
public class Figure {
	private int centerX;
	private int centerY;
	
	public Figure (int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	protected double calcArea() {
		return 0.0;
	}

	protected void printCenter() {
		System.out.println("중심 좌표 : (" + centerX + ", " + centerY + ")");
	}
	
	protected void moveFigure(int x, int y) {
		centerX += x;
		centerY += y;
	}
	
}

